package net.bioclipse.qsar.descriptor.model;

import org.eclipse.jface.preference.BooleanPropertyAction;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class DescriptorInstancePropertySource extends BaseEPObjectPropertySource{

    protected static final String PROPERTY_TYPE = "Type";
    protected static final String PROPERTY_IMPL = "Implementation";
    protected static final String PROPERTY_DEFINITION = "Definition";
    protected static final String PROPERTY_DESCRIPTION = "Description";
    
    protected static final String TRUE_STR="true";
    protected static final Integer TRUE_INT=0;
    protected static final String FALSE_STR="false";
    protected static final Integer FALSe_INT=1;

    DescriptorInstance instance;
    
	public DescriptorInstancePropertySource(BaseEPObject item) {
		super(item);
	}
	
	@Override
	public void addPropertiesWithValues() {

        instance=(DescriptorInstance)getItem();

		//Add id and name
		super.addPropertiesWithValues();
		
		//Add type
        PropertyDescriptor descriptor;
        descriptor = new TextPropertyDescriptor(PROPERTY_TYPE,"Type");
        descriptor.setCategory("General");
        getProperties().add(descriptor);
    	//Add type value
        getValueMap().put(PROPERTY_TYPE,"Descriptor instance");

		//Add impl
        PropertyDescriptor descriptor2;
        descriptor2 = new TextPropertyDescriptor(PROPERTY_IMPL,"Implementation");
        descriptor2.setCategory("General");
        getProperties().add(descriptor2);
    	//Add impl value
        getValueMap().put(PROPERTY_IMPL,instance.getDescriptorImpl().getName());

		//Add def
        PropertyDescriptor descriptor3;
        descriptor3 = new TextPropertyDescriptor(PROPERTY_DEFINITION,"Definition");
        descriptor3.setCategory("General");
        getProperties().add(descriptor3);
    	//Add def value
        getValueMap().put(PROPERTY_DEFINITION,instance.getDescriptorImpl().getDefinition());

		//Add desc
        PropertyDescriptor descriptor4;
        descriptor4 = new TextPropertyDescriptor(PROPERTY_DESCRIPTION,"Description");
        descriptor4.setCategory("General");
        getProperties().add(descriptor4);
    	//Add desc value
        getValueMap().put(PROPERTY_DESCRIPTION,instance.getDescriptorImpl().getDescription());

        
        
        //Add parameters
        if (instance.getParameters()!=null){
        	for (DescriptorParameter param : instance.getParameters()){
        		PropertyDescriptor descriptorParam;
        		if ((param.getDefaultvalue().equalsIgnoreCase(TRUE_STR)) || 
        				param.getDefaultvalue().equalsIgnoreCase(FALSE_STR)){
            		descriptorParam = new ComboBoxPropertyDescriptor(
            				param.getKey(), param.getKey(), 
            				new String[]{TRUE_STR,FALSE_STR});

            		Integer val;
            		if (param.getDefaultvalue().equalsIgnoreCase(TRUE_STR))
            				val=TRUE_INT;
            		else
            			val=FALSe_INT;
            		getValueMap().put(param.getKey(), val);

        		}else{
            		descriptorParam = new TextPropertyDescriptor(param.getKey(), param.getKey());
            		//Add def String value
            		getValueMap().put(param.getKey(), param.getValue());
        		}
        		descriptorParam.setCategory("Parameters");
        		getProperties().add(descriptorParam);
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

		String stringval=null;
		Integer intVal=null;
		if (value instanceof String)
			stringval = (String) value;
		if (value instanceof Integer)
			intVal= (Integer) value;
		
        if (instance.getParameters()!=null){
        	for (DescriptorParameter param : instance.getParameters()){
        		
        		if (param.getKey().equals(id)){
        			
        			//If we have Integer, serialize as boolean
        			if (intVal!=null){
        				
                		getValueMap().put(param.getKey(), intVal);

        				//boolean
        				if (intVal.equals(TRUE_INT)){
        					stringval=TRUE_STR;
        				}else{stringval=FALSE_STR;}
        			}else{
                		getValueMap().put(param.getKey(), param.getValue());
        			}
        			
        			param.setValue(stringval);
            		
        		}
        		
        	}
        }
		
		// TODO Auto-generated method stub
		super.setPropertyValue(id, value);
	}

}
