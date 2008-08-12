/*******************************************************************************
 *Copyright (c) 2008 The Bioclipse Team and others.
 *All rights reserved. This program and the accompanying materials
 *are made available under the terms of the Eclipse Public License v1.0
 *which accompanies this distribution, and is available at
 *http://www.eclipse.org/legal/epl-v10.html
 *
 *Contributors:
 *    Ola Spjuth - initial API and implementation
 *******************************************************************************/
package net.bioclipse.qsar.editors;

public class SimpleFormEditorInput extends FormEditorInput {
    private SimpleModel model;
    
    public SimpleFormEditorInput(String name) {
        super(name);
        model = new SimpleModel();
    }
    
    public SimpleModel getModel() {
        return model;
    }
}