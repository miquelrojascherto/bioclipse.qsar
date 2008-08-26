package net.bioclipse.qsar.descriptor.model;

import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class DescriptorPropertySource extends BaseEPObjectPropertySource{

    protected static final String PROPERTY_TYPE = "Type";
    protected static final String PROPERTY_PROVIDER = "Provider";

	public DescriptorPropertySource(BaseEPObject item) {
		super(item);
	}
	
	@Override
	public void addPropertiesWithValues() {

		//Add id and name
		super.addPropertiesWithValues();
		
		//Add type
        PropertyDescriptor descriptor;
        descriptor = new TextPropertyDescriptor(PROPERTY_TYPE,"Type");
        descriptor.setCategory("General");
        getProperties().add(descriptor);
    	//Add type value
        getValueMap().put(PROPERTY_TYPE,"Descriptor");

		//Add type
        PropertyDescriptor descriptor2;
        descriptor2 = new TextPropertyDescriptor(PROPERTY_PROVIDER,"Provider");
        descriptor2.setCategory("General");
        getProperties().add(descriptor2);
    	//Add type value
        getValueMap().put(PROPERTY_PROVIDER,((DescriptorImpl)getItem()).getProvider().getName());

	}

}
