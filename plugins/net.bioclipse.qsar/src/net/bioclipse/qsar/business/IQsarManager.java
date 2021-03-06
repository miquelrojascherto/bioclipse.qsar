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
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.edit.domain.EditingDomain;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.managers.business.IBioclipseManager;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ResourceType;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;
import net.bioclipse.qsar.descriptor.model.ResponseUnit;

@PublishedClass("A manager for QSAR")
public interface IQsarManager extends IBioclipseManager{

    @Recorded
    @PublishedMethod( 
                      params="IMolecule molecule, String descriptorImplID",
                      methodSummary = "Calculates a descriptor for a molecule" )
    public IDescriptorResult calculate(IMolecule molecule, String descriptorImplID);

    public List<IDescriptorResult> calculate(IMolecule molecule,
                                             List<DescriptorType> descriptorTypes);

    public Map<? extends IMolecule, List<IDescriptorResult>> calculate(
                                                                       List<? extends IMolecule> molecules, 
                                                                       List<DescriptorType> descriptorTypes, IProgressMonitor monitor)
                                                                       throws OperationCanceledException;

    @Recorded
    @PublishedMethod(params="List<? extends IMolecule> molecules, " +
    		"List<String> descriptorIDs",
         methodSummary = "Calculates a list of descriptors for a " +
    "list of molecules" )
    public Map<? extends IMolecule, List<IDescriptorResult>> calculateNoParams(
         List<? extends IMolecule> molecules, List<String> descriptorIDs);

    @PublishedMethod( methodSummary = "Returns the available descriptor providers" )
    public List<String> getProviders();
    public List<DescriptorProvider> getFullProviders();

    @PublishedMethod( methodSummary = "Returns the available descriptor categories" )
    public List<String> getCategories();
    public List<DescriptorCategory> getFullCategories();

    @PublishedMethod( methodSummary = "Returns the available response units" )
    List<String> getResponseUnits();
    List<ResponseUnit> getFullResponseUnits();


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
    boolean existsDescriptorImpl(String descriptorID);

    /**
     * Get the descriptorModel as read from EP
     */
    public DescriptorModel getModel();

    @Recorded
    @PublishedMethod(methodSummary = "Get a list of descriptor IDs" )
    public List<String> getDescriptorIDs();
    
    public List<Descriptor> getFullDescriptors();

    public Descriptor getDescriptorByID(String descriptorID);

    public List<Descriptor> getDescriptorsInCategory(DescriptorCategory category);

    @Recorded
    @PublishedMethod(params="String categoryID",
                     methodSummary = "Get a list of descriptor IDs in a category" )
    public List<String> getDescriptorsInCategory(String categoryID);

    public List<DescriptorImpl> getFullDescriptorImpls();

    @Recorded
    @PublishedMethod(params="String descriptorID",
                     methodSummary = "Get a list of descriptor implementations " +
                     		"for a descriptor" )
    public List<String> getDescriptorImpls(String descriptorID);

    public List<DescriptorImpl> getDescriptorImplsForDescriptor(String descriptorID);

    public DescriptorImpl getPreferredImpl(String descriptorID);

    DescriptorImpl getDescriptorImpl(String descriptorID, String providerID);

    DescriptorType createDescriptorType(QsarType qsarModel,
                                        EditingDomain editingDomain, Descriptor desc, DescriptorImpl impl,
                                        List<DescriptorParameter> params);

    @PublishedMethod(params="String descriptorID",
                     methodSummary = "Return true if descriptorID exists" )
    boolean existsDescriptor( String descriptorID );

    /**
     * Calculate for all molecules, the descriptors in associated list.
     * @param molDescMap Map of molecule to list of descriptors
     * @param monitor
     * @return
     */
    @PublishedMethod(params="Map<IMolecule, List<DescriptorType>> molDescMap, " +
    		"IProgressMonitor monitor ",
    		methodSummary = "Calculate for all molecules, the descriptors in associated list." )
    @Recorded
    public Map<IMolecule, List<IDescriptorResult>> calculate(
          Map<IMolecule, List<DescriptorType>> molDescMap,
          IProgressMonitor monitor );

    
    public void addResourcesToQsarModel( QsarType qsarmodel, EditingDomain editingDomain,
                          List<IResource> resourcesToAdd, IProgressMonitor monitor )
                                                           throws IOException,
                                                           BioclipseException,
                                                           CoreException;

    public void addCalculatedPropertiesToQsarModel( QsarType qsarModel );
    public void removeResourcesFromModel( QsarType qsarModel,
                                          EditingDomain editingDomain, List<ResourceType> list );

    public void addDescriptorToModel( QsarType qsarModel, EditingDomain editingDomain, Descriptor desc,
                                      DescriptorImpl impl );
    public void removeDescriptorsFromModel( QsarType qsarModel,
                                            EditingDomain editingDomain,
                                            List<DescriptorType> list );

    void addResponseUnitToModel( QsarType qsarModel,
                                 EditingDomain editingDomain,
                                 List<ResponseUnit> list );
    void removeResponseUnitsFromModel( QsarType qsarModel,
                                       EditingDomain editingDomain,
                                       List<ResponseUnit> list );



}
