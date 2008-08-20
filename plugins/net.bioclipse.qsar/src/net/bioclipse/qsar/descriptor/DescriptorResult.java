package net.bioclipse.qsar.descriptor;

import java.util.List;

public class DescriptorResult implements IDescriptorResult{

	List<String> descriptorIds;
	List<Float> values;


	//Constructor
	public DescriptorResult() {
	}


	public List<String> getDescriptorIds() {
		return descriptorIds;
	}


	public void setDescriptorIds(List<String> descriptorIds) {
		this.descriptorIds = descriptorIds;
	}


	public List<Float> getValues() {
		return values;
	}


	public void setValues(List<Float> values) {
		this.values = values;
	}


}
