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


import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.core.business.IBioclipseManager;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.IDescriptorResult;

public interface IQsarManager extends IBioclipseManager{

    @Recorded
    @PublishedMethod( methodSummary = "Calculates the descriptor for teh molecule" )
    public IDescriptorResult calculate(IMolecule molecule, String descriptorID);
}
