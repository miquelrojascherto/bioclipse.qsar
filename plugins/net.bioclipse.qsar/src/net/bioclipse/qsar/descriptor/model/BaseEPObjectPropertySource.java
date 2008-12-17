package net.bioclipse.qsar.descriptor.model;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
public class BaseEPObjectPropertySource implements IPropertySource{
    protected static final String PROPERTY_ID = "ID";
    protected static final String PROPERTY_NAME = "Name";
    private BaseEPObject item;
    private ArrayList<IPropertyDescriptor> properties;
    private HashMap<String, Object> valueMap;
    public BaseEPObject getItem() {
                return item;
        }
        /**
     * Constructor
     */
    public BaseEPObjectPropertySource(BaseEPObject item) {
        properties=new ArrayList<IPropertyDescriptor>();
        valueMap=new HashMap<String, Object>();
        this.item=item;
        addPropertiesWithValues();
    }
        /**
     * Can be overridden by extending classes
     */
    public void addPropertiesWithValues() {
    	//Add ID prop
        PropertyDescriptor descriptor;
        descriptor = new TextPropertyDescriptor(PROPERTY_ID,"ID");
        descriptor.setCategory("General");
        properties.add(descriptor);
    	//Add ID value
        valueMap.put(PROPERTY_ID,item.getId());
    	//Add name prop
        PropertyDescriptor descriptor2;
        descriptor2 = new TextPropertyDescriptor(PROPERTY_NAME,"Name");
        descriptor2.setCategory("General");
        properties.add(descriptor2);
    	//Add name value
        valueMap.put(PROPERTY_NAME,item.getName()!=null
                ? item.getName() : "N/A");
        }
        public boolean isPropertyResettable(Object id) {
        return false;
    }
    public boolean isPropertySet(Object id) {
        return true;
    }
    public Object getEditableValue() {
        return null;
    }
    public IPropertyDescriptor[] getPropertyDescriptors() {
        // Create the property vector.
        IPropertyDescriptor[] propertyDescriptors = new IPropertyDescriptor[properties.size()];
        for (int i=0; i< properties.size();i++){
            propertyDescriptors[i]=(IPropertyDescriptor) properties.get(i);
        }
        // Return it.
        return propertyDescriptors;
    }
    public Object getPropertyValue(Object id) {
        if (valueMap.containsKey(id))
            return valueMap.get(id);
        return null;
    }
    public void resetPropertyValue(Object id) {
    }
    public void setPropertyValue(Object id, Object value) {
    }
    public ArrayList<IPropertyDescriptor> getProperties() {
        return properties;
    }
    public void setProperties(ArrayList<IPropertyDescriptor> properties) {
        this.properties = properties;
    }
    public HashMap<String, Object> getValueMap() {
        return valueMap;
    }
    public void setValueMap(HashMap<String, Object> valueMap) {
        this.valueMap = valueMap;
    }
}
