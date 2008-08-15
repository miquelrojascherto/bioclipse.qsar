package net.bioclipse.qsar.ui.editors;

import net.bioclipse.ui.editors.XMLEditor;

public class QsarXMLEditor extends XMLEditor{

	
	
	private QSARFormEditor parentEditor;

	public QsarXMLEditor(QSARFormEditor formEditor) {
		super();
		this.parentEditor=formEditor;
	}

	@Override
	protected void editorSaved() {

		super.editorSaved();

		parentEditor.markPagesSaved();
	}
	
}
