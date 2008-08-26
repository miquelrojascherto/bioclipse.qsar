package net.bioclipse.qsar.descriptor.model;

import java.util.List;

public class Descriptor extends BaseEPObject{

	private String definition;
	private String description;
	private String date;
	private List<DescriptorCategory> categories;
	
	public Descriptor(String id, String name) {
		super(id, name);
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<DescriptorCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<DescriptorCategory> categories) {
		this.categories = categories;
	}
	
	
	

}
