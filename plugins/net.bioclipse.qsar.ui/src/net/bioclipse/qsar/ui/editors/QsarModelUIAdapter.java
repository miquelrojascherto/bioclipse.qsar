package net.bioclipse.qsar.ui.editors;

import org.eclipse.emf.common.notify.Notification;

import net.bioclipse.qsar.QsarType;

public class QsarModelUIAdapter  extends org.eclipse.emf.ecore.util.EContentAdapter {

	QSARFormEditor formEditor;

	public QsarModelUIAdapter(QSARFormEditor formEditor) {
		super();
		this.formEditor=formEditor;
	}

	// start observing a Library model
	public void observeQsarModel(QsarType type){
		type.eAdapters().add(this);
	}

	//override the notifyChanged method
	public void notifyChanged(Notification n){

		super.notifyChanged(n); // the superclass handles adding/removing this Adapter to new Books

		System.out.println("Something changed in QSARModel, should fire dirty!");
//		formEditor.markPagesDirty();
	}

}
