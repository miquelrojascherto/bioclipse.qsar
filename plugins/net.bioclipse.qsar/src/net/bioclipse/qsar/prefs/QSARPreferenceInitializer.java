package net.bioclipse.qsar.prefs;

import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.business.QsarManager;
import net.bioclipse.qsar.init.Activator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class QSARPreferenceInitializer extends AbstractPreferenceInitializer {

    private static final Logger logger = Logger.getLogger(QSARPreferenceInitializer.class);

	public QSARPreferenceInitializer() {
		super();
	}

    @Override
    public void initializeDefaultPreferences() {

    	//Read available providers from EP
		String defstr=QsarPreferenceHelper.getAvailableProvidersFromEP();
		
		logger.debug( "Read availiable descriptors from ExPo: " + defstr );

		IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
		prefs.put(
				QSARConstants.QSAR_PROVIDERS_ORDER_PREFERENCE, 
				defstr);

    logger.debug( "Set qsar providers order prefs to: " + defstr );

    }
    
    

}
