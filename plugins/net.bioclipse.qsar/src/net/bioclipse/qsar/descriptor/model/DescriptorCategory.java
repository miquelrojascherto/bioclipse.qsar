/*******************************************************************************
 * Copyright (c) 2008 Bioclipse Project
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ola Spjuth - core API and implementation
 *******************************************************************************/
package net.bioclipse.qsar.descriptor.model;

import org.eclipse.ui.views.properties.IPropertySource;

public class DescriptorCategory extends BaseEPObject{

	public DescriptorCategory(String id, String name) {
		super(id, name);
	}
	public DescriptorCategory(String id, String name, String icon_path) {
		super(id, name, icon_path);
	}

	public Object getAdapter(Class adapter) {

		if (IPropertySource.class.equals(adapter)) {
			return new DescriptorCategoryPropertySource(this);
		}

		return super.getAdapter(adapter);
	}

	
}
