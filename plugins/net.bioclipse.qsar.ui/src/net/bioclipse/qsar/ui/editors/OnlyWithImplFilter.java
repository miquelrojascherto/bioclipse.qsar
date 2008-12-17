package net.bioclipse.qsar.ui.editors;
import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
/**
 * Filter to filter out descriptors that donŠt have an implementation
 * @author ola
 *
 */
public class OnlyWithImplFilter extends ViewerFilter {
        IQsarManager qsar;
        public OnlyWithImplFilter() {
            qsar=net.bioclipse.qsar.init.Activator.getDefault().getQsarManager();
        }
        @Override
        public boolean select(Viewer viewer, Object parentElement, Object element) {
                //Only filter Descriptors
                if (!(element instanceof Descriptor)) {
                        return true;
                }
                Descriptor desc = (Descriptor) element;
                if (qsar.getDescriptorImpls(desc.getId()).size()>0)
                        return true;
                return false;
        }
}
