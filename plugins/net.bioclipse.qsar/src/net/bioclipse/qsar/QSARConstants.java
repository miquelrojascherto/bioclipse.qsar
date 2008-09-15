package net.bioclipse.qsar;

public interface QSARConstants {

	//Preferences
	public static final String QSAR_PROVIDERS_ORDER_PREFERENCE = "QSARProvderOrder";
	public static final String PREFS_SEPERATOR = ";";
	
	//Properties
	public static final String QSAR_RESPONSE_PROPERTY="qsar.response";

	//Matches extension point
	public static final String DESCRIPTOR_EXTENSION_POINT = 
		"net.bioclipse.qsar.descriptorProvider";
	public static final Object PROVIDER_ELEMENT_NAME = "provider";
	public static final String DESCRIMPL_ELEMENT_NAME = "descriptorImpl";
	public static final String PARAMETER_ELEMENT_NAME = "parameter";

}
