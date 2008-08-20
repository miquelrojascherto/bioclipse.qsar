package net.bioclipse.qsar.descriptor.model;

import java.util.List;

/**
 * Hold the descriptor model read from EP
 * @author ola
 *
 */
public class DescriptorModel {

	List<DescriptorCategory> categories;
	List<DescriptorProvider> providers;

	
	public DescriptorModel() {
	}

	public List<DescriptorCategory> getCategories() {
		return categories;
	}
	public void setCategories(List<DescriptorCategory> categories) {
		this.categories = categories;
	}
	public List<DescriptorProvider> getProviders() {
		return providers;
	}
	public void setProviders(List<DescriptorProvider> providers) {
		this.providers = providers;
	}
	
}
