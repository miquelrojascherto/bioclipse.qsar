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
