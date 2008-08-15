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

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author ola
 *
 */
public class MoleculesLabelProvider implements ITableLabelProvider{

    public void addListener(ILabelProviderListener listener) {
    }

    public void dispose() {
    }

    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    public void removeListener(ILabelProviderListener listener) {
    }

	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex==0){
	        String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
	        return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		}
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof MoleculeResource) {
			MoleculeResource mr=(MoleculeResource)element;
			if (columnIndex==0){
				IResource resource = mr.getResource();
				return resource.getName();
			}
			else if (columnIndex==1){
				return "" + mr.noMols;
			}
			else if (columnIndex==2){
				return "" + mr.has2D;
			}
			else if (columnIndex==3){
				return "" + mr.has3D;
			}
		}
		return "N/A";
	}
}
