package net.bioclipse.qsar.descriptor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertySource;

public class DescriptorInstance extends BaseEPObject{

	DescriptorImpl descriptorImpl;
	List<DescriptorParameter> parameters;


	public DescriptorInstance(Descriptor descriptor, DescriptorImpl impl,
			List<DescriptorParameter> params) {
		
		super (descriptor.getId(),impl.getName());
		setNamesapce(descriptor.getNamesapce());
		descriptorImpl=impl;
		
		//If impl has params, loop over these
		if (impl.getParameters()!=null){
			parameters=new ArrayList<DescriptorParameter>();
			for (DescriptorParameter p : impl.getParameters()){
				DescriptorParameter newParam=null;
				if (params!=null && params.size()>0){
					//If input params given, take these.
					for (DescriptorParameter inp : params){
						if (p.getKey().equals(inp.getKey())){
							newParam=inp;
						}
					}
				}
				// If no matching input param, clone from impl params
				if (newParam==null) newParam=p.clone();
				
				parameters.add(newParam);
			}
		}
	}


	/**
	 * Constructor that clones the parameters in the impl and assigns to
	 * instance.
	 * @param impl DescriptorImpl to be used
	 */
	public DescriptorInstance(Descriptor descriptor, DescriptorImpl impl) {
		this(descriptor,impl,null);
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
