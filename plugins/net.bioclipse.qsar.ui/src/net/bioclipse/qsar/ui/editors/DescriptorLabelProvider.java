package net.bioclipse.qsar.ui.editors;

import net.bioclipse.qsar.descriptor.model.BaseEPObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class DescriptorLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		
		if (element instanceof BaseEPObject) {
			BaseEPObject epobj = (BaseEPObject) element;
			return epobj.getIcon();
		}
		
		return null;
	}

	public String getText(Object element) {
		
		if (element instanceof BaseEPObject) {
			BaseEPObject epobj = (BaseEPObject) element;
			return epobj.getName();
		}
		
		return "NA";
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}
