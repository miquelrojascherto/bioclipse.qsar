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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import net.bioclipse.core.util.LogUtils;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.provider.QsarItemProviderAdapterFactory;
import net.bioclipse.ui.editors.XMLEditor;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class QSARFormEditor extends FormEditor implements IResourceChangeListener, IAdaptable, IEditingDomainProvider{

    private static final Logger logger = Logger.getLogger(QSARFormEditor.class);

    private XMLEditor xmlEditor;
    private MoleculesPage molPage;
    
    private IProject activeProject;

	private QsarType qsarModel;

	private Resource resource;

	private ResourceSetImpl resourceSet;

	private int textEditorIndex;

	private int molPageIndex;
	private int descPageIndex;

	private AdapterFactoryEditingDomain editingDomain;

	//For delegating selections in MPE with two sections
    private QsarEditorSelectionProvider selectionProvider;

	private DescriptorsPage descPage;

	private ComposedAdapterFactory adapterFactory;

	private AdapterFactoryItemDelegator itemDelegator;

	private AdapterFactoryLabelProvider labelProvider;

	/**
	 * Resources that have been saved.
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource.
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated.
	 */
	protected boolean updateProblemIndication = true;

	
	/**
	 * This is the content outline page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge...
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	private PropertySheetPage propertySheetPage;

	private ResponsesPage responsesPage;

	private int responsesPageIndex;

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

    
    public IProject getActiveProject() {
    
        return activeProject;
    }

    
    public void setActiveProject( IProject activeProject ) {
    
        this.activeProject = activeProject;
    }

    /**
     * Overrides super to plug in a different selection provider.
     */
    public void init(IEditorSite site, IEditorInput input)
    throws PartInitException {
        super.init(site, input);
		setPartName(input.getName());
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);

		//Set up editingDomain
        initializeEditingDomain();

		//Create model from input
		createModel();
		
		if (input instanceof IFileEditorInput) {
			IFileEditorInput finput = (IFileEditorInput) input;
	        activeProject=finput.getFile().getProject();
		}

        selectionProvider=new QsarEditorSelectionProvider();

    }
    
    protected void initializeEditingDomain() {

    	// Create an adapter factory that yields item providers.
		this.adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		this.adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		this.adapterFactory
				.addAdapterFactory(new QsarItemProviderAdapterFactory());
		this.adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// command stack that will notify this editor as commands are executed
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the editor dirty if commands have been executed
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						editorDirtyStateChanged();
					}
				});
			}
		});

		// Create the editing domain with our adapterFactory and command stack.
		this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());
		
		// These provide access to the model items, their property source and label
		this.itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		this.labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		

	}


    /**
     * Create the model from editorInput
     */
    public void createModel() {
    	
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
//		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}

		if (resource != null) {
			DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

			//Store the model in editor
			qsarModel=root.getQsar();
			
		}
	}


	@Override
    protected void addPages() {

		//Create the MoleculesPage
		molPage=new MoleculesPage(this, qsarModel, editingDomain, selectionProvider);
		descPage=new DescriptorsPage(this, qsarModel, editingDomain, selectionProvider);
		responsesPage=new ResponsesPage(this, qsarModel, editingDomain, selectionProvider);

        try {
            //Molecules page with interactions
            molPageIndex=addPage(molPage);

            //Descriptors page
            descPageIndex=addPage(descPage);

            //Descriptors page
            responsesPageIndex=addPage(responsesPage);

            xmlEditor = new XMLEditor();
            textEditorIndex = addPage(xmlEditor, getEditorInput());
            setPageText(textEditorIndex, "Source");

        } catch (PartInitException e) {
            LogUtils.debugTrace(logger, e);
        }
        
        getSite().setSelectionProvider( selectionProvider );

    }

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		IRunnableWithProgress operation =
			new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.
				//
				public void run(IProgressMonitor monitor) {
					// Save the resources to the file system.
					//
					boolean first = true;
					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
							try {
								long timeStamp = resource.getTimeStamp();
								resource.save(saveOptions);
								if (resource.getTimeStamp() != timeStamp) {
									savedResources.add(resource);
								}
							}
							catch (Exception exception) {
								resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
							}
							first = false;
						}
					}
				}
			};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			updateTextEditorFromModel();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			logger.debug(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * Updates the problems indication with the information described in the specified diagnostic.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic =
				new BasicDiagnostic
					(Diagnostic.OK,
					 "net.bioclipse.qsar.editor",
					 0,
					 null,
					 new Object [] { editingDomain.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			}
			else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				try {
					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
//					showTabs();
				}
				catch (PartInitException exception) {
					logger.debug(exception);
				}
			}
		}
	}
	/**
	 * Returns a diagnostic describing the errors and warnings listed in the resource
	 * and the specified exception (if any).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic =
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "net.bioclipse.qsar.editor",
					 0,
					 "error creating model",
					 new Object [] { exception == null ? (Object)resource : exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		}
		else if (exception != null) {
			return
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "net.bioclipse.qsar.editor",
					 0,
					 "error creating model",
					 new Object[] { exception });
		}
		else {
			return Diagnostic.OK_INSTANCE;
		}
	}
	
	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		}
		catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		String[] filters = QsarEditorAdvisor.FILE_EXTENSION_FILTERS.toArray(
				new String[QsarEditorAdvisor.FILE_EXTENSION_FILTERS.size()]);
		String[] files = QsarEditorAdvisor.openFilePathDialog(getSite().
				getShell(), SWT.SAVE, filters);
		if (files.length > 0) {
			URI uri = URI.createFileURI(files[0]);
			doSaveAs(uri, new URIEditorInput(uri));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = new NullProgressMonitor();
//			getActionBars().getStatusLineManager() != null ?
//				getActionBars().getStatusLineManager().getProgressMonitor() :
//				new NullProgressMonitor();
		doSave(progressMonitor);
	}
	
    
    @Override
    public void dispose() {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        super.dispose();
    }

    public void resourceChanged(IResourceChangeEvent event) {
        //TODO
    }
    
    @Override
    protected void pageChange(int newPageIndex) {
    	
    	if (newPageIndex==textEditorIndex){
    		
    		if (isDirty()){
	    		//Serialize to XML, update editor
				try {
					updateTextEditorFromModel();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		}

    	}
    	
    	super.pageChange(newPageIndex);
    }
    
	private void updateTextEditorFromModel() throws IOException {

        	ByteArrayOutputStream bos=new ByteArrayOutputStream();
        	resource.save(bos, Collections.EMPTY_MAP);
        	
        	String strContent=new String(bos.toByteArray());
        	
            xmlEditor.getDocumentProvider().
            getDocument(xmlEditor.getEditorInput()).set(strContent);

	}


	public EditingDomain getEditingDomain() {
		return editingDomain;
	}


//	protected void fireDirtyChanged() {
//        Runnable r= new Runnable() {
//            public void run() {
//                firePropertyChange(PROP_DIRTY);
//            }
//        };
//        Display fDisplay = getSite().getShell().getDisplay();
//        fDisplay.asyncExec(r);
//        
//	}
//
//	public void markPagesDirty() {
//		molPage.setDirty(true);
//		descPage.setDirty(true);
//		fireDirtyChanged();
//	}
//
//	public void markPagesSaved() {
//		molPage.setDirty(false);
//		descPage.setDirty(false);
//	}
	
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return getContentOutlinePage();
		}
		else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else {
			return super.getAdapter(key);
		}
	}
	
	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage =
				new ExtendedPropertySheetPage(editingDomain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
//						QSARFormEditor.this.setSelectionToViewer(selection);
						QSARFormEditor.this.setFocus();
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						getActionBarContributor().shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}
	

	/**
	 * This accesses a cached version of the content outliner.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
					contentOutlineViewer.setInput(editingDomain.getResourceSet());

					// Make sure our popups work.
					//
//					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources().isEmpty()) {
					  // Select the root object in the view.
					  //
					  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener
				(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
//						 handleContentOutlineSelection(event.getSelection());
						 System.out.println("Selections in outline not synced with model yet!");
					 }
				 });
		}

		return contentOutlinePage;
	}	
	
	
}
