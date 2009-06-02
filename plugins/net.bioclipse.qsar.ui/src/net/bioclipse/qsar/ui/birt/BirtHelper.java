package net.bioclipse.qsar.ui.birt;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineConstants;
import org.eclipse.birt.report.engine.api.HTMLRenderContext;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.IRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.ReportEngine;
import org.eclipse.birt.report.model.api.DesignElementHandle;
import org.eclipse.birt.report.model.api.ElementFactory;
import org.eclipse.birt.report.model.api.OdaDataSetHandle;
import org.eclipse.birt.report.model.api.OdaDataSourceHandle;
import org.eclipse.birt.report.model.api.ReportDesignHandle;
import org.eclipse.birt.report.model.api.ScriptDataSetHandle;
import org.eclipse.birt.report.model.api.ScriptDataSourceHandle;
import org.eclipse.birt.report.model.api.SessionHandle;
import org.eclipse.birt.report.model.api.activity.SemanticException;
import org.eclipse.birt.report.viewer.ViewerPlugin;
import org.eclipse.birt.report.viewer.utilities.WebViewer;
import org.eclipse.birt.report.viewer.utilities.WebappAccessor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ui.Activator;


public class BirtHelper {

    public static void openBrowser( QsarType qsarModel ) {

        IWebBrowser browser = null;
        
        try {
            browser = PlatformUI.getWorkbench()
            .getBrowserSupport().createBrowser(
            IWorkbenchBrowserSupport.AS_EDITOR,
            "qsar.browser.report", "Qsar Report", "Qsar report");
        } catch (PartInitException e3) {
            e3.printStackTrace();
            throw new RuntimeException(e3);
        }
        
        URL url = null;
        try {
            url = new URL("http://www.dn.se");
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            throw new RuntimeException(e1);
        }
                   
        try {
            browser.openURL(url);
        } catch (PartInitException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
            throw new RuntimeException(e2);
        }
        
    }
    
    public static void openReportInBrowser( QsarType qsarModel ) {

        try {
            EngineConfig config = new EngineConfig();
            
            // Create the report engine
            IReportEngineFactory factory = (IReportEngineFactory) Platform
                .createFactoryObject( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
            IReportEngine engine = factory.createReportEngine( config );

            // Open an existing report design
            IReportRunnable design = engine.openReportDesign(
                "/Users/ola/Workspaces/workspaceBIRT/ola/eQsar.rptdesign");
            
            //TODO: customize design and content of opened report below
            //================================================
            ReportDesignHandle designHandle = design.getDesignHandle().getDesignHandle();
            ElementFactory elementFactory = designHandle.getElementFactory( );

            //Create and add an XML datasource
            OdaDataSourceHandle dataSourceHandle = elementFactory.newOdaDataSource(
                         "Data Source", "org.eclipse.birt.report.data.oda.xml");
            dataSourceHandle.setProperty("FILELIST", "/Users/ola/Workspaces/bioclipse2_1/net.bioclipse.qsar.test/myQSAR2.xml");
            designHandle.getDataSources( ).add( dataSourceHandle );

            //Create and add a dataset based on this datasource
            OdaDataSetHandle dsHandle = elementFactory.newOdaDataSet( "Data Set",
            "org.eclipse.birt.report.data.oda.xml.dataSet" );
            dsHandle.setDataSource( "Data Source" );
            dsHandle.setQueryText( "table0#-TNAME-#table0#:#[/qsar:qsar/qsar:metadata]#:#{authors;STRING;/@authors},{datasetname;STRING;/@datasetname},{description;STRING;/@description},{license;STRING;/@license},{URL;STRING;/@URL}#:#&lt;\"qsar\",\"http:%%www.bioclipse.net%qsar\";\"xsi\",\"http:%%www.w3.org%2001%XMLSchema-instance\";\"bibtexml\",\"http:%%bibtexml.sf.net%\"" );
            designHandle.getDataSets( ).add( dsHandle );

            designHandle.findElement( "structures" );
            
            // Create task to run the report - use the task to execute and run
            // the report,
            IRunAndRenderTask task = engine.createRunAndRenderTask(design);

            // Set Render context to handle url and image locataions
            HTMLRenderContext renderContext = new HTMLRenderContext();
            renderContext.setImageDirectory("image");
            HashMap contextMap = new HashMap();
            contextMap.put(EngineConstants.APPCONTEXT_HTML_RENDER_CONTEXT,
                renderContext);
            task.setAppContext(contextMap);

            // Set rendering options - such as file or stream output,
            // output format, whether it is embeddable, etc
            HTMLRenderOption options = new HTMLRenderOption();
            options.setOutputFileName("/tmp/reportWEE2.html");
            options.setOutputFormat("html");
            task.setRenderOption(options);

            // run the report and destroy the engine
            task.run();

            engine.destroy();
          } catch (Exception ex) {
            System.out.println(ex);
          }

        
    }

    
    public static void openScriptedReportInBrowser( QsarType qsarModel ) {

        
        IWorkbenchBrowserSupport support =
            PlatformUI.getWorkbench().getBrowserSupport();
        try
        {
            IWebBrowser browser = support.createBrowser("someId");       
            browser.openURL(new URL("https://www.google.com"));
        } catch (PartInitException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } 
        
        
        //Use the contributed context
        ViewerPlugin.getDefault( ).getPluginPreferences( ).setValue("APPCONTEXT_EXTENSION_KEY", "QSARAppContext");


        String reportFile = "/Users/ola/Workspaces/workspaceBIRT/ola/eQsar.rptdesign";
        System.setProperty( "RUN_UNDER_ECLIPSE", "true" );
        WebViewer.display(reportFile, WebViewer.HTML, "frameset");
        
    }
    
    public static void openScriptedReportInBrowser2( QsarType qsarModel ) {
        try {

            String reportFile = "/Users/ola/Workspaces/workspaceBIRT/ola/eQsar.rptdesign";

            System.setProperty( "RUN_UNDER_ECLIPSE", "true" );
            
            EngineConfig config = new EngineConfig();
            HashMap hm = config.getAppContext();
            hm.put( EngineConstants.APPCONTEXT_CLASSLOADER_KEY, QsarScriptedDataset.class.getClassLoader());
            hm.put( EngineConstants.PROJECT_CLASSPATH_KEY, QsarScriptedDataset.class.getClassLoader());
            hm.put("PARENT_CLASSLOADER", QsarScriptedDataset.class.getClassLoader());
            hm.put("APPCONTEXT_EXTENSION_KEY", "QSARAppContext");
            config.setAppContext(hm); 
            
            // Create the report engine
            IReportEngineFactory factory = (IReportEngineFactory) Platform
                .createFactoryObject( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
            IReportEngine engine = factory.createReportEngine( config );

            // Open an existing report design
            IReportRunnable design = engine.openReportDesign(reportFile);
            
            //================================================
            ReportDesignHandle designHandle = design.getDesignHandle().getDesignHandle();
            ElementFactory elementFactory = designHandle.getElementFactory( );
            
            // Create task to run the report - use the task to execute and run
            // the report,
            IRunAndRenderTask task = engine.createRunAndRenderTask(design);

            // Set Render context to handle url and image locataions
            
            HTMLRenderContext renderContext = new HTMLRenderContext();
            renderContext.setImageDirectory("image");
            HashMap contextMap = new HashMap();
            contextMap.put(EngineConstants.APPCONTEXT_HTML_RENDER_CONTEXT,
                renderContext);
            task.setAppContext(contextMap);

            // Set rendering options - such as file or stream output,
            // output format, whether it is embeddable, etc
            IRenderOption options = new HTMLRenderOption();
            options.setOutputFileName("/tmp/reportWEEeQSAR2.html");
            options.setOutputFormat("html");
            task.setRenderOption(options);

            // run the report and destroy the engine
            task.run();

            engine.destroy();
          } catch (Exception ex) {
            System.out.println(ex);
          }
  
    }

    
    private void createDataSources( ) throws SemanticException{

    }    
}
