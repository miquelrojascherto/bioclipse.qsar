package net.bioclipse.qsar.descriptor.model;

import java.util.List;

import net.bioclipse.qsar.descriptor.IDescriptorCalculator;

public class DescriptorProvider extends BaseEPObject{

	public DescriptorProvider(String id, String name) {
		super(id, name);
	}
	public DescriptorProvider(String id, String name, String icon_path) {
		super(id, name, icon_path);
	}

	private List<Descriptor> descriptors;
	private IDescriptorCalculator calculator;
	private boolean acceptsSmiles;
	private boolean acceptsCml;
	private boolean acceptsMolfile;
	public List<Descriptor> getDescriptors() {
		return descriptors;
	}
	public void setDescriptors(List<Descriptor> descriptors) {
		this.descriptors = descriptors;
	}
	public IDescriptorCalculator getCalculator() {
		return calculator;
	}
	public void setCalculator(IDescriptorCalculator calculator) {
		this.calculator = calculator;
	}
	public boolean isAcceptsSmiles() {
		return acceptsSmiles;
	}
	public void setAcceptsSmiles(boolean acceptsSmiles) {
		this.acceptsSmiles = acceptsSmiles;
	}
	public boolean isAcceptsCml() {
		return acceptsCml;
	}
	public void setAcceptsCml(boolean acceptsCml) {
		this.acceptsCml = acceptsCml;
	}
	public boolean isAcceptsMolfile() {
		return acceptsMolfile;
	}
	public void setAcceptsMolfile(boolean acceptsMolfile) {
		this.acceptsMolfile = acceptsMolfile;
	}
	
	
	
}
