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

import org.apache.log4j.Logger;
import net.bioclipse.core.util.LogUtils;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.editor.FormEditor;

public class QSARFormEditor extends FormEditor implements IResourceChangeListener, IAdaptable{

    private static final Logger logger = Logger.getLogger(QSARFormEditor.class);
    
    private TextEditor textEditor;
    private MoleculesPage molPage;
    
    private IProject activeProject;
    
    
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
        //Get project
        if (!(getEditorInput() instanceof IFileEditorInput)) {
            return;
        }
        IFileEditorInput edin = (IFileEditorInput) getEditorInput();
        activeProject=edin.getFile().getProject();

        //Get molecules folder if exists
        IFolder molFolder=activeProject.getFolder("molecules");
        if (!(molFolder.exists())){
            System.out.println("Folder 'molecules'  does not exist.");
            //TODO: report error in some way
            return;
        }
        
    }

    @Override
    protected void addPages() {
        molPage=new MoleculesPage(this);
        try {
            //Molecules page with interactions
            addPage(molPage);

            //Descriptors page
//            addPage(descPage);

            //Texteditor, should be XMLEditor: TODO
            textEditor = new TextEditor();
            int index = addPage(textEditor, getEditorInput());
            setPageText(index, textEditor.getTitle());

        } catch (PartInitException e) {
            LogUtils.debugTrace(logger, e);
        }
    }



    @Override
    public void doSave(IProgressMonitor monitor) {
        //TODO
    }

    @Override
    public void doSaveAs() {
        //TODO
    }

    @Override
    public boolean isSaveAsAllowed() {
        //TODO
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

}
