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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import net.bioclipse.cdk.business.Activator;
import net.bioclipse.cdk.business.ICDKManager;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;
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
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

public class DescriptorsPage extends FormPage {

    private TreeViewer descViewer;
    private Tree descTree;

    private TableViewer rightViewer;
    private Table rightTable;

    
    private MoleculesContentProvider molContentProv;

    private static final Logger logger = Logger.getLogger(MoleculesPage.class);
    
    ICDKManager cdk;
    DecimalFormat formatter;
    
    private MoleculesEditorSelectionProvider selectionProvider;
	private EditingDomain editingDomain;

	private DescriptorlistType descriptorList;
	
	private boolean dirty;
	
	IQsarManager qsar;
	
	private OnlyWithImplFilter onlyWithImplFilter = new OnlyWithImplFilter();

    
	public DescriptorsPage(FormEditor editor, QsarType qsarModel, 
			EditingDomain editingDomain, MoleculesEditorSelectionProvider selectionProvider) {

		super(editor, "qsar.descriptors", "Descriptors");
		this.editingDomain=editingDomain;
	    
		cdk=Activator.getDefault().getCDKManager();
        molContentProv=new MoleculesContentProvider();
        formatter = new DecimalFormat("0.00");
        this.selectionProvider=selectionProvider;

        //Get qsarmanager via OSGI
        qsar=net.bioclipse.qsar.init.Activator.getDefault().getQsarManager();
	    
		//Get mollist from qsar model, init if empty (should not be)
		descriptorList=qsarModel.getDescriptorlist();
		if (descriptorList==null){
			descriptorList=QsarFactory.eINSTANCE.createDescriptorlistType();
			qsarModel.setDescriptorlist(descriptorList);
		}

		dirty=false;

	}


    /**
     * Add content to form
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {

        
        ScrolledForm form = managedForm.getForm();
        FormToolkit toolkit = managedForm.getToolkit();
        form.setText("Descriptors for QSAR analysis");
//        form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(FormArticlePlugin.IMG_FORM_BG));
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        form.getBody().setLayout(layout);
        createDescriptorSection(form, toolkit);
        createRightSection(form, toolkit);

		descViewer.setInput(new PendingObject());
		descViewer.refresh();

		descViewer.getTree().getDisplay().asyncExec(new Runnable() {

			public void run() {
				DescriptorModel descModel=qsar.getModel();
				descViewer.setInput(descModel);
			}
		});

        
        //Set descriptor model as input object

        //Post selections to Eclipse via our intermediate selectionprovider
        selectionProvider.setSelectionProviderDelegate( descViewer );
    }
    




    /**
     * Create the left part of the page for displaying molecules
     * @param form
     * @param toolkit
     */
    private void createDescriptorSection( final ScrolledForm form,
                                         FormToolkit toolkit) {

        Section descSection =
            toolkit.createSection(
              form.getBody(),
              Section.TWISTIE | Section.DESCRIPTION);
          descSection.setActiveToggleColor(
            toolkit.getHyperlinkGroup().getActiveForeground());
          descSection.setToggleColor(
            toolkit.getColors().getColor(IFormColors.SEPARATOR));
          toolkit.createCompositeSeparator(descSection);
          Composite client = toolkit.createComposite(descSection, SWT.WRAP);
          GridLayout layout = new GridLayout();
          layout.numColumns = 2;
          client.setLayout(layout);
          
          final Button btnOnlyImpl=toolkit.createButton(client, "Display only with implementation", SWT.CHECK);
          btnOnlyImpl.setSelection(true);
          btnOnlyImpl.addSelectionListener(new SelectionAdapter(){
        	  @Override
        	public void widgetSelected(SelectionEvent e) {
        		  if (btnOnlyImpl.getSelection()==true){
        			  descViewer.addFilter(onlyWithImplFilter);
        		  }
        		  else if (btnOnlyImpl.getSelection()==false){
        			  descViewer.removeFilter(onlyWithImplFilter);
        		  }
        	}
        	  
          });
          GridData gdBTN=new GridData(GridData.FILL_HORIZONTAL);
          gdBTN.horizontalSpan=2;
          btnOnlyImpl.setLayoutData( gdBTN );


          descViewer = new TreeViewer(client, SWT.BORDER | SWT.MULTI );
          descTree=descViewer.getTree();
          toolkit.adapt(descTree, true, true);
          GridData gd=new GridData(GridData.FILL_VERTICAL);
          gd.widthHint=350;
          descTree.setLayoutData( gd );
          
          descTree.setHeaderVisible(true);
//          molTable.setLinesVisible(true);
          toolkit.adapt(descTree, true, true);
          
          //Add providers columns
          TableLayout tableLayout = new TableLayout();
          descTree.setLayout(tableLayout);
          
          TreeViewerColumn firstCol=new TreeViewerColumn(descViewer, SWT.NONE);
          firstCol.getColumn().setText("");
          tableLayout.addColumnData(new ColumnPixelData(250));
          
          TreeViewerColumn providersCol=new TreeViewerColumn(descViewer, SWT.NONE);
          providersCol.getColumn().setText("Provider(s)");
          tableLayout.addColumnData(new ColumnPixelData(100));
          
          descViewer.setContentProvider( new DescriptorContentProvider());
          descViewer.setLabelProvider( new DescriptorLabelProvider() );
          descViewer.setUseHashlookup(true);
          
          //Sort by name
          descViewer.setSorter(new ViewerSorter());

          //Default is to only show with impl (checkbox is selected!)
          descViewer.addFilter(onlyWithImplFilter);

          descTree.addKeyListener( new KeyListener(){
              public void keyPressed( KeyEvent e ) {
                  //Delete key
                  if (e.keyCode==SWT.DEL){
                      deleteSelectedDescriptors();
                  }
                  
                  //Space key, toggle selection
                  if (e.keyCode==32){

                	  IStructuredSelection msel=(IStructuredSelection) descViewer.getSelection();
                      //TODO: implement
                      
                  }
              }
              public void keyReleased( KeyEvent e ) {
              }
          });

          //Create composite centered vertically and add buttons to it
          Composite comp = toolkit.createComposite(client, SWT.WRAP);
          comp.setLayout(new GridLayout());
          GridData gd2=new GridData(GridData.VERTICAL_ALIGN_CENTER);
          comp.setLayoutData( gd2 );

          Button btnAdd=toolkit.createButton(comp, " >> ", SWT.PUSH);
          btnAdd.addListener(SWT.Selection, new Listener() {
              public void handleEvent(Event e) {
                  addSelectedDescriptors();
              }
            });
          GridData gda2=new GridData(GridData.VERTICAL_ALIGN_CENTER);
          gda2.widthHint=60;
          btnAdd.setLayoutData( gda2 );

          Button btnDel=toolkit.createButton(comp, " << ", SWT.PUSH);
          btnDel.addListener(SWT.Selection, new Listener() {
              public void handleEvent(Event e) {
                  deleteSelectedDescriptors();
              }
            });
          GridData gd21=new GridData(GridData.VERTICAL_ALIGN_CENTER);
          gd21.widthHint=60;
          btnDel.setLayoutData( gd21 );

          
          //Wrap up section
          toolkit.paintBordersFor(client);
          descSection.setText("Avaliable descriptors");
          descSection.setDescription("Descriptors available for QSAR analysis");
          descSection.setClient(client);
          descSection.setExpanded(true);
          descSection.addExpansionListener(new ExpansionAdapter() {
            public void expansionStateChanged(ExpansionEvent e) {
              form.reflow(false);
            }
          });

          GridData gd122 = new GridData(GridData.FILL_BOTH);
          descSection.setLayoutData(gd122);        
          
    }
    


    /**
     * Handle the case when users press the ADD button next to moleculeviewer
     */
    protected void addSelectedDescriptors() {

    	//TODO implement
    	showMessage("Not implemented");

    }



    /**
     * Handle the case when users press the Remove button next to moleculeviewer
     * or presses the delete button on something
     */
    protected void deleteSelectedDescriptors() {
    	
    	//TODO implement
    	showMessage("Not implemented");

    }

    private void showMessage(String message) {
        MessageDialog.openInformation( getSite().getShell(),
                                       "Information",
                                       message );
    }

    
    
    
    
    private void createRightSection( final ScrolledForm form,
    		FormToolkit toolkit) {

    	Section preSection =
    		toolkit.createSection(
    				form.getBody(),
    				Section.TWISTIE | Section.DESCRIPTION);
    	preSection.setActiveToggleColor(
    			toolkit.getHyperlinkGroup().getActiveForeground());
    	preSection.setToggleColor(
    			toolkit.getColors().getColor(IFormColors.SEPARATOR));
    	toolkit.createCompositeSeparator(preSection);
    	Composite client = toolkit.createComposite(preSection, SWT.WRAP);
    	GridLayout layout = new GridLayout();
    	layout.numColumns = 2;
    	client.setLayout(layout);


    	//Query TreeViewer
    	rightViewer = new TableViewer (client, SWT.BORDER | SWT.SINGLE);
    	rightViewer.setContentProvider( new PreprocessingContentProvider() );
    	rightViewer.setLabelProvider( new PreprocessingLabelProvider() );
    	rightTable=rightViewer.getTable();
    	toolkit.adapt(rightTable, true, true);
    	GridData gd6=new GridData(GridData.FILL_VERTICAL);
    	gd6.widthHint=200;
    	rightTable.setLayoutData( gd6 );

    	rightTable.addKeyListener( new KeyListener(){
    		public void keyPressed( KeyEvent e ) {

    			//Delete key
    			if (e.keyCode==SWT.DEL){
    				deleteSelectedDescriptors();
    			}

    		}
    		public void keyReleased( KeyEvent e ) {
    		}
    	});


    	//Wrap up section
    	toolkit.paintBordersFor(client);
    	preSection.setText("Selected descriptors");
    	preSection.setDescription("Add descriptors here for calculation");
    	preSection.setClient(client);
    	preSection.setExpanded(true);
    	preSection.addExpansionListener(new ExpansionAdapter() {
    		public void expansionStateChanged(ExpansionEvent e) {
    			form.reflow(false);
    		}
    	});
    	GridData gd = new GridData(GridData.FILL_BOTH);
    	preSection.setLayoutData(gd);        

    	//Post selections to Eclipse
    	//getSite().setSelectionProvider(queryViewer);

    }





	public void activatePage() {

        selectionProvider.setSelectionProviderDelegate( descViewer );
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

	public void setDirty(boolean dirty) {
		this.dirty=dirty;
		((QSARFormEditor)getEditor()).fireDirtyChanged();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

}
