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

import net.bioclipse.qsar.DescriptorType;

/**
 * Interface for results of a descriptorcalculation
 * @author ola
 *
 */
public interface IDescriptorResult {

    public DescriptorType getDescriptor();
    public void setDescriptor( DescriptorType descriptor );

    public String[] getLabels();
    void setLabels(String[] labels);

    public Float[] getValues();
    void setValues(Float[] values);

    /**
     * Should be null if no error
     * @return
     */
    public String getErrorMessage();

    void setErrorMessage(String errorMessage);


}
