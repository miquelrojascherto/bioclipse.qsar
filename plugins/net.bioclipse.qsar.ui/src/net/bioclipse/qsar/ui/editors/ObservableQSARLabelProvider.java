package net.bioclipse.qsar.ui.editors;
import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.ParameterType;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.provider.DescriptorTypeItemProvider;
import net.bioclipse.qsar.ui.Activator;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.swt.graphics.Image;
public class ObservableQSARLabelProvider extends ObservableMapLabelProvider{
        public ObservableQSARLabelProvider(IObservableMap[] observeMaps) {
                super(observeMaps);
        }
        @Override
        public Image getColumnImage(Object element, int columnIndex) {
                if (columnIndex!=0) return null;
                if (element instanceof DescriptorType) {
                        return Activator.getImageDescriptor("icons/descriptor.png").createImage();
                }
                else if (element instanceof MoleculeResourceType) {
                        return Activator.getImageDescriptor("icons/benzene.gif").createImage();
                }
                return null;
        }
        @Override
        public String getColumnText(Object element, int columnIndex) {
                String label= super.getColumnText(element, columnIndex);
                if (element instanceof DescriptorType) {
                        if (label.indexOf('#')>0){
                                label=label.substring(label.lastIndexOf('#')+1, label.length());
                        }
                        DescriptorType desc = (DescriptorType) element;
                        String cpstr="";
                        if (desc.getParameter()!=null && desc.getParameter().size()>0){
                                for (ParameterType param : desc.getParameter()){
                                        String pstr=param.getKey() + "=" + param.getValue()+", ";
                                        cpstr=cpstr+pstr;
                                }
                                cpstr=cpstr.substring(0,cpstr.length()-2);
                        }
                        if (cpstr.length()>1){
                                label=label + " [" + cpstr + "]";
                        }
                }
                return label;
        }
}
