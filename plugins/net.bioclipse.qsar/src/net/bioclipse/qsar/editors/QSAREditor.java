/*******************************************************************************
 * Copyright (c) 2007 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     ola - initial API and implementation
 *     
 *******************************************************************************/
package net.bioclipse.qsar.editors;

import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JScrollPane;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
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
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MultiPageEditorPart;

/**
 * An MultiPageEditor with Molecules on first tabl, Descriptors on second, and 
 * source in XML on third.
 * 
 * @author ola
 *
 */
public class QSAREditor extends MultiPageEditorPart implements IResourceChangeListener, IAdaptable{

    private static final Logger logger = Logger.getLogger(QSAREditor.class);
    
	private FormToolkit toolkit;
	private ScrolledForm moleculesForm;		


	/** The text editor used in page 1. */
	private TextEditor textEditor;

	/** Registered listeners */
	private List<ISelectionChangedListener> selectionListeners;

	/** Content of the file */
	String content;


	/**
	 * Creates a multi-page editor example.
	 */
	public QSAREditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		selectionListeners=new ArrayList<ISelectionChangedListener>();
	}

	/**
	 * Creates page 0 of the multi-page editor,
	 * which consists of the molecules section
	 */
	void createPage0() {
		Composite parent = new Composite(getContainer(), SWT.NONE);
		FillLayout layout=new FillLayout();
		parent.setLayout(layout);

		//Get project
		if (!(getEditorInput() instanceof IFileEditorInput)) {
			return;
		}
		IFileEditorInput edin = (IFileEditorInput) getEditorInput();
		IProject project=edin.getFile().getProject();

		//Get molecules folder if exists
		IFolder molFolder=project.getFolder("molecules");
		if (!(molFolder.exists())){
			System.out.println("Folder 'molecules'  does not exist.");
			//TODO: report error in some way
			return;
		}

		//Init forms
		toolkit = new FormToolkit(parent.getDisplay());
		moleculesForm = toolkit.createScrolledForm(parent);

		moleculesForm.setText("Hello, Eclipse Forms");

		TableWrapLayout tlayout = new TableWrapLayout();
		moleculesForm.getBody().setLayout(tlayout);		
		
		  Hyperlink link = toolkit.createHyperlink(moleculesForm.getBody(),"Click here.", SWT.WRAP);
		  link.addHyperlinkListener(new HyperlinkAdapter() {
		   public void linkActivated(HyperlinkEvent e) {
		    System.out.println("Link activated!");
		   }
		  });
		  link.setText("This is an example of a form that is much longer and will need to wrap.");
		  tlayout.numColumns = 2;
		  TableWrapData td = new TableWrapData();
		  td.colspan = 2;
		  link.setLayoutData(td);
		  Label label = toolkit.createLabel(moleculesForm.getBody(), "Text field label:");
		  Text text = toolkit.createText(moleculesForm.getBody(), "");
		  td = new TableWrapData(TableWrapData.FILL_GRAB);
		  text.setLayoutData(td);
		  Button button = toolkit.createButton(moleculesForm.getBody(), "A checkbox in a form", SWT.CHECK);
		  td = new TableWrapData();
		  td.colspan = 2;
		  button.setLayoutData(td);		


		  /*
		Section section = toolkit.createSection(moleculesForm.getBody(), 
				Section.DESCRIPTION|Section.TITLE_BAR|
				Section.TWISTIE|Section.EXPANDED);
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.colspan = 2;
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				moleculesForm.reflow(true);
			}
		});
		section.setText("Section title");
		section.setDescription("This is the description that goes "+
		"below the title");
		Composite sectionClient = toolkit.createComposite(section);
		sectionClient.setLayout(new GridLayout());
		Button button = toolkit.createButton(sectionClient, "Radio 1", SWT.RADIO);
		button = toolkit.createButton(sectionClient, "Radio 2", SWT.RADIO);
		section.setClient(sectionClient);	
*/

//		//Set up CheckboxTreeViewer
//		CheckboxTreeViewer molViewer=new CheckboxTreeViewer(moleculesForm.getBody(), SWT.NONE);
//		molViewer.setContentProvider(new MoleculesContentProvider());
//		molViewer.setLabelProvider(new MoleculesLabelProvider());
////		molViewer.setSorter(sorter);
//		molViewer.setInput(molFolder);

		int index = addPage(parent);
		setPageText(index, "Molecules");

	}


	/**
	 * Creates page 2 of the multi-page editor,
	 * which contains a text editor.
	 */
	void createPage2() {
		try {
			textEditor = new TextEditor();
			int index = addPage(textEditor, getEditorInput());
			setPageText(index, textEditor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					"Error creating nested text editor",
					null,
					e.getStatus());
		}
	}


	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0(); //Molecules
//		createPage1(); //Descriptors
		createPage2(); //qsar.xml


//		getSite().getPage().addSelectionListener(this);
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		textEditor.doSave(monitor);	//Use text editor to save
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 2's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		//TODO: should it be possible to save as?
		//First we need to update the source ofthe textEditor

		textEditor.doSaveAs();
		setPageText(2, textEditor.getTitle());
		setInput(textEditor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(1);		//Only page2 has markers currently
		IDE.gotoMarker(textEditor, marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
	throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		if (newPageIndex == 0) {
			//TODO: implement!
		}
	}
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)textEditor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(textEditor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}

	private String getContentsFromEditor(){

		IEditorInput input=getEditorInput();
		if (!(input instanceof IFileEditorInput)) {
			logger.debug("Not FIleEditorInput.");
			//TODO: Close editor?
			return null;
		}
		IFileEditorInput finput = (IFileEditorInput) input;
		
		IFile file=finput.getFile();
		if (!(file.exists())){
			logger.debug("File does not exist.");
			//TODO: Close editor?
			return null;
		}

//		return file.getFullPath().toFile();


		InputStream instream;
		try {
			instream = file.getContents();
			StringBuilder builder = new StringBuilder();

			// read bytes until eof
			for(int i = instream.read(); i != -1; i = instream.read())
			{
				builder.append((char)i);
			}
			instream.close();

			return builder.toString();

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 
	 * Provide Adapters for the JmolEditor
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class required) {
		return super.getAdapter(required);
	}

	public IEditorPart getPart(){
		return this;
	}
}