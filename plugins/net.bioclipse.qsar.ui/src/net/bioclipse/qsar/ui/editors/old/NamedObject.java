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
package net.bioclipse.qsar.ui.editors.old;

/**
 *
 */
public class NamedObject {
    private String name;
    protected SimpleModel model;

    public NamedObject(String name) {
        this.name = name;
    }
    public void setModel(SimpleModel model) {
        this.model = model;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return getName();
    }
    public void setName(String name) {
        this.name = name;
        model.fireModelChanged(new Object [] {this}, IModelListener.CHANGED, ""); //$NON-NLS-1$
    }
}
