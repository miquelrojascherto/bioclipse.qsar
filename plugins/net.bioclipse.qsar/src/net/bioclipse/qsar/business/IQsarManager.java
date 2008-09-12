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


import java.util.List;
import java.util.Map;

import org.eclipse.emf.edit.domain.EditingDomain;

import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.core.business.IBioclipseManager;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

public interface IQsarManager extends IBioclipseManager{

    @Recorded
    @PublishedMethod( methodSummary = "Calculates a descriptor for a molecule" )
    public IDescriptorResult calculate(IMolecule molecule, String descriptorImplID);

	public List<IDescriptorResult> calculate(IMolecule molecule,
			List<DescriptorType> descriptorTypes);
    
    public Map<IMolecule, List<IDescriptorResult>> calculate(List<IMolecule> molecules, 
    													List<DescriptorType> descriptorTypes);

    @Recorded
    @PublishedMethod( methodSummary = "Calculates a list of descriptors for a " +
    		"list of molecules" )
	public Map<IMolecule, List<IDescriptorResult>> calculateNoParams(
			List<IMolecule> molecules, List<String> descriptorIDs);

 
    @PublishedMethod( methodSummary = "Returns the available descriptor providers" )
    public List<String> getProviders();
    public List<DescriptorProvider> getFullProviders();

    @PublishedMethod( methodSummary = "Returns the available descriptor categories" )
    public List<String> getCategories();
    public List<DescriptorCategory> getFullCategories();


    @PublishedMethod( methodSummary = "Returns the ID's of available descriptors " +
    		"for a provider" )
    public List<String> getDescriptorImplsByProvider(String providerID);
    public List<DescriptorImpl> getFullDescriptorImpls(DescriptorProvider provider);


    @PublishedMethod( methodSummary = "Returns the descriptor category class by ID" )
	public DescriptorCategory getCategoryByID(String categoryID);

    @PublishedMethod( methodSummary = "Returns the descriptor provider class by ID" )
    public DescriptorProvider getProviderByID(String providerID);

    @PublishedMethod( methodSummary = "Returns a descriptor class by ID" )
	public DescriptorImpl getDescriptorImplByID(String descriptorImplID);
    
    @PublishedMethod( methodSummary = "Returns a descriptor class by ID" )
	boolean existsDescriptor(String descriptorID);

    /**
     * Get the descriptorModel as read from EP
     * @return
     */
    public DescriptorModel getModel();

	public List<String> getDescriptors();
	public List<Descriptor> getFullDescriptors();
	public Descriptor getDescriptorByID(String descriptorID);

	public List<Descriptor> getDescriptors(DescriptorCategory category);

	public List<String> getDescriptors(String categoryID);

	public List<DescriptorImpl> getFullDescriptorImpls();

	public List<String> getDescriptorImpls(String descriptorID);

	public List<DescriptorImpl> getDescriptorImplsForDescriptor(String descriptorID);

	public DescriptorImpl getPreferredImpl(String descriptorID);

	DescriptorImpl getDescriptorImpl(String descriptorID, String providerID);

	DescriptorType createDescriptorType(QsarType qsarModel,
			EditingDomain editingDomain, Descriptor desc, DescriptorImpl impl,
			List<DescriptorParameter> params);



}
