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

import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
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
    private AdapterFactoryEditingDomain editingDomain;
    private ScrolledForm form;

    class TextSection {
        String text;
        public TextSection(String text) {this.text = text;}
    }

    public InformationPage(QsarEditor editor,
                           AdapterFactoryEditingDomain editingDomain) {

        super(editor, "qsar.model.information", "Information");
        this.editingDomain=editingDomain;

        editor.addPageChangedListener(this);

    }

    protected void createFormContent(IManagedForm managedForm) {

        form = managedForm.getForm();
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
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = 0;
        tabFolder.setLayoutData(gd);
        Color selectedColor = toolkit.getColors().getColor(IFormColors.SEPARATOR);
        tabFolder.setSelectionBackground(new Color[] {selectedColor, toolkit.getColors().getBackground()}, new int[] {50});
        //tabFolder.setCursor(FormsResources.getHandCursor());

        toolkit.paintBordersFor(tabFolder);

        //Add the tabs
        createGeneralTab(toolkit);
        createReferenceTab( toolkit);
        createUnitsTab(toolkit);

        tabFolder.setSelection(0);
        
        //        PlatformUI.getWorkbench().getHelpSystem().setHelp(form.getBody(), IHelpContextIds.MANIFEST_FEATURE_INFO);
    }

    private void createGeneralTab(FormToolkit toolkit) {
        CTabItem item = new CTabItem(tabFolder, SWT.NULL);
        item.setText( "General information" );

        QsarType qsarModel = ((QsarEditor)getEditor()).getQsarModel();

        Composite tabContent = toolkit.createComposite(tabFolder);
        item.setControl( tabContent );
        tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout();
        tabContent.setLayout(layout);
        layout.numColumns = 2;
        layout.marginWidth = 0;

        //Dataset Name
        //=============
        Label lblDatasetName = toolkit.createLabel( tabContent, "Dataset Name:", SWT.NONE);
        GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblDatasetName.setLayoutData(gd2);

        Text txtDatasetName = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        txtDatasetName.setLayoutData(gd);
        gd.heightHint=16;
        
        // Bind to EMF
        DataBindingContext bindingContext = new DataBindingContext();
        bindingContext.bindValue(SWTObservables.observeText(txtDatasetName, SWT.Modify), 
                                 EMFEditObservables.observeValue(editingDomain,
                                 qsarModel.getMetadata(),
                                 QsarPackage.Literals.METADATA_TYPE__DATASETNAME),
                                 null, null);

        //Authors
        //=============
        Label lblAuthors = toolkit.createLabel( tabContent, "Author(s)", SWT.NONE);
        GridData gd3 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblAuthors.setLayoutData(gd3);

        Text txtAuthors = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP);
        GridData gd4 = new GridData(GridData.FILL_HORIZONTAL);
        txtAuthors.setLayoutData(gd4);
        gd4.heightHint=40;
        
        // Bind to EMF
        bindingContext.bindValue(SWTObservables.observeText(txtAuthors, SWT.Modify), 
                                 EMFEditObservables.observeValue(editingDomain,
                                 qsarModel.getMetadata(),
                                 QsarPackage.Literals.METADATA_TYPE__AUTHORS),
                                 null, null);

        //Description
        //=============
        Label lblDescription = toolkit.createLabel( tabContent, "Description:", SWT.NONE);
        GridData gd9 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblDescription.setLayoutData(gd9);

        Text txtDescription = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP);
        GridData gd10 = new GridData(GridData.FILL_HORIZONTAL);
        txtDescription.setLayoutData(gd10);
        gd10.heightHint=70;

        // Bind to EMF
        bindingContext.bindValue(SWTObservables.observeText(txtDescription, SWT.Modify), 
                                 EMFEditObservables.observeValue(editingDomain,
                                 qsarModel.getMetadata(),
                                 QsarPackage.Literals.METADATA_TYPE__DESCRIPTION),
                                 null, null);


        //URL
        //=============
        Label lblUrl = toolkit.createLabel( tabContent, "URL:", SWT.NONE);
        GridData gd5 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblUrl.setLayoutData(gd5);

        Text txtUrl = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP);
        GridData gd6 = new GridData(GridData.FILL_HORIZONTAL);
        txtUrl.setLayoutData(gd6);
        gd6.heightHint=16;

        // Bind to EMF
        bindingContext.bindValue(SWTObservables.observeText(txtUrl, SWT.Modify), 
                                 EMFEditObservables.observeValue(editingDomain,
                                 qsarModel.getMetadata(),
                                 QsarPackage.Literals.METADATA_TYPE__URL),
                                 null, null);

        //License
        //=============
        Label lblLicense = toolkit.createLabel( tabContent, "License:", SWT.NONE);
        GridData gd7 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblLicense.setLayoutData(gd7);

        Text txtLicense = toolkit.createText(tabContent, "", SWT.MULTI|SWT.WRAP);
        GridData gd8 = new GridData(GridData.FILL_BOTH);
        txtLicense.setLayoutData(gd8);
        
        // Bind to EMF
        bindingContext.bindValue(SWTObservables.observeText(txtLicense, SWT.Modify), 
                                 EMFEditObservables.observeValue(editingDomain,
                                 qsarModel.getMetadata(),
                                 QsarPackage.Literals.METADATA_TYPE__LICENSE),
                                 null, null);


    }

    private void createReferenceTab( FormToolkit toolkit ) {
        CTabItem item = new CTabItem(tabFolder, SWT.NULL);
        item.setText( "References" );

        Composite tabContent = toolkit.createComposite(tabFolder);
        item.setControl( tabContent );
        tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout();
        tabContent.setLayout(layout);
        layout.numColumns = 2;
        layout.marginWidth = 0;

        Label lblUnit = toolkit.createLabel( tabContent, "unit", SWT.NONE);
        GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblUnit.setLayoutData(gd2);

        Text txtUnits = toolkit.createText(tabContent, "we", SWT.MULTI|SWT.WRAP);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        txtUnits.setLayoutData(gd);
        gd.heightHint=30;




    }
    private void createUnitsTab( FormToolkit toolkit ) {
        CTabItem item = new CTabItem(tabFolder, SWT.NULL);
        item.setText( "Response units" );

        Composite tabContent = toolkit.createComposite(tabFolder);
        item.setControl( tabContent );
        tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout();
        tabContent.setLayout(layout);
        layout.numColumns = 2;
        layout.marginWidth = 0;

        Label lblUnit = toolkit.createLabel( tabContent, "unit", SWT.NONE);
        GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        lblUnit.setLayoutData(gd2);

        Text txtUnits = toolkit.createText(tabContent, "we", SWT.MULTI|SWT.WRAP);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        txtUnits.setLayoutData(gd);
        gd.heightHint=30;




    }


    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

    public void pageChanged( PageChangedEvent event ) {

        System.out.println("PAGECHANGE IN INFOPAGE NOT IMPLEMENTED!");

    }
}