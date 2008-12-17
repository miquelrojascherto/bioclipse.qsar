package net.bioclipse.qsar.prefs;
import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.init.Activator;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
public class QSARPreferenceInitializer extends AbstractPreferenceInitializer {
        public QSARPreferenceInitializer() {
                super();
        }
    @Override
    public void initializeDefaultPreferences() {
    	//Read available providers from EP
                String defstr=QsarPreferenceHelper.getAvailableProvidersFromEP();
                IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
                prefs.put(
                                QSARConstants.QSAR_PROVIDERS_ORDER_PREFERENCE, 
                                defstr);
    }
}
