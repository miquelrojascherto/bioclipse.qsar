package net.bioclipse.qsar.descriptor.model;

public class Descriptor extends BaseEPObject{

	private DescriptorCategory category;


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
