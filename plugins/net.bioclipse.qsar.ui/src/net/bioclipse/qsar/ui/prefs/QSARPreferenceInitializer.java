package net.bioclipse.qsar.ui.prefs;

import net.bioclipse.qsar.ui.Activator;
import net.bioclipse.qsar.ui.QsarConstants;

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
		String defstr="CDK;Dragon";

		IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
		prefs.put(
				QsarConstants.QSAR_PROVIDERS_ORDER, 
				defstr);
    	
    }

}
