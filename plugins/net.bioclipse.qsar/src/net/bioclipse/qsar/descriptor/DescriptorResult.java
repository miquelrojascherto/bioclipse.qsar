package net.bioclipse.qsar.descriptor;

import java.util.List;

public class DescriptorResult implements IDescriptorResult{

	String descriptorId;
	String[] labels;
	Float[] values;


	//Constructor
	public DescriptorResult() {
	}


	public String getDescriptorId() {
		return descriptorId;
	}


	public void setDescriptorId(String descriptorId) {
		this.descriptorId = descriptorId;
	}


	public String[] getLabels() {
		return labels;
	}


	public void setLabels(String[] labels) {
		this.labels = labels;
	}


	public Float[] getValues() {
		return values;
	}


	public void setValues(Float[] values) {
		this.values = values;
	}

}
