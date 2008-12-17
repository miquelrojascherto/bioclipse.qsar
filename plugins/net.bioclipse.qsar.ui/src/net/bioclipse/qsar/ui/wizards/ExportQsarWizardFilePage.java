package net.bioclipse.qsar.ui.wizards;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;
public class ExportQsarWizardFilePage extends WizardPage implements IWizardPage {
        private ExportQsarWizard wiz;
        protected ExportQsarWizardFilePage(String pageName) {
                super(pageName);
        }
        public void createControl(Composite parent) {
                wiz=(ExportQsarWizard)getWizard();
                Composite body = new Composite(parent, SWT.NONE);
                Layout l=new GridLayout(3, false);
                body.setLayout(l);
//		GridData gd= new GridData(GridData.FILL_BOTH);
//		body.setLayoutData(gd);
                Label lbl=new Label(body, SWT.NONE);
                lbl.setText("Filename: ");
                GridData gdlbl= new GridData();
                gdlbl.widthHint=100;
                lbl.setLayoutData(gdlbl);
                Text text=new Text(body, SWT.BORDER);
                GridData gdtxt= new GridData(GridData.FILL_HORIZONTAL);
                text.setLayoutData(gdtxt);
                Button browse = new Button(body, SWT.NONE);
                browse.setText("Browse...");
                GridData gdbtn= new GridData();
                browse.setLayoutData(gdbtn);
                gdbtn.widthHint=100;
                browse.addSelectionListener(new SelectionAdapter(){
                        public void widgetSelected(SelectionEvent e) {
                                FileDialog fd=new FileDialog(getShell());
                                String filename=fd.open();
                                if (filename!=null){
                                        wiz.setFilename(filename);
                                        setErrorMessage(null);
                                        setPageComplete(true);
                                }
                                else{
                                        wiz.setFilename(filename);
                                        setErrorMessage("Please enter/choose a valid path to a file");
                                        setPageComplete(false);
                                }
                                getWizard().getContainer().updateButtons();
                        }
                });
                setControl(body);
        }
}
