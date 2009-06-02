package net.bioclipse.qsar.ui.birt;

import java.util.Map;

import org.eclipse.birt.report.viewer.api.AppContextExtension;

/**
 * This is for the webviewer classpath
 * @author ola
 *
 */
public class QSARAppContext extends AppContextExtension{


    public Map getAppContext(Map appContext) {
        Map hm = super.getAppContext(appContext);
        hm.put("PARENT_CLASSLOADER", QsarScriptedDataset.class.getClassLoader());
//        hm.put( "PROJECT_CLASSPATH_KEY", QSARAppContext.class.getClassLoader() );
//        hm.put("PARENT_CLASSLOADER", QSARAppContext.class.getClassLoader());
//        hm.put( "PROJECT_CLASSPATH_KEY", QSARAppContext.class.getClassLoader() );
        hm.put( "appTXT", "HOW" );
        return hm;
    }

    @Override
    public String getName() {
        return "QSARAppContext";
    }

}