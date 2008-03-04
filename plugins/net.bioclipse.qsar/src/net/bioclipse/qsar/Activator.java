/*******************************************************************************
 * Copyright (c) 2007 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 *     
 ******************************************************************************/
package net.bioclipse.qsar;

import java.net.URL;

import net.bioclipse.ui.BioclipseActivator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * The activator class controls the plug-in life cycle
 * @author ola
 */
public class Activator extends BioclipseActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.bioclipse.qsar";

	//The file for logger properties
	private static final String LOG_PROPERTIES_FILE = "logger.properties";

	//Colors for the Forms
	private FormColors formColors;

	// The shared instance.
	private static Activator plugin;
	
	public Activator() {
		plugin = this;
	}

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

	/**
	 * Need to provide this plugin's logger.properties to abstract class
	 */
	@Override
	public URL getLoggerURL() {
		return getBundle().getEntry("/" + LOG_PROPERTIES_FILE);
	}

	/**
	 * Returns the shared instance.
	 */
	public static Activator getDefault() {
		return plugin;
	}

	
	public FormColors getFormColors(Display display) {
		if (formColors == null) {
			formColors = new FormColors(display);
			formColors.markShared();
		}
		return formColors;
	}

}