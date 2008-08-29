package net.bioclipse.qsar.descriptor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertySource;

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
		
		//If impl has params, add them as clones
		if (impl.getParameters()!=null){
			parameters=new ArrayList<DescriptorParameter>();
			for (DescriptorParameter p : impl.getParameters()){
				parameters.add(p.clone());
			}
		}
		descriptorImpl=impl;
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

	@Override
	public Object getAdapter(Class adapter) {

		if (IPropertySource.class.equals(adapter)) {
			return new DescriptorInstancePropertySource(this);
		}

		return super.getAdapter(adapter);
	}
	

}
