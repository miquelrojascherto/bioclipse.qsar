package net.bioclipse.qsar.descriptor.model;

import java.util.Map;

import org.eclipse.ui.views.properties.IPropertySource;

public class Descriptor extends BaseEPObject{

	private DescriptorCategory category;
	private DescriptorProvider provider;
	private boolean requires3D;
	private Map<String, String> parameters;
	private String definition;
	private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	public boolean isRequires3D() {
		return requires3D;
	}
	public void setRequires3D(boolean requires3D) {
		this.requires3D = requires3D;
	}
	public DescriptorProvider getProvider() {
		return provider;
	}
	public void setProvider(DescriptorProvider provider) {
		this.provider = provider;
	}
	public Descriptor(String id, String name) {
		super(id, name);
	}
	public Descriptor(String id, String name, String icon_path) {
		super(id, name, icon_path);
	}


	public DescriptorCategory getCategory() {
		return category;
	}

	public void setCategory(DescriptorCategory category) {
		this.category = category;
	}

	public Object getAdapter(Class adapter) {

		if (IPropertySource.class.equals(adapter)) {
			return new DescriptorPropertySource(this);
		}

		return super.getAdapter(adapter);
	}
	
	
}
