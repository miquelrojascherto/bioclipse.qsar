/*******************************************************************************
 * Copyright (c) 2007 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     ola - initial API and implementation
 *     
 *******************************************************************************/
package net.bioclipse.qsar.editors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IContentProvider;
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

    public Object[] getChildren(Object parentElement) {
        if (parentElement==null) return null;

        if (parentElement instanceof IContainer) {
            IContainer container = (IContainer) parentElement;
            try {
                if (container.members().length<=0) return new Object[0];
                else return container.members();

            } catch (CoreException e) {
                return new Object[0];
            }
        }

        return null;

    }

    public Object getParent(Object element) {
        if (element instanceof IResource) {
            IResource res = (IResource) element;
            res.getParent();
        }

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
