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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

public class QsarManager implements IQsarManager{

    private static final Logger logger = Logger.getLogger(QsarManager.class);

	DescriptorModel model;

	public String getNamespace() {
		return "qsar";
	}
	
	

	/*====================================================
	 * model initialization from EP below
	 * ====================================================
	 */

	public DescriptorModel getModel() {
		if (model==null) readModelFromEP();
		return model;
	}



	/**
	 * Populate model from Extension Point.
	 */
	private void readModelFromEP() {
		
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
        .getExtensionPoint("net.bioclipse.qsar.descriptorProvider");

        IExtension[] serviceObjectExtensions
        = serviceObjectExtensionPoint.getExtensions();

        
        model=new DescriptorModel();

        //New lists
        List<DescriptorCategory> catlist = new ArrayList<DescriptorCategory>();
        model.setCategories(catlist);

        List<DescriptorProvider> provlist = new ArrayList<DescriptorProvider>();
        model.setProviders(provlist);


        addCategories(serviceObjectExtensions, catlist);
        addProviders(serviceObjectExtensions, provlist);
		
		
		
	}

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

	private void addProviders(IExtension[] serviceObjectExtensions,
			List<DescriptorProvider> provlist) {

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
                    provider.setDescriptors(new ArrayList<Descriptor>());
                    for( IConfigurationElement providerChild
                            : element.getChildren("descriptor") ) {
                    	
                        String did=providerChild.getAttribute("id");
                        String dname=providerChild.getAttribute("name");

                        Descriptor desc=new Descriptor(did, dname);
                        String dicon=providerChild.getAttribute("icon");
                        desc.setIcon_path(dicon);

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

                        String dcat=providerChild.getAttribute("category");
                        DescriptorCategory foundcat=null;
                        for (DescriptorCategory cat : getFullCategories()){
                        	if (cat.getId().equals(dcat)){
                        		foundcat=cat;
                        	}
                        }
                        if (foundcat!=null){
                        	desc.setCategory(foundcat);
                        }else {
                        	logger.error("Descriptor category: " + dcat + 
                          " for the descriptor: " + did + "could not be found");
                        }
                        
                        //Get descriptor children
                        Map<String, String> pParams=new HashMap<String, String>(); 
                        for( IConfigurationElement param
                                : providerChild.getChildren("parameter") ) {

                            String pakey=param.getAttribute("key");
                            String padef=param.getAttribute("defaultvalue");
                            pParams.put(pakey, padef);
                        	
                        }
                        //Only set parameters if we have any
                        if (pParams.size()>0) desc.setParameters(pParams);
                        
                        
                        //Add parent provider to descriptor
                        desc.setProvider(provider);
                        
                        provider.getDescriptors().add(desc);
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
		
		if (model==null) readModelFromEP();
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
		
		if (model==null) readModelFromEP();
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
		if (model==null) readModelFromEP();
		return model.getCategories();
	}

	/**
	 * Get all descriptor providers. Read from EP if not initialized.
	 * @return List of providers.
	 */
	public List<DescriptorProvider> getFullProviders() {
		if (model==null) readModelFromEP();
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
	 * Get all descriptor IDs for a provider.
	 * @return List of descriptor IDs or empty List.
	 */
	public List<String> getDescriptors(String providerID) {

		DescriptorProvider provider = getProviderByID(providerID);
		List<String> ret=new ArrayList<String>();
		for (Descriptor desc : provider.getDescriptors()){
			ret.add(desc.getId());
		}

		return ret;
	}

	/**
	 * Get all descriptors for a provider.
	 * @return List of descriptors
	 */
	public List<Descriptor> getDescriptors(DescriptorProvider provider) {
		return provider.getDescriptors();
	}

	/**
	 * Get all descriptor IDs for a provider and within a certain category.
	 * @return List of descriptor IDs or empty List.
	 */
	public List<String> getDescriptors(String providerID, String categoryID) {
		DescriptorProvider provider=getProviderByID(providerID);
		DescriptorCategory cat=getCategoryByID(categoryID);

		List<String> ret= new ArrayList<String>();
		for (Descriptor desc : provider.getDescriptors()){
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
	public List<Descriptor> getDescriptors(DescriptorProvider provider,
			DescriptorCategory category) {
		List<Descriptor> descriptors=new ArrayList<Descriptor>();
		for (Descriptor desc : provider.getDescriptors()){
			if (desc.getCategory()==category){
				descriptors.add(desc);
			}
		}
		return descriptors;
	}

	public List<Descriptor> getDescriptorsInCategory(DescriptorCategory category) {
		
		List<Descriptor> allDescs=new ArrayList<Descriptor>();
		for (DescriptorProvider provider : getFullProviders()){
			allDescs.addAll(getDescriptors(provider, category));
		}
		return allDescs;
	}


	public Descriptor getDescriptor(String descriptorID) {
		
		for (DescriptorProvider provider : getFullProviders()){
			for (Descriptor desc : provider.getDescriptors()){
				if (desc.getId().equals(descriptorID)){
					return desc;
				}
			}
		}
		
		throw new NoSuchElementException("Could not find a descriptor with id: " 
				+ descriptorID);
		
	}

	public boolean existsDescriptor(String descriptorID) {
		
		for (DescriptorProvider provider : getFullProviders()){
			for (Descriptor desc : provider.getDescriptors()){
				if (desc.getId().equals(descriptorID)){
					return true;
				}
			}
		}

		return false;
		
	}


	/*====================================================
	 * Calculations below
	 * ====================================================
	 */

	public List<IDescriptorResult> calculate(IMolecule molecule, String descriptorID) {

		Descriptor desc=getDescriptor(descriptorID);
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
				Descriptor desc=getDescriptor(descriptorID);
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
