/*******************************************************************************
 * Copyright (c) 2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth
 *     
 ******************************************************************************/
package net.bioclipse.qsar.business;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.IDescriptorCalculator;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

public class QsarManager implements IQsarManager{

    private static final Logger logger = Logger.getLogger(QsarManager.class);


	private static final String DESCRIPTOR_EXTENSION_POINT = 
					"net.bioclipse.qsar.descriptorProvider";

	//The descriptor model
	DescriptorModel model;

	//For console namespace
	public String getNamespace() {
		return "qsar";
	}
	
	

	/*====================================================
	 * model initialization from EP below
	 * ====================================================
	 */

	public DescriptorModel getModel() {
		if (model==null) initializeDescriptorModel();
		return model;
	}

	
	/**
	 * Populate model from OWL Ontology and Extension Point.
	 */
	private void initializeDescriptorModel() {

		//Firstly, build hierarchy from descriptor OWL with Jena
		try {
			model=JenaReader.populateHierarchy();
		} catch (IOException e) {
			logger.error("Could not initialize Jena model: " + e.getMessage());
//			e.printStackTrace();
			return;
		} catch (URISyntaxException e) {
			logger.error("Could not initialize Jena model: " + e.getMessage());
//			e.printStackTrace();
			return;
		}
		if (model==null){
			logger.error("Could not initialize Jena model. ");
			return;
		}

		//Create new list of providers
        List<DescriptorProvider> provlist = new ArrayList<DescriptorProvider>();
        model.setProviders(provlist);

//        //Add categories from extension point
//        addCategories(serviceObjectExtensions, catlist);
//TODO: might be used to complement categories from ontology at later point

        //Add descriptor providers and implementations from extension point
        addProvidersAndDescriptorImpls(provlist);
		
	}

	
	/**
	 * Remnant from when categories were contributed by extension points.
	 * Could possibly be used in future to complement Ontology at runtime.
	 * @param serviceObjectExtensions
	 * @param catlist
	 */
	@Deprecated
	private void addCategories(IExtension[] serviceObjectExtensions,
			List<DescriptorCategory> catlist) {

        for(IExtension extension : serviceObjectExtensions) {
            for( IConfigurationElement element
                    : extension.getConfigurationElements() ) {

                if (element.getName().equals("category")){

                    String pid=element.getAttribute("id");
                    String pname=element.getAttribute("name");

                    DescriptorCategory category=new DescriptorCategory(pid, pname);
                    String picon=element.getAttribute("icon");
                    category.setIcon_path(picon);
                    
                    catlist.add(category);
                    
                    logger.debug("Added descriptor category: " + pname);
					
                }

            }
        }
	}

	/**
	 * Add descriptor providers and their implementations. Requires that 
	 * categories are properly intialized before from ontology. 
	 * @param provlist The List to add providers to
	 */
	private void addProvidersAndDescriptorImpls(List<DescriptorProvider> provlist) {

		//Initialize implementations via extension points
        IExtensionRegistry registry = Platform.getExtensionRegistry();

        if ( registry == null )
            throw new RuntimeException("Registry is null, no services can " +
            "be read. Workbench not started?");
        // it likely means that the Eclipse workbench has not
        // started, for example when running tests

		/*
         * service objects
         */
        IExtensionPoint serviceObjectExtensionPoint = registry
        .getExtensionPoint(DESCRIPTOR_EXTENSION_POINT);

        IExtension[] serviceObjectExtensions
        = serviceObjectExtensionPoint.getExtensions();
		
		
        for(IExtension extension : serviceObjectExtensions) {
            for( IConfigurationElement element
                    : extension.getConfigurationElements() ) {

                if (element.getName().equals("provider")){

					try {
                    String pid=element.getAttribute("id");
                    String pname=element.getAttribute("name");

                    DescriptorProvider provider=new DescriptorProvider(pid, pname);
                    String picon=element.getAttribute("icon");
                    provider.setIcon_path(picon);
                    
                    IDescriptorCalculator calculator;
						calculator = (IDescriptorCalculator) 
									element.createExecutableExtension("calculator");
	                    provider.setCalculator(calculator);

                    String cml=element.getAttribute("acceptsCml");
                    if (cml!=null){
                    	if (cml.equalsIgnoreCase("true")){
                    		provider.setAcceptsCml(true);
                    	}
                    	else{
                    		//If not explicitly true, then false
                    		provider.setAcceptsCml(false);
                    	}
                    }

                    String molfile=element.getAttribute("acceptsMolfile");
                    if (molfile!=null){
                    	if (molfile.equalsIgnoreCase("true")){
                    		provider.setAcceptsMolfile(true);
                    	}
                    	else{
                    		//If not explicitly true, then false
                    		provider.setAcceptsMolfile(false);
                    	}
                    }

                    String smiles=element.getAttribute("acceptsSmiles");
                    if (smiles!=null){
                    	if (smiles.equalsIgnoreCase("true")){
                    		provider.setAcceptsSmiles(true);
                    	}
                    	else{
                    		//If not explicitly true, then false
                    		provider.setAcceptsSmiles(false);
                    	}
                    }
                    
                    //Get descriptor children
                    provider.setDescriptorImpls(new ArrayList<DescriptorImpl>());
                    for( IConfigurationElement providerChild
                            : element.getChildren("descriptorImpl") ) {
                    	
                        String did=providerChild.getAttribute("id");
                        String dname=providerChild.getAttribute("name");

                        DescriptorImpl desc=new DescriptorImpl(did, dname);
                        String dicon=providerChild.getAttribute("icon");
                        desc.setIcon_path(dicon);

                        String ddef=providerChild.getAttribute("definition");
                        desc.setDefinition(ddef);

                        String ddesc=providerChild.getAttribute("description");
                        desc.setDescription(ddesc);

                        String req3d=providerChild.getAttribute("requires3D");
                        if (req3d!=null){
                        	if (req3d.equalsIgnoreCase("true")){
                        		desc.setRequires3D(true);
                        	}
                        	else{
                        		//If not explicitly true, then false
                        		desc.setRequires3D(false);
                        	}
                        }

//                        String dcat=providerChild.getAttribute("category");
//                        DescriptorCategory foundcat=null;
//                        for (DescriptorCategory cat : getFullCategories()){
//                        	if (cat.getId().equals(dcat)){
//                        		foundcat=cat;
//                        	}
//                        }
//                        if (foundcat!=null){
//                        	desc.setCategory(foundcat);
//                        }else {
//                        	logger.error("Descriptor category: " + dcat + 
//                          " for the descriptor: " + did + "could not be found");
//                        }
                        
                        //Get descriptor children=parameters
                        List<DescriptorParameter> pparams=new ArrayList<DescriptorParameter>();
                        for( IConfigurationElement param
                                : providerChild.getChildren("parameter") ) {

                            String pakey=param.getAttribute("key");
                            String padef=param.getAttribute("defaultvalue");
                            DescriptorParameter dparam=new DescriptorParameter(pakey, padef);

                            String padescr=param.getAttribute("description");
                        	dparam.setDescription(padescr);

                        	pparams.add(dparam);
                        }
                        if (pparams.size()>0)
                    	desc.setParameters(pparams);
                        
                        
                        
                        //Add parent provider to descriptor
                        desc.setProvider(provider);
                        
                        provider.getDescriptorImpls().add(desc);
                        logger.debug("  Added descriptor: " + dname);

                    }
                   
                    provlist.add(provider);
                    logger.debug("Added descriptor provider: " + pname);
                    
					} catch (CoreException e) {
						logger.error("Could not initialize EP. Reason: " + e.getMessage());
						e.printStackTrace();
					}

					

                }

            }
        }
	}

	
	/*====================================================
	 * Getter/setter for model below
	 * ====================================================
	 */
	

	/**
	 * Get all descriptor categories. Read from EP if not initialized.
	 * @return List<String> of category ID's.
	 */
	public List<String> getCategories() {
		
		if (model==null) initializeDescriptorModel();
		List<String> ret=new ArrayList<String>();
		for (DescriptorCategory cat : model.getCategories()){
			ret.add(cat.getId());
		}

		return ret;
	}

	/**
	 * Get all descriptor providers. Read from EP if not initialized.
	 * @return List<String> of provider ID's.
	 */
	public List<String> getProviders() {
		
		if (model==null) initializeDescriptorModel();
		List<String> ret=new ArrayList<String>();
		for (DescriptorProvider prov : model.getProviders()){
			ret.add(prov.getId());
		}

		return ret;
	}

	/**
	 * Get all descriptor categories. Read from EP if not initialized.
	 * @return List of categories.
	 */
	public List<DescriptorCategory> getFullCategories() {
		if (model==null) initializeDescriptorModel();
		return model.getCategories();
	}

	/**
	 * Get all descriptor providers. Read from EP if not initialized.
	 * @return List of providers.
	 */
	public List<DescriptorProvider> getFullProviders() {
		if (model==null) initializeDescriptorModel();
		return model.getProviders();
	}

	/**
	 * @param providerID the ID of the provider
	 * @return provider or null if not found
	 */
	public DescriptorProvider getProviderByID(String providerID) {
		
		for (DescriptorProvider prov : getFullProviders() ){
			if (prov.getId().equals(providerID)){
				return prov;
			}
		}
		return null;
	}

	/**
	 * @param categoryID the ID of the category
	 * @return category or null if not found
	 */
	public DescriptorCategory getCategoryByID(String categoryID) {
		for (DescriptorCategory cat: getFullCategories() ){
			if (cat.getId().equals(categoryID)){
				return cat;
			}
		}
		return null;
	}

	/**
	 * Get all available descriptors.
	 * @return List of descriptor IDs or empty List.
	 */
	public List<String> getDescriptors() {
		//Collect all descriptors
		List<String> ret=new ArrayList<String>();
		for (Descriptor desc: getFullDescriptors()){
			ret.add(desc.getId());
		}

		return ret;
	}
	
	public Descriptor getDescriptorByID(String descriptorID) {

		for (Descriptor desc : getFullDescriptors()){
			if (desc.getId().equals(descriptorID))
				return desc;
		}

		return null;
	}

	
	/**
	 * Get all available descriptors.
	 * @return List of descriptor IDs or empty List.
	 */
	public List<Descriptor> getFullDescriptors() {
		//Collect all descriptors
		List<Descriptor> ret=new ArrayList<Descriptor>();
		for (DescriptorCategory cat : getFullCategories()){
			if (cat.getDescriptors()!=null){
				for (Descriptor desc : cat.getDescriptors()){
					ret.add(desc);
				}
			}
		}

		//Remove duplicates
		Set<Descriptor> noDups=new LinkedHashSet<Descriptor>(ret);
		List<Descriptor> noDupsList=new ArrayList<Descriptor>(noDups);

		return noDupsList;
	}


	/**
	 * Get all descriptors in a category
	 * @return List of descriptors or empty List.
	 */
	public List<Descriptor> getDescriptors(DescriptorCategory category) {
		return category.getDescriptors();
	}

	/**
	 * Get all descriptor IDs in a category
	 * @return List of descriptor IDs or empty List.
	 */
	public List<String> getDescriptors(String categoryID) {
		DescriptorCategory category=getCategoryByID(categoryID);

		//Collect all descriptors
		List<String> ret=new ArrayList<String>();
		for (Descriptor desc: category.getDescriptors()){
			ret.add(desc.getId());
		}

		return ret;
	}

	
	/**
	 * Get all descriptor implementation IDs for a provider.
	 * @return List of descriptor implementation IDs or empty List.
	 */
	public List<String> getDescriptorImplsByProvider(String providerID) {

		DescriptorProvider provider = getProviderByID(providerID);
		List<String> ret=new ArrayList<String>();
		for (DescriptorImpl desc : provider.getDescriptorImpls()){
			ret.add(desc.getId());
		}

		return ret;
	}

	/**
	 * Get all descriptor implementations for a provider.
	 * @return List of descriptors
	 */
	public List<DescriptorImpl> getFullDescriptorImpls(DescriptorProvider provider) {
		return provider.getDescriptorImpls();
	}

	/**
	 * Get all descriptor implementations for a provider.
	 * @return List of descriptors
	 */
	public List<DescriptorImpl> getFullDescriptorImpls() {
		List<DescriptorImpl> ret=new ArrayList<DescriptorImpl>();
		for (DescriptorProvider prov : getFullProviders()){
			if (prov.getDescriptorImpls()!=null)
				ret.addAll(prov.getDescriptorImpls());
		}
		return ret;
	}


	/**
	 * Return list of implIDs for a given a descriptorID
	 */
	public List<String> getDescriptorImpls(String descriptorID) {
		List<String> ret= new ArrayList<String>();
		for (DescriptorImpl impl : getFullDescriptorImpls()){
			if (impl.getDefinition().equals(descriptorID))
				ret.add(impl.getId());
		}
		return ret;
	}
	
	/**
	 * Return list of descriptorImpls for a given a descriptorID
	 */
	public List<DescriptorImpl> getDescriptorImplsForDescriptor(String descriptorID) {
		List<DescriptorImpl> ret= new ArrayList<DescriptorImpl>();
		for (DescriptorImpl impl : getFullDescriptorImpls()){
			if (impl.getDefinition().equals(descriptorID))
				ret.add(impl);
		}
		return ret;
	}
	
	
	public DescriptorImpl getDescriptorImplByID(String descriptorImplID) {
		
		for (DescriptorProvider provider : getFullProviders()){
			for (DescriptorImpl desc : provider.getDescriptorImpls()){
				if (desc.getId().equals(descriptorImplID)){
					return desc;
				}
			}
		}
		
		throw new NoSuchElementException("Could not find a descriptor with id: " 
				+ descriptorImplID);
		
	}

	public boolean existsDescriptor(String descriptorID) {
		
		for (DescriptorProvider provider : getFullProviders()){
			for (DescriptorImpl desc : provider.getDescriptorImpls()){
				if (desc.getId().equals(descriptorID)){
					return true;
				}
			}
		}

		return false;
		
	}

	
	/*
	 * Below are necessary?
	 * 
	 * 
	 */
	
	
	
	/**
	 * Get all descriptor implementation IDs for a provider and within a 
	 * certain category.
	 * @return List of descriptor IDs or empty List.
	 */
	public List<String> getDescriptorImpls(String providerID, String categoryID) {

		DescriptorProvider provider=getProviderByID(providerID);
		DescriptorCategory cat=getCategoryByID(categoryID);

		List<String> ret= new ArrayList<String>();
		for (DescriptorImpl desc : provider.getDescriptorImpls()){
			if (desc.getCategory()==cat){
				ret.add(desc.getId());
			}
		}
		return ret;
	}


	/**
	 * Get all descriptors for a provider and within a certain category.
	 * @return List of descriptors or empty List.
	 */
	public List<DescriptorImpl> getDescriptors(DescriptorProvider provider,
			DescriptorCategory category) {
		List<DescriptorImpl> descriptors=new ArrayList<DescriptorImpl>();
		for (DescriptorImpl desc : provider.getDescriptorImpls()){
			if (desc.getCategory()==category){
				descriptors.add(desc);
			}
		}
		return descriptors;
	}






	/*====================================================
	 * Calculations below
	 * ====================================================
	 */

	public List<IDescriptorResult> calculate(IMolecule molecule, String descriptorID) {

		DescriptorImpl desc=getDescriptorImplByID(descriptorID);
		DescriptorProvider provider=desc.getProvider();

		IDescriptorCalculator calculator=provider.getCalculator();
		
		List<IMolecule> mollist=new ArrayList<IMolecule>();
		mollist.add(molecule);

		List<String> descIDlist=new ArrayList<String>();
		descIDlist.add(descriptorID);

		Map<IMolecule, List<IDescriptorResult>> retMap = calculator.calculateDescriptor(mollist, descIDlist);
		if (retMap==null || retMap.size()<1){
			throw new NoSuchElementException("Calculation did not return a result");
		}
		List<IDescriptorResult> res=retMap.get(molecule);
		if (res==null || res.size()<=0)
			throw new NoSuchElementException("Calculation returned empty result");

		return res;
		
	}

	public Map<IMolecule, List<IDescriptorResult>> calculate(List<IMolecule> molecules,
			List<String> descriptors) {

		Map<IMolecule, List<IDescriptorResult>> allResults=
			 						new HashMap<IMolecule, List<IDescriptorResult>>();
		
		//The problem is to collect all descriptor ID's and group by provider
		//Loop over all providers
		for (DescriptorProvider provider : getFullProviders()){
			
			List<String> descriptorsToCalculate=new ArrayList<String>();

			//Check if this descriptor is here, add if so
			for (String descriptorID : descriptors){
				DescriptorImpl desc=getDescriptorImplByID(descriptorID);
				if (desc.getProvider()==provider){
					descriptorsToCalculate.add(descriptorID);
				}
			}
			
			//If we have descs to calculate, do so
			if (descriptorsToCalculate.size()>0){
				IDescriptorCalculator calculator=provider.getCalculator();
				Map<IMolecule, List<IDescriptorResult>> results = 
						calculator.calculateDescriptor(molecules, 
													   descriptorsToCalculate);
				
				//Add these results to the molecule
				for (IMolecule mol : results.keySet()){
					if (allResults.get(mol)==null) allResults.put(mol, new ArrayList<IDescriptorResult>());
					List<IDescriptorResult> reslist=allResults.get(mol);
					
					//Add the computed result to the reslist
					reslist.addAll(results.get(mol));
				}
				
			}
			
		}

		return allResults;
	}




	
	
}
