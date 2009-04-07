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
package net.bioclipse.qsar.ui.editors;

import net.bioclipse.qsar.ResponseType;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class ResponseSorter extends ViewerSorter {
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		
		if (!(e1 instanceof ResponseType)) return super.compare(viewer, e1, e2);
		if (!(e2 instanceof ResponseType)) return super.compare(viewer, e1, e2);
		
		ResponseType r1=(ResponseType)e1;
		ResponseType r2=(ResponseType)e2;
		
		String s1=r1.getStructureID();
		String s2=r2.getStructureID();
		
		return s1.compareTo(s2);
		
		
	}

}
