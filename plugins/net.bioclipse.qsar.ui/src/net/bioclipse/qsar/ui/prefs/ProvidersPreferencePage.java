package net.bioclipse.qsar.ui.prefs;

import java.util.ArrayList;
import java.util.StringTokenizer;

import net.bioclipse.qsar.ui.Activator;
import net.bioclipse.qsar.ui.QsarConstants;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.actions.AddBookmarkAction;

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

		
		UpDownListEditor listeditor=new UpDownListEditor(QsarConstants.QSAR_PROVIDERS_ORDER,
				"&Order of DescriptorProviders", getFieldEditorParent()){

			@Override
			protected String createList(String[] items) {
				
				StringBuffer path = new StringBuffer("");//$NON-NLS-1$
				
				for (int i = 0; i < items.length; i++) {
					path.append(items[i]);
					path.append(DEFAULT_SEPERATOR);
				}
				return path.toString();
			}


			@Override
			protected String[] parseString(String stringList) {
				StringTokenizer st = 
					new StringTokenizer(stringList, DEFAULT_SEPERATOR); //$NON-NLS-1$
				ArrayList v = new ArrayList();
				while (st.hasMoreElements()) {
					v.add(st.nextElement());
				}
				return (String[])v.toArray(new String[v.size()]);
			}
			
		};
		
		addField(listeditor);
		GridData gd=new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint=200;
		listeditor.getListControl(getFieldEditorParent()).setLayoutData(gd);

		
	}

	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		
	}

}
