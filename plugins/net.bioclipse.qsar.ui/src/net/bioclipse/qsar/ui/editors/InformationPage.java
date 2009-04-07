/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package net.bioclipse.qsar.ui.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.forms.*;
import org.eclipse.ui.forms.editor.*;
import org.eclipse.ui.forms.widgets.*;
/**
 *
 */
public class InformationPage extends FormPage implements IEditingDomainProvider, IPageChangedListener{
    private CTabFolder tabFolder;
    private Text text;
    private AdapterFactoryEditingDomain editingDomain;
    private QsarEditorSelectionProvider selectionProvider;

    class TextSection {
        String text;
        public TextSection(String text) {this.text = text;}
    }

    public InformationPage(QsarEditor editor,
                           AdapterFactoryEditingDomain editingDomain,
                           QsarEditorSelectionProvider selectionProvider) {

        super(editor, "qsar.model.information", "Information");
        this.editingDomain=editingDomain;

        this.selectionProvider=selectionProvider;

        editor.addPageChangedListener(this);

    }
    protected void createFormContent(IManagedForm managedForm) {
        

        
        ScrolledForm form = managedForm.getForm();
        FormToolkit toolkit = managedForm.getToolkit();
        form.setText("Qsar Model Information");
        
        toolkit.decorateFormHeading(form.getForm());
        
        IProject project=((QsarEditor)getEditor()).getActiveProject();
        ToolbarHelper.setupToolbar(form, project);
        
        //		form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(
        //				FormArticlePlugin.IMG_FORM_BG));
        
        GridLayout layout = new GridLayout();
        layout.marginWidth = 10;
        form.getBody().setLayout(layout);
        tabFolder = new CTabFolder(form.getBody(), SWT.FLAT|SWT.TOP);
        toolkit.adapt(tabFolder, true, true);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.heightHint = 0;
        tabFolder.setLayoutData(gd);
        Color selectedColor = toolkit.getColors().getColor(IFormColors.SEPARATOR);
        tabFolder.setSelectionBackground(new Color[] {selectedColor, toolkit.getColors().getBackground()}, new int[] {50});
        //tabFolder.setCursor(FormsResources.getHandCursor());

        toolkit.paintBordersFor(tabFolder);
        createTabs(toolkit);
        createText(toolkit, form.getBody());
        tabFolder.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                updateSelection();
            }
        });
        tabFolder.setSelection(0);
        updateSelection();		
        
//        PlatformUI.getWorkbench().getHelpSystem().setHelp(form.getBody(), IHelpContextIds.MANIFEST_FEATURE_INFO);
    }
    
    private void createTabs(FormToolkit toolkit) {
        createGeneralTab(toolkit, "General info", ".");
        createTab(toolkit, "Description", "A description of the QSAR dataset.");
        createTab(toolkit, "Copyright", "This is where the copyright should go");
        createTab(toolkit, "License", "This is where the license for the QSAR dataset should go.");
    }
    private void createText(FormToolkit toolkit, Composite parent) {
        Composite tabContent = toolkit.createComposite(parent);
        tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout();
        tabContent.setLayout(layout);
        layout.numColumns = 2;
        layout.marginWidth = 0;
        GridData gd;
        text = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP); //$NON-NLS-1$
        gd = new GridData(GridData.FILL_BOTH);
        gd.verticalSpan = 2;
        text.setLayoutData(gd);
        Button apply = toolkit.createButton(tabContent, "Apply", SWT.PUSH);
        apply.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL|GridData.VERTICAL_ALIGN_BEGINNING));
        Button reset = toolkit.createButton(tabContent, "Reset", SWT.PUSH);
        reset.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL|GridData.VERTICAL_ALIGN_BEGINNING));
    }
    private void updateSelection() {
        CTabItem item = tabFolder.getSelection();
        TextSection section = (TextSection)item.getData();
        if (section!=null)
            text.setText(section.text);
    }
    private void createTab(FormToolkit toolkit, String title, String content) {
        CTabItem item = new CTabItem(tabFolder, SWT.NULL);
        TextSection section = new TextSection(content);
        item.setText(title);
        item.setData(section);
    }

    private void createGeneralTab(FormToolkit toolkit, String title, String content) {
        CTabItem item = new CTabItem(tabFolder, SWT.NULL);
        Text txtDatasetName = toolkit.createText( tabFolder, "wee" );
        item.setText(title);
//        item.setData(section);
    }

    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

    public void pageChanged( PageChangedEvent event ) {

        System.out.println("PAGECHANGE IN INFOPAGE NOT IMPLEMENTED!");

    }
}