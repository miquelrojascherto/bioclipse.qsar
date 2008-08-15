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

import java.util.ArrayList;
import java.util.List;

import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.ui.dialogs.WSFileDialog;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * Page for adding molecular content to model
 * @author ola
 *
 */
public class MoleculesPage extends FormPage {

	private static final Logger logger = Logger.getLogger(MoleculesPage.class);

	private TableViewer viewer;
	private Table table;

	private List<IResource> molecules;
	
	private boolean dirty;

	@Override
	public boolean isDirty() {
		return dirty;
	}
	
	//The list of molecules in the Qsar model, for convenience
	private MoleculelistType moleculeList;
	public MoleculelistType getMoleculeList() {
		return moleculeList;
	}

	public void setMoleculeList(MoleculelistType moleculeList) {
		this.moleculeList = moleculeList;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	private EditingDomain editingDomain;

	public MoleculesPage(FormEditor editor, QsarType qsarModel, EditingDomain editingDomain) {
		super(editor, "qsar.molecules", "Molecules");
		this.editingDomain=editingDomain;

		//Currently displayed in table, duplicates the model in moleculeList
		molecules=new ArrayList<IResource>();

		//Get mollist from qsar model, init if empty (should not be)
		moleculeList=qsarModel.getMoleculelist();
		if (moleculeList==null){
			moleculeList=QsarFactory.eINSTANCE.createMoleculelistType();
			qsarModel.setMoleculelist(moleculeList);
		}

		dirty=false;

	}

	/**
	 * Add content to form
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {

		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Select molecules");
		//        form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(FormArticlePlugin.IMG_FORM_BG));
		final Composite body = form.getBody();
		GridLayout layout = new GridLayout(2, false);
		body.setLayout(layout);

		viewer = new TableViewer(body, SWT.BORDER | SWT.SINGLE);
		viewer.setContentProvider( new ArrayContentProvider() );
		viewer.setLabelProvider( new WorkbenchLabelProvider() );
		table=viewer.getTable();
		toolkit.adapt(table, true, true);
		GridData gd=new GridData();
		gd.widthHint=200;
		gd.heightHint=300;
		gd.verticalSpan=2;
		table.setLayoutData( gd );

		Button btnAdd=new Button(body,SWT.NONE);
		btnAdd.setText( "Add..." );
		btnAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				addMolecule();
			}
		});
		GridData gd2=new GridData();
		gd2.verticalAlignment=SWT.BEGINNING;
		btnAdd.setLayoutData( gd2 );

		Button btnDel=new Button(body,SWT.NONE);
		btnDel.setText( "Remove" );
		btnDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				removeSelected();
			}
		});
		gd2=new GridData();
		gd2.verticalAlignment=SWT.BEGINNING;
		btnDel.setLayoutData( gd2 );
		
		populateTableFromModel();
		
		getSite().setSelectionProvider(viewer);
		

	}


	protected void showInformation(String message) {

		MessageDialog.openInformation(getSite().getShell(),
				"Information", message);
		
	}

	private void populateTableFromModel() {

		for (MoleculeResourceType mol: moleculeList.getMoleculeResource()){
			if (mol.getPath()!=null){
				IPath pth=new Path(mol.getPath());
				if (pth!=null){
					IFile file=ResourcesPlugin.getWorkspace().getRoot().getFile(pth);
					molecules.add(file);
					System.out.println("Added mol: " + file.getName());
				}else{
					logger.error("could not parse path of mol: " + mol.getPath());
				}
			}else{
				logger.error("could not parse mol: " + mol.getName() + ". path=null");
			}
		}

		viewer.setInput( molecules.toArray() );

	}

	
	private void removeSelected() {
		IStructuredSelection ssel=(IStructuredSelection) viewer.getSelection();
		if (ssel == null) {
			showInformation("Please select a molecule to remove");
			return;
		}
		
		for (Object obj : ssel.toList()){
			if (!(obj instanceof IResource)) {
				//Should not happen
				logger.error("A non-resource selected in MolViewer: " + obj);
				return;
			}

			IResource resource = (IResource) obj;

			if (!(getMolecules().contains(resource))){
				System.out.println("Error: sel mol must be contained in list!");
				return;
			}

			//Remove the moltype, look up by id=resource name
			MoleculeResourceType molToRemove=null;
			for (MoleculeResourceType mol: getMoleculeList().getMoleculeResource()){
				if (mol.getId().equals(resource.getName())){
					molToRemove=mol;
				}
			}

			//Remove molType from Viewers List
			getMolecules().remove(resource);

			//Remove entry (should be found)
			if (molToRemove==null){
				System.out.println("found no matching mol in emf model. " +
						"Should not happen.");
				return;
			}
			Command cmd=RemoveCommand.create(getEditingDomain(), 
					getMoleculeList(), QsarPackage.Literals.
					MOLECULELIST_TYPE__MOLECULE_RESOURCE, molToRemove);
			getEditingDomain().getCommandStack().execute(cmd);

			viewer.setInput(getMolecules());
			
			dirty=true;
			((QSARFormEditor)getEditor()).fireDirtyChanged();
		}
	}

	public List<IResource> getMolecules() {
		return molecules;
	}

	public void setMolecules(List<IResource> molecules) {
		this.molecules = molecules;
	}

	private void addMolecule() {
		IProject proj=((QSARFormEditor)getEditor()).getActiveProject();

		WSFileDialog dlg=new WSFileDialog(getEditorSite().getShell()
				,SWT.MULTI,"Select molecules"
				,proj,true,null,null);

		//Collect a list of resources currently in viewer 
		//to hide them in dialog


		if (molecules!=null && molecules.size()>0)
			dlg.addBlacklistFilter( molecules );

		int r=dlg.open();
		if (r==Window.CANCEL){
			return;
		}
		
		if (dlg.getMultiResult()==null || dlg.getMultiResult().length<=0){
			showInformation("Please select at least one molecule to add");
			return;
		}

		System.out.println("Selected mols to add: ");
		for (IResource resource : dlg.getMultiResult()){
			if (!(molecules.contains( resource ))){

				//Add to List of resources
				molecules.add( resource );

				//Also add to QSAR model
				MoleculeResourceType mol1=QsarFactory.eINSTANCE.createMoleculeResourceType();
				mol1.setId(resource.getName());
				mol1.setName(resource.getName());
				mol1.setPath(resource.getFullPath().toString());
				Command cmd=AddCommand.create(editingDomain, moleculeList, 
   			   QsarPackage.Literals.MOLECULELIST_TYPE__MOLECULE_RESOURCE, mol1);

				//Execute the CompoundCommand
				editingDomain.getCommandStack().execute(cmd); 		
			}
		}

		viewer.setInput( molecules.toArray() );
		
		dirty=true;
		((QSARFormEditor)getEditor()).fireDirtyChanged();

	}

}
