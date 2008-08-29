package net.bioclipse.qsar.ui.prefs;

import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.init.Activator;
import net.bioclipse.qsar.prefs.QSARPreferenceInitializer;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * A preference page for ordering descriptorProviders
 * @author ola
 *
 */
public class ProvidersPreferencePage extends FieldEditorPreferencePage 
implements IWorkbenchPreferencePage {


	
	public ProvidersPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		
		// Set the preference store for the preference page.
		IPreferenceStore store =
			Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
	}
	
	@Override
	protected void createFieldEditors() {

		
		UpDownListEditor listeditor=new UpDownListEditor(QSARConstants.QSAR_PROVIDERS_ORDER_PREFERENCE,
				"&Order of DescriptorProviders", getFieldEditorParent()){

			@Override
			protected String createList(String[] items) {
				return QSARPreferenceInitializer.createQsarPreferenceListFromString(items);
			}


			@Override
			protected String[] parseString(String stringList) {
				return QSARPreferenceInitializer.parseQsarPreferenceString(stringList);
			}
			
		};
		
		addField(listeditor);
		GridData gd=new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint=200;
		listeditor.getListControl(getFieldEditorParent()).setLayoutData(gd);

		
	}

	public void init(IWorkbench workbench) {
	}
	


}
