package net.bioclipse.qsar.ui.editors;

import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.descriptor.model.BaseEPObject;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorImpl;
import net.bioclipse.qsar.descriptor.model.DescriptorInstance;
import net.bioclipse.qsar.ui.Activator;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class DescriptorLabelProvider implements ITableLabelProvider {

	Image open, desc;
	IQsarManager qsar;
	
	public DescriptorLabelProvider() {
        qsar=net.bioclipse.qsar.init.Activator.getDefault().getQsarManager();
	}

	public Image getColumnImage(Object element, int columnIndex) {

		if (element instanceof PendingObject) {
			return null;
		}
		else if (element instanceof DescriptorInstance) {
			if (desc==null) desc= Activator.getImageDescriptor(
					"icons/descriptor.gif").createImage();
			return desc;
		}

		if (columnIndex==0){
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
		}
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		
		if (element instanceof PendingObject) {
			PendingObject po = (PendingObject) element;
			if (columnIndex==0)
				return po.getPendingString();
			return "";
		}
		else if (element instanceof DescriptorInstance) {
			DescriptorInstance inst = (DescriptorInstance) element;
			return inst.getName();
		}

		else if (element instanceof Descriptor) {
			Descriptor desc = (Descriptor) element;
			if (columnIndex==0){
				return desc.getName();
			}
			
			//Providers column
			else if (columnIndex==1){

				String retProv="";
				for (DescriptorImpl impl : qsar.getDescriptorImplsForDescriptor(desc.getId())){
					retProv=retProv + impl.getProvider().getShortName() +", ";
				}
				
				if (retProv.length()>1){
					//Remove last comma and space
					retProv=retProv.substring(0,retProv.length()-2);
				}
				
				return retProv;
			}
		}
		else if (element instanceof DescriptorCategory) {
			BaseEPObject epobj = (BaseEPObject) element;
			if (columnIndex==0){
				return epobj.getName();
			}
			return "";
		}
		
		return "NA";
	}

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}
	

}
