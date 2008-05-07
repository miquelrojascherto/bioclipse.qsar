/*******************************************************************************
 * Copyright (c) 2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth
 *     
 ******************************************************************************/
package net.bioclipse.qsar.editors;

import org.apache.log4j.Logger;
import net.bioclipse.core.util.LogUtils;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

public class QSARFormEditor extends FormEditor implements IResourceChangeListener, IAdaptable{

    private static final Logger logger = Logger.getLogger(QSARFormEditor.class);
    
    private TextEditor textEditor;
    private MoleculesPage molPage;
    
    public QSARFormEditor() {
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
        IProject project=edin.getFile().getProject();

        //Get molecules folder if exists
        IFolder molFolder=project.getFolder("molecules");
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
            //Molecules page
            addPage(molPage);

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
