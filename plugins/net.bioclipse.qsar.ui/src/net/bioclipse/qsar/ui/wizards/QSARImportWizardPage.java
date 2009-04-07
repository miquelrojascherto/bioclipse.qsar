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
package net.bioclipse.qsar.ui.wizards;

import org.eclipse.ui.internal.wizards.datatransfer.WizardProjectsImportPage;

@SuppressWarnings("restriction")
public class QSARImportWizardPage extends WizardProjectsImportPage {
	
	@Override
	public boolean isPageComplete() {
		// TODO Auto-generated method stub
		boolean extendedComplete=super.isPageComplete();
		
		
		
		//TODO: do additional checking here
		
		return extendedComplete;
		
	}

	
}
