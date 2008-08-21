package net.bioclipse.qsar.descriptor.model;

public class Descriptor extends BaseEPObject{

	private DescriptorCategory category;
	private DescriptorProvider provider;
	private boolean requires3D;


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

	
	
}
