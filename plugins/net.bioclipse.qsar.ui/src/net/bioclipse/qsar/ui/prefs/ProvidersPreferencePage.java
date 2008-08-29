package net.bioclipse.qsar.ui.prefs;

import java.util.ArrayList;
import java.util.StringTokenizer;

import net.bioclipse.qsar.QSARConstants;
import net.bioclipse.qsar.ui.Activator;
import net.bioclipse.qsar.ui.QsarUIConstants;

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

	private static final String DEFAULT_SEPERATOR = ";";

	
	public ProvidersPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		
		// Set the preference store for the preference page.
		IPreferenceStore store =
			Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
	}
	
	@Override
	protected void createFieldEditors() {

		
		UpDownListEditor listeditor=new UpDownListEditor(QsarUIConstants.QSAR_PROVIDERS_ORDER_PREFERENCE,
				"&Order of DescriptorProviders", getFieldEditorParent()){

			@Override
			protected String createList(String[] items) {
				return createQsarPreferenceListFromString(items);
			}


			@Override
			protected String[] parseString(String stringList) {
				return parseQsarPreferenceString(stringList);
			}
			
		};
		
		addField(listeditor);
		GridData gd=new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint=200;
		listeditor.getListControl(getFieldEditorParent()).setLayoutData(gd);

		
	}

	public void init(IWorkbench workbench) {
	}
	
	public static String[] parseQsarPreferenceString(String stringList) {
		StringTokenizer st = 
			new StringTokenizer(stringList, DEFAULT_SEPERATOR); //$NON-NLS-1$
		ArrayList v = new ArrayList();
		while (st.hasMoreElements()) {
			v.add(st.nextElement());
		}
		return (String[])v.toArray(new String[v.size()]);
	}

	
	public static String createQsarPreferenceListFromString(String[] items) {
		
		StringBuffer path = new StringBuffer("");//$NON-NLS-1$
		
		for (int i = 0; i < items.length; i++) {
			path.append(items[i]);
			path.append(DEFAULT_SEPERATOR);
		}
		return path.toString();
	}


}
