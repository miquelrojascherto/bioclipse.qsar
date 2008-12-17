package net.bioclipse.qsar.descriptor.model;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
public class DescriptorCategoryPropertySource extends BaseEPObjectPropertySource{
    protected static final String PROPERTY_TYPE = "Type";
        public DescriptorCategoryPropertySource(BaseEPObject item) {
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
        getValueMap().put(PROPERTY_TYPE,"Category");
        }
}
