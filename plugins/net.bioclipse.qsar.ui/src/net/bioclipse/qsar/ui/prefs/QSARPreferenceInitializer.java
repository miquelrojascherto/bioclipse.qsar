package net.bioclipse.qsar.ui.prefs;

import java.util.ArrayList;
import java.util.List;

import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.business.QsarManager;
import net.bioclipse.qsar.ui.Activator;
import net.bioclipse.qsar.ui.QsarUIConstants;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class QSARPreferenceInitializer extends AbstractPreferenceInitializer {

	public QSARPreferenceInitializer() {
		super();
	}

    @Override
    public void initializeDefaultPreferences() {

    	//CDK is always the default, as we know we have this installed
    	//TODO: Read available providers from EP
		String defstr=getAvailableProvidersFromEP();

		IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
		prefs.put(
				QsarUIConstants.QSAR_PROVIDERS_ORDER_PREFERENCE, 
				defstr);
    	
    }
    
    
    private String getAvailableProvidersFromEP(){
    	
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
                	
                	String providerID=element.getAttribute("id");
                	providerIDs.add(providerID);
                }
            }
        }
        if (providerIDs.size()>0){
            String[] providersAsArray=providerIDs.toArray(new String[0]);
            return ProvidersPreferencePage.createQsarPreferenceListFromString(
            		providersAsArray);
        }
        
    	return "ERROR";
    }

}
