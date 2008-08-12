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
package net.bioclipse.qsar.editors;

import java.util.ArrayList;
import java.util.List;

import net.bioclipse.ui.dialogs.WSFileDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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

    public MoleculesPage(FormEditor editor) {
        super(editor, "qsar.molecules", "Molecules");
        molecules=new ArrayList<IResource>();
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
                    if (!(molecules.contains( resource )))
                        molecules.add( resource );
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

    }
}
