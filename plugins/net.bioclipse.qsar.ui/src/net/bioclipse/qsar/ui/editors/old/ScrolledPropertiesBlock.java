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
import net.bioclipse.qsar.ui.Activator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.*;
import org.eclipse.ui.forms.*;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.*;
/**
 *
 */
public class ScrolledPropertiesBlock extends MasterDetailsBlock {
    private FormPage page;
    public ScrolledPropertiesBlock(FormPage page) {
        this.page = page;
    }
    /**
     * @param id
     * @param title
     */
    class MasterContentProvider implements IStructuredContentProvider {
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof SimpleFormEditorInput) {
                SimpleFormEditorInput input = (SimpleFormEditorInput) page
                        .getEditor().getEditorInput();
                return input.getModel().getContents();
            }
            else if (inputElement instanceof SimpleFormEditorInput) {
                SimpleFormEditorInput input = (SimpleFormEditorInput) page
                        .getEditor().getEditorInput();
                return input.getModel().getContents();
            }
            return new Object[0];
        }
        public void dispose() {
        }
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }
    }
    class MasterLabelProvider extends LabelProvider
            implements
                ITableLabelProvider {
        public String getColumnText(Object obj, int index) {
            return obj.toString();
        }
        public Image getColumnImage(Object obj, int index) {
            if (obj instanceof TypeOne) {
                return PlatformUI.getWorkbench().getSharedImages().getImage(
                        ISharedImages.IMG_OBJ_ELEMENT);
            }
            if (obj instanceof TypeTwo) {
                return PlatformUI.getWorkbench().getSharedImages().getImage(
                        ISharedImages.IMG_OBJ_FILE);
            }
            return null;
        }
    }
    protected void createMasterPart(final IManagedForm managedForm,
            Composite parent) {
        //final ScrolledForm form = managedForm.getForm();
        FormToolkit toolkit = managedForm.getToolkit();
        Section section = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
        section.setText("ScrolledPropertiesBlock.sname");
        section
                .setDescription("ScrolledPropertiesBlock.sdesc");
        section.marginWidth = 10;
        section.marginHeight = 5;
        Composite client = toolkit.createComposite(section, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        Table t = toolkit.createTable(client, SWT.NULL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = 20;
        gd.widthHint = 100;
        t.setLayoutData(gd);
        toolkit.paintBordersFor(client);
        Button b = toolkit.createButton(client, "ScrolledPropertiesBlock.add", SWT.PUSH);
        gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        b.setLayoutData(gd);
        section.setClient(client);
        final SectionPart spart = new SectionPart(section);
        managedForm.addPart(spart);
        TableViewer viewer = new TableViewer(t);
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                managedForm.fireSelectionChanged(spart, event.getSelection());
            }
        });
        viewer.setContentProvider(new MasterContentProvider());
        viewer.setLabelProvider(new MasterLabelProvider());
        viewer.setInput(page.getEditor().getEditorInput());
    }
    protected void createToolBarActions(IManagedForm managedForm) {
        final ScrolledForm form = managedForm.getForm();
        Action haction = new Action("hor", Action.AS_RADIO_BUTTON) { 
            public void run() {
                sashForm.setOrientation(SWT.HORIZONTAL);
                form.reflow(true);
            }
        };
        haction.setChecked(true);
        haction.setToolTipText("horiz");
//        haction.setImageDescriptor(Activator.getDefault()
//                .getImageRegistry()
//                .getDescriptor(Activator.IMG_HORIZONTAL));
        Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
            public void run() {
                sashForm.setOrientation(SWT.VERTICAL);
                form.reflow(true);
            }
        };
        vaction.setChecked(false);
        vaction.setToolTipText("ScrolledPropertiesBlock.vertical");
//        vaction.setImageDescriptor(Activator.getDefault()
//                .getImageRegistry().getDescriptor(Activator.IMG_VERTICAL));
        form.getToolBarManager().add(haction);
        form.getToolBarManager().add(vaction);
    }
    protected void registerPages(DetailsPart detailsPart) {
        detailsPart.registerPage(TypeOne.class, new TypeOneDetailsPage());
        detailsPart.registerPage(TypeTwo.class, new TypeTwoDetailsPage());
    }
}