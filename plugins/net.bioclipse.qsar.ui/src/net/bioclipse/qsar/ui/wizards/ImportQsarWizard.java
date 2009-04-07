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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.wizards.datatransfer.WizardProjectsImportPage;

@SuppressWarnings("restriction")
public class ImportQsarWizard extends Wizard implements IImportWizard {


	private WizardProjectsImportPage page;

	public ImportQsarWizard() {
		super();
	}

	@Override
	public void addPages() {
		addPage(page);
		page.setDescription("Import new QSAR project from file");
	}
	

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		return super.getNextPage(page);
	}
	

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import QSAR project");
		setNeedsProgressMonitor(true);
		
		page=new QSARImportWizardPage();
		page.setTitle("Import QSAR project");
		page.setDescription("Select a QSAR project to import");
		
	}
	
	@Override
	public boolean performFinish() {
		
		System.out.println("Import qsar project here");
		
		
		return true;
	}


}
