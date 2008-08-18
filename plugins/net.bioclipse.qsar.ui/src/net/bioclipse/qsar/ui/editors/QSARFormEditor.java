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
import java.util.Collections;

import org.apache.log4j.Logger;
import net.bioclipse.core.util.LogUtils;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.util.QsarAdapterFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

public class QSARFormEditor extends FormEditor implements IResourceChangeListener, IAdaptable{

    private static final Logger logger = Logger.getLogger(QSARFormEditor.class);
    
    private QsarXMLEditor xmlEditor;
    private MoleculesPage molPage;
    
    private IProject activeProject;

	private QsarType qsarModel;

	private Resource resource;

	private ResourceSetImpl resourceSet;

	private int textEditorIndex;

	private int molPageIndex;

	private AdapterFactoryEditingDomain editingDomain;

	//For delegating selections in MPE with two sections
    private MoleculesEditorSelectionProvider selectionProvider;

	private DescriptorsPage descPage;

	private int descPageIndex;

    
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
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
        initialize();
    }

    /**
     * Do customizations based on project
     */
    private void initialize() {

		QsarAdapterFactory factory=new QsarAdapterFactory();
		editingDomain=new AdapterFactoryEditingDomain(factory, new BasicCommandStack());
        selectionProvider=new MoleculesEditorSelectionProvider();

    	
    	//Get project
        if (!(getEditorInput() instanceof IFileEditorInput)) {
            return;
        }

        
        try {
			parseInput();
		} catch (CoreException e) {
            logger.error("Could not parse input: " + e.getMessage());
			e.printStackTrace();
			
			//Close editor?
		}

        //Get molecules folder if exists
        IFolder molFolder=activeProject.getFolder("molecules");
        if (!(molFolder.exists())){
            logger.error("Folder 'molecules'  does not exist.");
        }

    }

    //Read and parse with EMF
    private void parseInput() throws CoreException {

    	IFileEditorInput input = (IFileEditorInput) getEditorInput();
        activeProject=input.getFile().getProject();
        
        IFile file=input.getFile();


        // Create a resource set.
        resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        
        //Use XMI
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
//        		Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        //Use EcoresXMI, = UTF-8 and 80 char cols.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
        		Resource.Factory.Registry.DEFAULT_EXTENSION, new EcoreResourceFactoryImpl());


        // Register the package -- only needed for stand-alone!
        QsarPackage qsarPackage=QsarPackage.eINSTANCE;

        // Get the URI of the model file.
        URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);

        // Demand load the resource for this file.
        resource = resourceSet.getResource(fileURI, true);
        
        if (resource.getContents()==null){
        	throw new PartInitException("No contents in parsed resource");
        }

        //Should be only one docroot
        if (!(resource.getContents().get(0) instanceof DocumentRoot)) {
        	throw new PartInitException("Documentroot is not of QSAR type");
		}
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

		//Store the model
		qsarModel=root.getQsar();

        // Print the contents of the resource to System.out.
        try
        {
        	resource.save(System.out, Collections.EMPTY_MAP);
        }
        catch (IOException e) {
        }

	}



	@Override
    protected void addPages() {

		//Create the MoleculesPage
		molPage=new MoleculesPage(this, qsarModel, editingDomain, selectionProvider);
		descPage=new DescriptorsPage(this, qsarModel, editingDomain, selectionProvider);

        try {
            //Molecules page with interactions
            molPageIndex=addPage(molPage);
//            setPageText(molPageIndex, "Molecules");

            //Descriptors page
            descPageIndex=addPage(descPage);
//            setPageText(descPageIndex, "Descriptors");

            //Texteditor, should be XMLEditor: TODO
            xmlEditor = new QsarXMLEditor(this);
            textEditorIndex = addPage(xmlEditor, getEditorInput());
            setPageText(textEditorIndex, "Source");

        } catch (PartInitException e) {
            LogUtils.debugTrace(logger, e);
        }
        
        getSite().setSelectionProvider( selectionProvider );

    }



    @Override
    public void doSave(IProgressMonitor monitor) {
    	
    	//Take QSAR model and save it
		try {
			
			updateTextEditorFromModel();
			xmlEditor.doSave(monitor);
			
/*
			//Clear resource and add current model
			resource.getContents().clear();
			DocumentRoot root=QsarFactory.eINSTANCE.createDocumentRoot();
			root.setQsar(qsarModel);
			
			resource.getContents().add(root);
			resource.save(Collections.EMPTY_MAP);
*/
			//Clean all dirty flags
			setDirty(false);

			//Serialize to byte[] and print to sysout
//			ByteArrayOutputStream os=new ByteArrayOutputStream();
//			resource.save(os, Collections.EMPTY_MAP);
//
//			System.out.println(new String(os.toByteArray()));

		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }

	private void setDirty(boolean b) {

		if (pages != null) {
			for (int i = 0; i < pages.size(); i++) {
				if (pages.get(i) instanceof MoleculesPage) {
					MoleculesPage mpage = (MoleculesPage) pages.get(i);
					mpage.setDirty(false);
				}
			}
		}
	}


	@Override
	public void doSaveAs() {
	}

    @Override
    public boolean isSaveAsAllowed() {
        return false;
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

    		//Only serialize if dirty on mols page
    		if (molPage.isDirty()){

    			try {
    	    		//Serialize to XML, update editor
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


	protected void fireDirtyChanged() {
        Runnable r= new Runnable() {
            public void run() {
                firePropertyChange(PROP_DIRTY);
            }
        };
        Display fDisplay = getSite().getShell().getDisplay();
        fDisplay.asyncExec(r);
        
	}


	public void markPagesSaved() {
		molPage.setDirty(false);
	}

}
