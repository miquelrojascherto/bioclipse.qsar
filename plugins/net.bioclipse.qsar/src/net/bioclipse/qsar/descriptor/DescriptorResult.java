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
package net.bioclipse.qsar.descriptor;

import net.bioclipse.qsar.DescriptorType;

/**
 * Base implementation of a descriptor result.
 * @author ola
 *
 */
public class DescriptorResult implements IDescriptorResult{

	DescriptorType descriptor;
	String[] labels;
	Float[] values;

	String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	//Constructor
	public DescriptorResult() {
	}


	public String[] getLabels() {
		return labels;
	}


	public void setLabels(String[] labels) {
		this.labels = labels;
	}


	public Float[] getValues() {
		return values;
	}


	public void setValues(Float[] values) {
		this.values = values;
	}
	
	@Override
    public String toString() {
	    if (labels==null || labels.length<=0) return "null";
	    
	    String ret="DescriptorResult for descriptor=" + descriptor +": ";
	    for (int i=0; i< labels.length;i++){
	        ret=ret+labels[i] + "=" + values[i];
	    }

	    return ret;
    }
    
    public DescriptorType getDescriptor() {
        return descriptor;
    }
    public void setDescriptor( DescriptorType descriptor ) {
        this.descriptor = descriptor;
    }

}
