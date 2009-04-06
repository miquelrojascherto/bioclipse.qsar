package net.bioclipse.qsar.ui;

import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.StructureType;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;


public class QsarHelper {

    public static void setChangedInPreference( DescriptorType desc, IProject project, boolean newValue ) {

        
        IEclipsePreferences node = new InstanceScope().getNode(net.bioclipse.qsar.ui.Activator.PLUGIN_ID);
        node.putBoolean( project.getName()+"_"+desc.getId(), newValue);
        try {
            node.flush();
        } catch ( BackingStoreException e ) {
            e.printStackTrace();
        }
    }

    public static void setChangedInPreference( StructureType structure, IProject project, boolean newValue) {

        IEclipsePreferences node = new InstanceScope().getNode(net.bioclipse.qsar.ui.Activator.PLUGIN_ID);
        node.putBoolean( project.getName()+"_"+structure.getId(), newValue);
        try {
            node.flush();
        } catch ( BackingStoreException e ) {
            e.printStackTrace();
        }
        
    }

    /**
     * Read prefs to determine if this descriptor is dirty. Default is TRUE.
     * @return
     */
    public static boolean isDirtyInPreference( DescriptorType desc, IProject project) {
        IEclipsePreferences node = new InstanceScope().getNode(net.bioclipse.qsar.ui.Activator.PLUGIN_ID);
        System.out.println(" READ PREFERENCE: " + project.getName()+"_"+desc.getId() +" = " + node.getBoolean( project.getName()+"_"+desc.getId(), true));
        return node.getBoolean( project.getName()+"_"+desc.getId(), true);
    }

    /**
     * Read prefs to determine if this structure is dirty. Default is TRUE.
     * @return
     */
    public static boolean isDirtyInPreference( StructureType structure, IProject project) {
        IEclipsePreferences node = new InstanceScope().getNode(net.bioclipse.qsar.ui.Activator.PLUGIN_ID);
        System.out.println(" READ PREFERENCE: " + project.getName()+"_"+structure.getId() +" = " + node.getBoolean( project.getName()+"_"+structure.getId(), true));
        return node.getBoolean( project.getName()+"_"+structure.getId(), true);
    }

}
