package net.bioclipse.qsar.ui.editors;
import net.bioclipse.qsar.ResponseType;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
public class ResponseSorter extends ViewerSorter {
        @Override
        public int compare(Viewer viewer, Object e1, Object e2) {
                if (!(e1 instanceof ResponseType)) return super.compare(viewer, e1, e2);
                if (!(e2 instanceof ResponseType)) return super.compare(viewer, e1, e2);
                ResponseType r1=(ResponseType)e1;
                ResponseType r2=(ResponseType)e2;
                String s1=r1.getMoleculeResource()+"-"+r1.getResourceIndex();
                String s2=r2.getMoleculeResource()+"-"+r2.getResourceIndex();
                return s1.compareTo(s2);
        }
}
