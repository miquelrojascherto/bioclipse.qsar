package net.bioclipse.qsar.descriptor.model;

import java.util.ArrayList;
import java.util.List;

public class DescriptorInstance extends BaseEPObject{

	DescriptorImpl descriptorImpl;
	List<DescriptorParameter> parameters;
	

	
	public DescriptorInstance(DescriptorImpl impl,
			List<DescriptorParameter> params) {
		super (impl.getId(),impl.getName());
		descriptorImpl=impl;
		parameters=params;
	}


	/**
	 * Constructor that clones the parameters in the impl and assigns to
	 * instance.
	 * @param impl DescriptorImpl to be used
	 */
	public DescriptorInstance(DescriptorImpl impl) {
		super (impl.getId(),impl.getName());
		List<DescriptorParameter> params=new ArrayList<DescriptorParameter>();
		for (DescriptorParameter p : impl.getParameters()){
			params.add(p.clone());
		}
		descriptorImpl=impl;
		parameters=params;
	}



	public DescriptorImpl getDescriptorImpl() {
		return descriptorImpl;
	}

	public void setDescriptorImpl(DescriptorImpl descriptorImpl) {
		this.descriptorImpl = descriptorImpl;
	}

	public List<DescriptorParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<DescriptorParameter> parameters) {
		this.parameters = parameters;
	}

	

}
