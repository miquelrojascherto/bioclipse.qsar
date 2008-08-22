package net.bioclipse.qsar.init;

import net.bioclipse.core.util.LogUtils;
import net.bioclipse.qsar.business.IQsarManager;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.bioclipse.qsar.ui";

    private static final Logger logger = Logger.getLogger(Activator.class);

    private ServiceTracker finderTracker;
    
    // The shared instance
    private static Activator plugin;


    /**
     * Returns an image descriptor for the image file at the given
     * plug-in relative path
     *
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

        finderTracker = new ServiceTracker( context, 
                IQsarManager.class.getName(), 
                null );
        finderTracker.open();

    }
    
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }
    
    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public IQsarManager getQsarManager() {
        IQsarManager manager = null;
        try {
            manager = (IQsarManager) finderTracker.waitForService(1000*10);
        } catch (InterruptedException e) {
            logger.warn("Exception occurred while attempting to get the QsarManager" + e);
            LogUtils.debugTrace(logger, e);
        }
        if(manager == null) {
            throw new IllegalStateException("Could not get the qsar manager");
        }
        return manager;
    }
}
