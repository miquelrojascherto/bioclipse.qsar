/*******************************************************************************
 * Copyright (c) 2007 Bioclipse Project
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Egon Willighagen - core API and implementation
 *******************************************************************************/

package net.bioclipse.qsar.descriptor;

import java.util.List;

public interface IDescriptorResult {

	List<String> getDescriptorIds();

	void setDescriptorIds(List<String> descriptorIds);

	List<Float> getValues();

	void setValues(List<Float> values);

	
}
