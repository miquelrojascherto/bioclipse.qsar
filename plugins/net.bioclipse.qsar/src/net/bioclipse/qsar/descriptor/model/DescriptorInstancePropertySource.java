package net.bioclipse.qsar.descriptor.model;

import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class DescriptorInstancePropertySource extends BaseEPObjectPropertySource{

    protected static final String PROPERTY_TYPE = "Type";
    protected static final String PROPERTY_IMPL = "Implementation";

	public DescriptorInstancePropertySource(BaseEPObject item) {
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
        getValueMap().put(PROPERTY_TYPE,"Descriptor instance");

        DescriptorInstance instance=(DescriptorInstance)getItem();

		//Add impl
        PropertyDescriptor descriptor2;
        descriptor2 = new TextPropertyDescriptor(PROPERTY_IMPL,"Implementation");
        descriptor2.setCategory("General");
        getProperties().add(descriptor2);
    	//Add impl value
        getValueMap().put(PROPERTY_IMPL,instance.getDescriptorImpl().getName());

        
        
        //Add parameters
        if (instance.getParameters()!=null){
        	for (DescriptorParameter param : instance.getParameters()){
        		PropertyDescriptor descriptorParam;
        		descriptorParam = new TextPropertyDescriptor(param.getKey(), param.getKey());
        		descriptorParam.setCategory("Parameters");
        		getProperties().add(descriptorParam);
        		//Add def value
        		getValueMap().put(param.getKey(), param.getValue());
        	}
        }
	}

	/*
	 * TODO: Below should be used to set properties for parameters
	 */
	
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return super.getEditableValue();
	}

	
	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		super.setPropertyValue(id, value);
	}

}
