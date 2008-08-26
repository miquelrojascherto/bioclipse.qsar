package net.bioclipse.qsar.ui.editors;

import net.bioclipse.qsar.descriptor.model.BaseEPObject;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.ui.Activator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class DescriptorLabelProvider implements ILabelProvider {

	Image open, desc;
	
	public Image getImage(Object element) {

		if (element instanceof DescriptorCategory) {
			if (open==null) open=Activator.getImageDescriptor(
								"icons/open.gif").createImage();
			return open;
		}
		else if (element instanceof Descriptor) {
			if (desc==null) desc= Activator.getImageDescriptor(
								"icons/descriptor.gif").createImage();
			return desc;
		}

		else if (element instanceof BaseEPObject) {
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
