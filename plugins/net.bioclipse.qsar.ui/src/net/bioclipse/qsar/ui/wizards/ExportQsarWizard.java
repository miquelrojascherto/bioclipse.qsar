package net.bioclipse.qsar.ui.wizards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.bioclipse.qsar.ui.builder.QSARNature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceExportPage1;
import org.eclipse.ui.internal.wizards.datatransfer.ZipFileExporter;

@SuppressWarnings("restriction")
public class ExportQsarWizard extends Wizard implements IExportWizard {

	String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	private IWizardPage page;

	public ExportQsarWizard() {
	}
	
	@Override
	public void addPages() {
		if (page!=null)
			addPage(page);
	}


	public void init(IWorkbench workbench, IStructuredSelection selection) {

		if (selection==null) dispose();

		List<IProject> qsarProjects=new ArrayList<IProject>();
		for (Object obj : selection.toList()){
			if (obj instanceof IResource) {
				IResource res = (IResource) obj;
				System.out.println("Res: " + res.getName());

				IProjectNature nat=null;
				try {
					nat=res.getProject().getNature(QSARNature.NATURE_ID);
				} catch (CoreException e) {
				}
				if (nat!=null) qsarProjects.add(res.getProject());
			}
		}
		if (qsarProjects.size()<=0){
			System.out.println("No qsar projects in selection");
		}else if (qsarProjects.size()==1){
			page=new ExportQsarWizardFilePage("Export QSAR project");
			page.setTitle("Export QSAR project");
			page.setDescription("Export QSAR project to file");
		}else{
			showMessage("You have selected resources from more than one project. " +
					"Please only select a single object for export.");
		}
		
	}
	

	@Override
	public boolean canFinish() {
		if (page==null) return false;
		return super.canFinish();
	}

    private void showMessage(String message) {
        MessageDialog.openInformation( getShell(),
                                       "Information",
                                       message );
    }

	@Override
	public boolean performFinish() {
		
		System.out.println("Do export to file: " + filename);
		
//		try {
//			ZipFileExporter zip=new ZipFileExporter(filename,true);
//			zip.write(resource, destinationPath)
//			zip.finished();
//		} catch (IOException e) {
//			System.out.println("Could not write file: " + filename + ". " + e.getMessage());
//			return false;
//		}
//		
		
		return true;
	}

	
}
