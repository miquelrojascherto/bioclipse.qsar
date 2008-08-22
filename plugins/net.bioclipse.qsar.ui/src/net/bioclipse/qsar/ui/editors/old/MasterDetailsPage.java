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
package net.bioclipse.qsar.ui.editors.old;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.*;
import org.eclipse.ui.forms.widgets.*;
/**
 * @author dejan
 * 
 * To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public class MasterDetailsPage extends FormPage {
    private ScrolledPropertiesBlock block;
    public MasterDetailsPage(FormEditor editor) {
        super(editor, "fourth", "Molecules");
        block = new ScrolledPropertiesBlock(this);
    }
    protected void createFormContent(final IManagedForm managedForm) {
        final ScrolledForm form = managedForm.getForm();
        //FormToolkit toolkit = managedForm.getToolkit();
        form.setText("Molecules");
//        form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(
//                FormArticlePlugin.IMG_FORM_BG));
        block.createContent(managedForm);
    }
}