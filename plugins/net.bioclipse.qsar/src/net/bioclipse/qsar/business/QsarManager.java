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

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.IDescriptorResult;

public class QsarManager implements IQsarManager{

	public IDescriptorResult calculate(IMolecule molecule, String descriptorID) {
		throw new RuntimeException("Not implemented.");
	}

	public String getNamespace() {
		return "qsar";
	}
}
