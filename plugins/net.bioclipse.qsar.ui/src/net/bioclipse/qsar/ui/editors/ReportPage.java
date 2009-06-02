package net.bioclipse.qsar.ui.editors;

import org.eclipse.birt.report.viewer.ViewerPlugin;
import org.eclipse.birt.report.viewer.utilities.WebViewer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapLayout;


public class ReportPage extends FormPage implements IEditingDomainProvider, IPageChangedListener{

    private EditingDomain editingDomain;
    private QsarEditor editor;
    private IProject project;
    private Browser browser;

    public ReportPage(FormEditor editor, EditingDomain editingDomain) {

        super(editor, "qsar.report", "Report");
        this.editingDomain=editingDomain;
        this.editor=(QsarEditor) editor;
        this.project=this.editor.getActiveProject();
        editor.addPageChangedListener(this);

    }
    
    @Override
    protected void createFormContent( IManagedForm managedForm ) {

        final ScrolledForm form = managedForm.getForm();
        FormToolkit toolkit = managedForm.getToolkit();
        form.setText("QSAR responses");
        toolkit.decorateFormHeading(form.getForm());

        project=((QsarEditor)getEditor()).getActiveProject();
        ToolbarHelper.setupToolbar(form, project);

        GridLayout layout = new GridLayout();
        form.getBody().setLayout(layout);

        browser = new Browser(form.getBody(), SWT.NONE);

        System.setProperty( "RUN_UNDER_ECLIPSE", "true" );
        WebViewer.cancel(browser);

        //Use the contributed context
        ViewerPlugin.getDefault( ).getPluginPreferences( ).setValue("APPCONTEXT_EXTENSION_KEY", "QSARAppContext");
        
//        WebViewer.display(getReportFile(), WebViewer.HTML, "frameset");
        WebViewer.display(getReportFile(), WebViewer.HTML, browser, "frameset");
//        WebViewer.display(getReportFile(), WebViewer.HTML, browser, "run");

        
//        browser.setUrl( "http://www.dn.se" );
        GridData gd=new GridData(GridData.FILL_BOTH);
        browser.setLayoutData(gd);
     
        toolkit.paintBordersFor(form);

    }
    
    private String getReportFile() {

        return "/Users/ola/Workspaces/workspaceBIRT/ola/eQsar.rptdesign";
//        return "/Users/ola/Workspaces/workspaceBIRT/ola/new_report.rptdesign";
    }

    public EditingDomain getEditingDomain() {

        // TODO Auto-generated method stub
        return null;
    }

    public void pageChanged( PageChangedEvent event ) {

        // TODO Auto-generated method stub
        
    }
}
