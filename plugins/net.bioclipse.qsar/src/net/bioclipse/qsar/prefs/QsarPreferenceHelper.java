/*******************************************************************************
 * Copyright (c) 2009 Ola Spjuth.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 ******************************************************************************/
package net.bioclipse.qsar.prefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import net.bioclipse.qsar.QSARConstants;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class QsarPreferenceHelper {

	static Map<String, String> providerNameToID = new HashMap<String, String>();

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

        List<String> providerNames=new ArrayList<String>();
		
        for(IExtension extension : serviceObjectExtensions) {
            for( IConfigurationElement element
                    : extension.getConfigurationElements() ) {

                if (element.getName().equals(QSARConstants.PROVIDER_ELEMENT_NAME)){
                	
                	String providerID=element.getAttribute("id");
                	String providerName=element.getAttribute("name");
                	providerNames.add(providerName);
                	providerNameToID.put(providerName, providerID);
                	
                }
            }
        }
        if (providerNames.size()>0){
            String[] providersAsArray=providerNames.toArray(new String[0]);
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
	
	public static String getProviderID(String providerName){
		return providerNameToID.get(providerName);
	}

	
}
