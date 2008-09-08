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
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.ParameterType;
import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.descriptor.IDescriptorCalculator;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;
import net.bioclipse.qsar.init.Activator;
import net.bioclipse.qsar.prefs.QSARPreferenceInitializer;
import net.bioclipse.qsar.prefs.QsarPreferenceHelper;
import net.bioclipse.qsar.util.QsarAdapterFactory;

public class QsarManager implements IQsarManager{

    private static final Logger logger = Logger.getLogger(QsarManager.class);


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
			logger.debug("** descriptor model initialized from ontology **");
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
        .getExtensionPoint(QSARConstants.DESCRIPTOR_EXTENSION_POINT);

        IExtension[] serviceObjectExtensions
        = serviceObjectExtensionPoint.getExtensions();
		
		
        for(IExtension extension : serviceObjectExtensions) {
            for( IConfigurationElement element
                    : extension.getConfigurationElements() ) {

                if (element.getName().equals(QSARConstants.PROVIDER_ELEMENT_NAME)){

					try {
                    String pid=element.getAttribute("id");
                    String pname=element.getAttribute("name");

                    DescriptorProvider provider=new DescriptorProvider(pid, pname);
                    String picon=element.getAttribute("icon");
                    provider.setIcon_path(picon);
                    
                    String pshortname=element.getAttribute("shortName");
                    provider.setShortName(pshortname);

                    String pvendor=element.getAttribute("vendor");
                    provider.setVendor(pvendor);

                    String pvers=element.getAttribute("version");
                    provider.setVersion(pvers);

                    String pns=element.getAttribute("namespace");
                    provider.setNamesapce(pns);
                    
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
                            : element.getChildren(QSARConstants.DESCRIMPL_ELEMENT_NAME) ) {
                    	
                        String did=providerChild.getAttribute("id");
                        String dname=providerChild.getAttribute("name");

                        DescriptorImpl descImpl=new DescriptorImpl(did, dname);
                        String dicon=providerChild.getAttribute("icon");
                        descImpl.setIcon_path(dicon);

                        String ddef=providerChild.getAttribute("definition");
                        descImpl.setDefinition(ddef);

                        String ddesc=providerChild.getAttribute("description");
                        descImpl.setDescription(ddesc);
                        
                        String dns=element.getAttribute("namespace");
                        descImpl.setNamesapce(dns);


                        String req3d=providerChild.getAttribute("requires3D");
                        if (req3d!=null){
                        	if (req3d.equalsIgnoreCase("true")){
                        		descImpl.setRequires3D(true);
                        	}
                        	else{
                        		//If not explicitly true, then false
                        		descImpl.setRequires3D(false);
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
                                : providerChild.getChildren(QSARConstants.PARAMETER_ELEMENT_NAME) ) {

                            String pakey=param.getAttribute("key");
                            String padef=param.getAttribute("defaultvalue");
                            DescriptorParameter dparam=new DescriptorParameter(pakey, padef);

                            String padescr=param.getAttribute("description");
                        	dparam.setDescription(padescr);

                        	pparams.add(dparam);
                        }
                        if (pparams.size()>0)
                    	descImpl.setParameters(pparams);
                        
                        
                        
                        //Add parent provider to descriptor
                        descImpl.setProvider(provider);
                        
                        provider.getDescriptorImpls().add(descImpl);
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
	
	
	


	/*====================================================
	 * Calculations below
	 * ====================================================
	 */



	/**
	 * Calculate descriptors for N molecules with D descriptors with P params.
	 * @param molecules List<IMolecule> containing the molecules
	 * @param descriptorMap Map from descriptorImplID to List<DescriptorParameter>
	 * @return
	 */
	public Map<IMolecule, List<IDescriptorResult>> calculate(List<IMolecule> molecules, 
			List<DescriptorType> descriptorTypes) {

		Map<IMolecule, List<IDescriptorResult>> allResults=
			 						new HashMap<IMolecule, List<IDescriptorResult>>();
		
		//The problem is to collect all descriptor ID's and group by provider
		//Loop over all providers
		for (DescriptorProvider provider : getFullProviders()){
			
			//Store descriptors and params to calculate for this provider in list
			List<DescriptorType> descriptorTypesForProvider = new ArrayList<DescriptorType>();
			
			

			//Check if this descriptor is here, add if so
			for (DescriptorType descType: descriptorTypes){
				DescriptorimplType descImpl = descType.getDescriptorimpl();

				if (provider.getId().equals(descImpl.getId())){
					descriptorTypesForProvider.add(descType);
				}
			}

			
			//If we have descs to calculate, do so
			if (descriptorTypesForProvider.size()>0){
				IDescriptorCalculator calculator=provider.getCalculator();
				Map<IMolecule, List<IDescriptorResult>> results = 
						calculator.calculateDescriptor(molecules, 
													   descriptorTypesForProvider);
				
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



//	/**
//	 * Convenience method to calculate descriptors without inputting parameters
//	 */
//	public Map<IMolecule, List<IDescriptorResult>> calculateNoParams(
//			List<IMolecule> molecules, List<String> descriptorImplIDs) {
//
//		List<DescriptorType> insts=new ArrayList<DescriptorType>();
//		
//		for (String descImplID : descriptorImplIDs){
//			DescriptorImpl impl=getDescriptorImplByID(descImplID);
//			Descriptor desc=getDescriptorByID(impl.getDefinition());
//			DescriptorType descType=createDescriptorType(desc, impl,null);
//			
//			DescriptorInstance inst=new DescriptorInstance(desc, impl,null);
//			insts.add(inst);
//		}
//		
//		return calculate(molecules, insts);
//	}



	/**
	 * Convenience method to calculate a descriptor for a single mol and 
	 * a single descriptorID.
	 */
	public IDescriptorResult calculate(IMolecule molecule, String descriptorID) {

		List<IMolecule> mollist=new ArrayList<IMolecule>();
		mollist.add(molecule);

		List<String> descIDs=new ArrayList<String>();
		descIDs.add(descriptorID);
		
		Map<IMolecule, List<IDescriptorResult>> retMap = calculateNoParams(mollist, descIDs);
		if (retMap==null || retMap.size()<1){
			throw new NoSuchElementException("Calculation did not return a result");
		}
		List<IDescriptorResult> res=retMap.get(molecule);
		if (res==null || res.size()<=0)
			throw new NoSuchElementException("Calculation returned empty result");

		return res.get(0);
		
	}

	/**
	 * Returns preferred impl for a descriptorID or null if none existing
	 */
	public DescriptorImpl getPreferredImpl(String descriptorID){
		
		//Read preference and get order of providers

		IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
		String ret=prefs.get(QSARConstants.QSAR_PROVIDERS_ORDER_PREFERENCE, null);

		//String of names
		String[] provArray=QsarPreferenceHelper.parseQsarPreferenceString(ret);
		
		for (String providerName : provArray){
			String providerID=QsarPreferenceHelper.getProviderID(providerName);
			if (providerID!=null){
				DescriptorProvider prov = getProviderByID(providerID);
				if (prov!=null){
					for (DescriptorImpl impl : prov.getDescriptorImpls()){
						if (impl.getDefinition().equals(descriptorID))
							return impl;
					}
				}
			} else{
				logger.error("Could not locate provider by name: " + providerName);
			}
		}
		//No impl found for this descrID
		return null;
	}


	/**
	 * Get descriptor implementation be descriptorID and providerID or null if
	 * none matching.
	 */
	public DescriptorImpl getDescriptorImpl(String descriptorID, String providerID) {
		
		for (String descriptorImplID : getDescriptorImplsByProvider(providerID)){
			DescriptorImpl impl = getDescriptorImplByID(descriptorImplID);
			if (impl.getDefinition().equals(descriptorID))
				return impl;
		}

		return null;
	}



	
	
	public List<IDescriptorResult> calculate(IMolecule molecule,
			List<DescriptorType> descriptorTypes) {
		
		List<IMolecule> mollist=new ArrayList<IMolecule>();
		mollist.add(molecule);

		Map<IMolecule, List<IDescriptorResult>> ret = calculate(mollist, descriptorTypes);
		
		return ret.get(molecule);
	}



	public Map<IMolecule, List<IDescriptorResult>> calculateNoParams(
			List<IMolecule> molecules, List<String> descriptorIDs) {
		List<DescriptorType> descTypes=new ArrayList<DescriptorType>();
		
		for (String descriptorID : descriptorIDs){
			//Look up descriptor by ID
			Descriptor desc=getDescriptorByID(descriptorID);
			if (desc==null){
				throw new IllegalArgumentException("Could not find descriptor: " + descriptorID);
			}

			//Loop up preferred implementation
			DescriptorImpl impl=getPreferredImpl(descriptorID);
			if (impl==null){
				throw new IllegalArgumentException("Could not find an implementation for descriptor: " + descriptorID);
			}
			
			
			DescriptorType descType=createDescriptorType(null, null, desc, impl,null);
			descTypes.add(descType);
		}
		
		return calculate(molecules, descTypes);
	}



	/**
	 * Add a descriptor with impl and optionally parameters to a QsarModel via 
	 * an editingDomain
	 * @param qsarModel
	 * @param editingDomain
	 * @param desc
	 * @param impl
	 * @param params
	 * @return
	 */
	private DescriptorType createDescriptorType(QsarType qsarModel, EditingDomain editingDomain, Descriptor desc,
			DescriptorImpl impl, List<DescriptorParameter> params) {
		
		//If qsarModel is null, create a new one
		//Used in tests
		qsarModel=QsarFactory.eINSTANCE.createQsarType();


		//Get and optionally create list of descriptors if null
		DescriptorlistType descriptorList = qsarModel.getDescriptorlist();
		if (descriptorList==null){
			descriptorList=QsarFactory.eINSTANCE.createDescriptorlistType();
			qsarModel.setDescriptorlist(descriptorList);
		}

		//If we have no editingDomain, create a basic one
		//Used in tests
		if (editingDomain==null){
			QsarAdapterFactory factory=new QsarAdapterFactory();
			editingDomain=new AdapterFactoryEditingDomain(factory, new BasicCommandStack());
		}


		//Collect all in a compound command, for ability 
		//to undo everything at the same time
		CompoundCommand cCmd = new CompoundCommand();
		Command cmd;

		DescriptorType modelDescriptor=QsarFactory.eINSTANCE.createDescriptorType();
		modelDescriptor.setId(desc.getId());
		modelDescriptor.setNamespace(desc.getNamesapce());
		cmd=AddCommand.create(editingDomain, descriptorList, QsarPackage.Literals.DESCRIPTORLIST_TYPE__DESCRIPTOR, modelDescriptor);
		cCmd.append(cmd);

		//Check if provider already added to qsarModel
		DescriptorimplType dimpl=null;
		for (DescriptorimplType pdimpl : qsarModel.getDescriptorimpl()){
			if (pdimpl.getId().equals(impl.getProvider().getId())){
				dimpl=QsarFactory.eINSTANCE.createDescriptorimplType();
				dimpl.setId(pdimpl.getId());
			}
		}

		//If this is a new provider, add it to Qsar model
		if (dimpl==null){
			DescriptorProvider prov = impl.getProvider();

			String pid=prov.getId();
			String pname=prov.getName();
			String pvend=prov.getVendor();
			String pvers=prov.getVersion();
			String pns=prov.getNamesapce();

			//Create a provider (=descrImplType) in qsar model root
			DescriptorimplType newdimpl=QsarFactory.eINSTANCE.createDescriptorimplType();
			newdimpl.setId(pid);
			newdimpl.setNamespace(pns);
			newdimpl.setVendor(pvend);
			newdimpl.setName(pname);
			newdimpl.setVersion(pvers);
			cmd=AddCommand.create(editingDomain, qsarModel, QsarPackage.Literals.QSAR_TYPE__DESCRIPTORIMPL, newdimpl);
			cCmd.append(cmd);

			//Reference the created impl by ID
			dimpl=QsarFactory.eINSTANCE.createDescriptorimplType();
			dimpl.setId(newdimpl.getId());

		}

		//Add found impl to descriptor element
		cmd=SetCommand.create(editingDomain, modelDescriptor, QsarPackage.Literals.DESCRIPTOR_TYPE__DESCRIPTORIMPL, dimpl);
		cCmd.append(cmd);

		//Parameters
		if (impl.getParameters()!=null){
			for (DescriptorParameter param : impl.getParameters()){

				ParameterType modelParam=QsarFactory.eINSTANCE.createParameterType();
				modelParam.setKey(param.getKey());
				
				//Check if provided parameters have values or use default from impl
				for (DescriptorParameter inparam : params){
					if (inparam.getKey().equals(param.getKey())){
						//We have input params, use value
						modelParam.setValue(inparam.getValue());
					}else{
						//We have no input params, use def value from impl
						modelParam.setValue(param.getValue());
					}
				}
				
				cmd=AddCommand.create(editingDomain, modelDescriptor, QsarPackage.Literals.DESCRIPTOR_TYPE__PARAMETER, modelParam);
				cCmd.append(cmd);

			}
		}
		//Execute the compound command
		editingDomain.getCommandStack().execute(cCmd);

		return modelDescriptor;
	}


}
