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
package net.bioclipse.qsar.ui.editors;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
/**
 * 
 * @author ola
 * 
 */
public class MoleculesContentProvider implements ITreeContentProvider {

    //Same as getChildren
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    @SuppressWarnings("unchecked")
	public Object[] getChildren(Object parentElement) {
        if (parentElement==null) return null;

        if (parentElement instanceof List) {
            List lst=(List)parentElement;
            return lst.toArray();
        }

        return new Object[0];

    }

    public Object getParent(Object element) {
        return null;
    }

    public boolean hasChildren(Object element) {
        if (getChildren(element)==null) return false;
        return getChildren(element).length>0;
    }

    public void dispose() {
    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

}
