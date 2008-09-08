package net.bioclipse.qsar.ui.editors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.jface.viewers.Viewer;

import net.bioclipse.qsar.QsarType;

public class QsarModelUIAdapter  extends org.eclipse.emf.ecore.util.EContentAdapter {


	private Viewer viewer;

	public QsarModelUIAdapter(Viewer viewer) {
		super();
		this.viewer=viewer;
	}

	// start observing a Library model
	public void observeQsarModel(QsarType type){
		type.eAdapters().add(this);
	}

	//override the notifyChanged method
	public void notifyChanged(Notification n){

		super.notifyChanged(n); // the superclass handles adding/removing this Adapter to new Books

		viewer.refresh();
	}

}
