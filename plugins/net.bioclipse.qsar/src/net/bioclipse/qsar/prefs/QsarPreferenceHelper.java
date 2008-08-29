package net.bioclipse.qsar.prefs;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import net.bioclipse.qsar.QSARConstants;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class QsarPreferenceHelper {


    public static String getAvailableProvidersFromEP(){
    	
		//Initialize implementations via extension points
        IExtensionRegistry registry = Platform.getExtensionRegistry();

        if ( registry == null )
            throw new RuntimeException("Registry is null, no services can " +
            "be read. Workbench not started?");
        // it likely means that the Eclipse workbench has not
        // started, for example when running tests

		/*
         * service objects
         */
        IExtensionPoint serviceObjectExtensionPoint = registry
        .getExtensionPoint(QSARConstants.DESCRIPTOR_EXTENSION_POINT);

        IExtension[] serviceObjectExtensions
        = serviceObjectExtensionPoint.getExtensions();

        List<String> providerIDs=new ArrayList<String>();
		
        for(IExtension extension : serviceObjectExtensions) {
            for( IConfigurationElement element
                    : extension.getConfigurationElements() ) {

                if (element.getName().equals(QSARConstants.PROVIDER_ELEMENT_NAME)){
                	
                	String providerID=element.getAttribute("name");
                	String providerName=element.getAttribute("id");
                	providerIDs.add(providerID);
                }
            }
        }
        if (providerIDs.size()>0){
            String[] providersAsArray=providerIDs.toArray(new String[0]);
            return createQsarPreferenceListFromString(
            		providersAsArray);
        }
        
    	return "ERROR";
    }

    
	public static String[] parseQsarPreferenceString(String stringList) {
		StringTokenizer st = 
			new StringTokenizer(stringList, QSARConstants.PREFS_SEPERATOR); //$NON-NLS-1$
		ArrayList v = new ArrayList();
		while (st.hasMoreElements()) {
			v.add(st.nextElement());
		}
		return (String[])v.toArray(new String[v.size()]);
	}

	
	public static String createQsarPreferenceListFromString(String[] items) {
		
		StringBuffer path = new StringBuffer("");//$NON-NLS-1$
		
		for (int i = 0; i < items.length; i++) {
			path.append(items[i]);
			path.append(QSARConstants.PREFS_SEPERATOR);
		}
		return path.toString();
	}

	
}
