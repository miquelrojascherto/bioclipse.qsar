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

import net.bioclipse.qsar.MoleculeType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.util.QsarAdapterFactory;
import net.bioclipse.ui.dialogs.WSFileDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
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

	private TableViewer viewer;
	private Table table;

	private List<IResource> molecules;

	//This is the stored model from the MPE
	private QsarType qsarModel;

	//The list of molecules in the Qsar model, for convenience
	private MoleculelistType moleculeList;
	private EditingDomain editingDomain;

	public MoleculesPage(FormEditor editor, QsarType qsarModel, EditingDomain editingDomain) {
		super(editor, "qsar.molecules", "Molecules");
		this.qsarModel=qsarModel;
		this.editingDomain=editingDomain;

		//Currently displayed in table, duplicates teh model moleculeList
		molecules=new ArrayList<IResource>();

		//Get mollist from qsar model, init if empty (should not be)
		moleculeList=qsarModel.getMoleculelist();
		if (moleculeList==null){
			moleculeList=QsarFactory.eINSTANCE.createMoleculelistType();
			qsarModel.setMoleculelist(moleculeList);
		}else{

			//Read into molecules list from qsarModel

		}

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

				System.out.println("Selected mols to add: ");
				for (IResource resource : dlg.getMultiResult()){
					if (!(molecules.contains( resource ))){

						//Add to List of resources
						molecules.add( resource );

						//Also add to QSAR model
						MoleculeType mol1=QsarFactory.eINSTANCE.createMoleculeType();
						mol1.setId(resource.getName());
						mol1.setName(resource.getName());
						mol1.setPath(resource.getFullPath().toString());
						Command cmd=AddCommand.create(editingDomain, moleculeList, QsarPackage.Literals.MOLECULELIST_TYPE__MOLECULE, mol1);

						//Execute the CompoundCommand
						editingDomain.getCommandStack().execute(cmd); 		
					}
				}

				viewer.setInput( molecules.toArray() );

			}
		});
		GridData gd2=new GridData();
		gd2.verticalAlignment=SWT.BEGINNING;
		btnAdd.setLayoutData( gd2 );

		Button btnDel=new Button(body,SWT.NONE);
		btnDel.setText( "Remove" );
		btnDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				System.out.println("Remove XX ");
			}
		});
		gd2=new GridData();
		gd2.verticalAlignment=SWT.BEGINNING;
		btnDel.setLayoutData( gd2 );
		
		getSite().setSelectionProvider(viewer);
		

	}

}
