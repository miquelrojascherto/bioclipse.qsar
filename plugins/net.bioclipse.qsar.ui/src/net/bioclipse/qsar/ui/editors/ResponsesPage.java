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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.bioclipse.cdk.business.Activator;
import net.bioclipse.cdk.business.ICDKManager;
import net.bioclipse.cdk.domain.ICDKMolecule;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.ParameterType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ResponseType;
import net.bioclipse.qsar.ResponsesListType;
import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

import org.apache.log4j.Logger;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class ResponsesPage extends FormPage implements IEditingDomainProvider, IViewerProvider{

    private TableViewer responsesViewer;
    private Table responsesTable;

    private static final Logger logger = Logger.getLogger(MoleculesPage.class);
    
    ICDKManager cdk;
    DecimalFormat formatter;
    
    private QsarEditorSelectionProvider selectionProvider;
	private EditingDomain editingDomain;

	private QsarType qsarModel;
	private ResponsesListType responsesList;


    
	public ResponsesPage(FormEditor editor, QsarType qsarModel, 
			EditingDomain editingDomain, QsarEditorSelectionProvider selectionProvider) {

		super(editor, "qsar.responses", "Responses");
		this.editingDomain=editingDomain;

		//Get Managers via OSGI
		cdk=Activator.getDefault().getCDKManager();

		this.qsarModel = qsarModel;

		formatter = new DecimalFormat("0.00");
        this.selectionProvider=selectionProvider;
        
        this.responsesList=qsarModel.getResponselist();
        if (responsesList==null){
        	responsesList=QsarFactory.eINSTANCE.createResponsesListType();
        	qsarModel.setResponselist(responsesList);
        }

	}


    /**
     * Add content to form
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {

        ScrolledForm form = managedForm.getForm();
        FormToolkit toolkit = managedForm.getToolkit();
        form.setText("QSAR responses");
        toolkit.decorateFormHeading(form.getForm());
        
		IProject project=((QSARFormEditor)getEditor()).getActiveProject();
        ToolbarHelper.setupToolbar(form, project);
        
        GridLayout layout = new GridLayout();
        layout.numColumns=2;
        form.getBody().setLayout(layout);

        responsesViewer = new TableViewer(form.getBody(), SWT.BORDER | SWT.MULTI );
        responsesTable=responsesViewer.getTable();
        GridData gd=new GridData(GridData.FILL_VERTICAL);
        gd.widthHint=400;
        responsesTable.setLayoutData( gd );
        
        responsesTable.setHeaderVisible(true);
        toolkit.adapt(responsesTable, true, true);
        
        //Add providers columns
        TableLayout tableLayout = new TableLayout();
        responsesTable.setLayout(tableLayout);
        
        TableViewerColumn molCol=new TableViewerColumn(responsesViewer, SWT.NONE);
        molCol.getColumn().setText("ID");
        tableLayout.addColumnData(new ColumnPixelData(250));
        
        TableViewerColumn responseCol=new TableViewerColumn(responsesViewer, SWT.NONE);
        responseCol.getColumn().setText("Response");
        tableLayout.addColumnData(new ColumnPixelData(100));

        
        responsesViewer.setContentProvider(new ArrayContentProvider());
        responsesViewer.setLabelProvider(new DescriptorLabelProvider());

        //Sort by name
        responsesViewer.setSorter(new ViewerSorter());

        responsesTable.addKeyListener( new KeyListener(){
            public void keyPressed( KeyEvent e ) {
                //Delete key
                if (e.keyCode==SWT.DEL){
                    deleteSelectedResponses();
                }
                
                //Space key, toggle selection
                if (e.keyCode==32){

              	  IStructuredSelection msel=(IStructuredSelection) responsesViewer.getSelection();
                    //TODO: implement
                    
                }
            }
            public void keyReleased( KeyEvent e ) {
            }
        });

        Button btnAdd=toolkit.createButton(form.getBody(), "Import values... ", SWT.PUSH);
        btnAdd.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event e) {
                importResponses();
            }
          });
        GridData gda2=new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        gda2.widthHint=100;
        btnAdd.setLayoutData( gda2 );
        
        toolkit.paintBordersFor(form);
        
        synchronizeResponesWithModel();

		//Populate selected descriptors from the read qsar model 
//		populateResponsesViewerFromModel();
        if (responsesList.eContents()!=null){
    		responsesViewer.setInput(responsesList.eContents().toArray());
        }

        //Post selections to Eclipse via our intermediate selectionprovider
        selectionProvider.setSelectionProviderDelegate( responsesViewer );
//        responsesViewer.getTable().setFocus();
    }

    
	private void synchronizeResponesWithModel() {

		List<ICDKMolecule> allMolecules=new ArrayList<ICDKMolecule>();
		
		//Go through all molecules in moleculeResources and make sure they have a response
		for (MoleculeResourceType molres : qsarModel.getMoleculelist().getMoleculeResource()){

			int molIndex=0;
			
			//Only work with files for now. TODO: include URL:s 
			try {
				List<ICDKMolecule> mols = cdk.loadMolecules(molres.getFile());
				for (ICDKMolecule mol : mols){
					
					//Add to list of total mols
					allMolecules.add(mol);

					boolean hasResponse=false;
					
					//Does this one have a response already?
					for (ResponseType response : responsesList.getResponse()){
						if (response.getMoleculeResource().equals(molres.getId())){
							if (response.getResourceIndex()==molIndex){
								logger.debug("Found an existing response for mol: " + mol.getName());
								hasResponse=true;
							}
						}
					}
					
					if (!hasResponse){
						//Create a new response
						ResponseType newResponse=QsarFactory.eINSTANCE.createResponseType();
						newResponse.setMoleculeResource(molres.getId());
						newResponse.setResourceIndex(molIndex);
						newResponse.setValue(Float.NaN);
						responsesList.getResponse().add(newResponse);
						//Do not use command, this will fire dirty.
						//Keep silent, if things do not change we will recreate
						//these the next time.
					}
					
					//TODO: remove any responses that refers to a non-existing
					//molecularResource (on resource removal).
					
					//Get next mol
					molIndex++;

				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (BioclipseException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}


	private void populateResponsesViewerFromModel() {

		
		
		responsesViewer.setInput(responsesList.eContents().toArray());
		
/*		
		// The content provider is responsible to handle add and
		// remove notification for the Person#address EList
		ObservableListContentProvider provider = new ObservableListContentProvider();
		responsesViewer.setContentProvider(provider);

		// The label provider in turn handles the addresses
		// The EStructuralFeature[] defines which fields get shown
		// in the TableViewer columns
		IObservableSet knownElements = provider.getKnownElements();
		IObservableMap[] observeMaps = EMFEditObservables.
			observeMaps(editingDomain, knownElements, new EStructuralFeature[]{
					QsarPackage.Literals.DESCRIPTOR_TYPE__ID});
		ObservableMapLabelProvider labelProvider =
			new ObservableQSARLabelProvider(observeMaps);
		responsesViewer.setLabelProvider(labelProvider);

		// Person#addresses is the Viewer's input
		responsesViewer.setInput(EMFEditObservables.observeList(Realm.getDefault(), editingDomain, descriptorList,
			QsarPackage.Literals.DESCRIPTORLIST_TYPE__DESCRIPTOR));
*/
	}


	protected void importResponses() {
		
		showMessage("Not implemented yet");
		
	}


	/**
     * Handle the case when users press the Remove button next to moleculeviewer
     * or presses the delete button on something
     */
    protected void deleteSelectedResponses() {
    	
    	System.out.println("Delete responses not implemented");
    	
/*    	
    	IStructuredSelection ssel=(IStructuredSelection) rightViewer.getSelection();
		
    	CompoundCommand ccmd=new CompoundCommand();

    	//Collect commands from selection
    	for (Iterator<?> it=ssel.iterator(); it.hasNext();){

    		Object obj = it.next();
    		
    		if (obj instanceof DescriptorType) {
				DescriptorType descType = (DescriptorType) obj;
				Command cmd=RemoveCommand.create(editingDomain, descriptorList, QsarPackage.Literals.DESCRIPTORLIST_TYPE__DESCRIPTOR, descType);
				ccmd.append(cmd);
			}
    		
    	}

		//Execute the commands
		editingDomain.getCommandStack().execute(ccmd);
*/
    }

    private void showMessage(String message) {
        MessageDialog.openInformation( getSite().getShell(),
                                       "Information",
                                       message );
    }
    
    
    

	public void activatePage() {

        selectionProvider.setSelectionProviderDelegate( responsesViewer );
    }

    public class Stopwatch {
        private long start;
        private long stop;
        
        public void start() {
            start = System.currentTimeMillis(); // start timing
        }
        
        public void stop() {
            stop = System.currentTimeMillis(); // stop timing
        }
        
        public long elapsedTimeMillis() {
            return stop - start;
        }

        //return number of seconds
        public String toString() {
            return "" + Long.toString(elapsedTimeMillis()/1000); // print execution time
        }
    }

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}


	public Viewer getViewer() {
		return responsesViewer;
	}


}
