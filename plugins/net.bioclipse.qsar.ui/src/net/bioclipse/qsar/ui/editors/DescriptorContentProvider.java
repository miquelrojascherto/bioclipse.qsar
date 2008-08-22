package net.bioclipse.qsar.ui.editors;

import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorModel;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DescriptorContentProvider implements ITreeContentProvider {

	IQsarManager qsar;
	
	public DescriptorContentProvider() {
        //Get qsarmanager via OSGI
        qsar=net.bioclipse.qsar.init.Activator.getDefault().getQsarManager();
	}
	
	
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof DescriptorCategory) {
			DescriptorCategory category = (DescriptorCategory) parentElement;
			return qsar.getDescriptorsInCategory(category).toArray();
		}
		
		return new Object[0];
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		return getChildren(element).length>0 ? true : false;
	}

	public Object[] getElements(Object inputElement) {
		
		if (!(inputElement instanceof DescriptorModel)) {
			return new Object[0];
		}

//		Alternative: by provider

		return qsar.getFullCategories().toArray();

	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}