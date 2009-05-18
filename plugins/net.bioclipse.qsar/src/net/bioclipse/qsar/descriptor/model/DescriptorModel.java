/*******************************************************************************
 * Copyright (c) 2009 Ola Spjuth.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 ******************************************************************************/
package net.bioclipse.qsar.descriptor.model;

import java.util.List;

/**
 * Hold the descriptor model read from EP
 * @author ola
 *
 */
public class DescriptorModel {

    List<DescriptorCategory> categories;
    List<DescriptorProvider> providers;
    List<ResponseUnit> units;


    public DescriptorModel() {
    }

    public List<DescriptorCategory> getCategories() {
        return categories;
    }
    public void setCategories(List<DescriptorCategory> categories) {
        this.categories = categories;
    }

    public List<DescriptorProvider> getProviders() {
        return providers;
    }
    public void setProviders(List<DescriptorProvider> providers) {
        this.providers = providers;
    }


    public List<ResponseUnit> getUnits() {
        return units;
    }
    public void setUnits( List<ResponseUnit> units ) {
        this.units = units;
    }

}
