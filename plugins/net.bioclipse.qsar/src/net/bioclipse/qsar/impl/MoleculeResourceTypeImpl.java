/**
 * Copyright (c) 2007-2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org•À½epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar.impl;
import net.bioclipse.cdk.business.Activator;
import net.bioclipse.cdk.business.ICDKManager;
import net.bioclipse.cdk.domain.MoleculesInfo;
import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.QsarPackage;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecule Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#isExcluded <em>Excluded</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getNo2d <em>No2d</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getNo3d <em>No3d</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getNoMols <em>No Mols</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculeResourceTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoleculeResourceTypeImpl extends EObjectImpl implements MoleculeResourceType {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * The default value of the '{@link #isExcluded() <em>Excluded</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isExcluded()
         * @generated
         * @ordered
         */
        protected static final boolean EXCLUDED_EDEFAULT = false;
        /**
         * The cached value of the '{@link #isExcluded() <em>Excluded</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isExcluded()
         * @generated
         * @ordered
         */
        protected boolean excluded = EXCLUDED_EDEFAULT;
        /**
         * This is true if the Excluded attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean excludedESet;
        /**
         * The default value of the '{@link #getFile() <em>File</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFile()
         * @generated
         * @ordered
         */
        protected static final String FILE_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFile()
         * @generated
         * @ordered
         */
        protected String file = FILE_EDEFAULT;
        /**
         * The default value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected static final String ID_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected String id = ID_EDEFAULT;
        /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected static final String NAME_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected String name = NAME_EDEFAULT;
        /**
         * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNamespace()
         * @generated
         * @ordered
         */
        protected static final String NAMESPACE_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNamespace()
         * @generated
         * @ordered
         */
        protected String namespace = NAMESPACE_EDEFAULT;
        /**
         * The default value of the '{@link #getNo2d() <em>No2d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNo2d()
         * @generated
         * @ordered
         */
        protected static final int NO2D_EDEFAULT = -1;
        /**
         * The cached value of the '{@link #getNo2d() <em>No2d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNo2d()
         * @generated
         * @ordered
         */
        protected int no2d = NO2D_EDEFAULT;
        /**
         * This is true if the No2d attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean no2dESet;
        /**
         * The default value of the '{@link #getNo3d() <em>No3d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNo3d()
         * @generated
         * @ordered
         */
        protected static final int NO3D_EDEFAULT = -1;
        /**
         * The cached value of the '{@link #getNo3d() <em>No3d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNo3d()
         * @generated
         * @ordered
         */
        protected int no3d = NO3D_EDEFAULT;
        /**
         * This is true if the No3d attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean no3dESet;
        /**
         * The default value of the '{@link #getNoMols() <em>No Mols</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNoMols()
         * @generated
         * @ordered
         */
        protected static final int NO_MOLS_EDEFAULT = -1;
        /**
         * The cached value of the '{@link #getNoMols() <em>No Mols</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNoMols()
         * @generated
         * @ordered
         */
        protected int noMols = NO_MOLS_EDEFAULT;
        /**
         * This is true if the No Mols attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean noMolsESet;
        /**
         * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUrl()
         * @generated
         * @ordered
         */
        protected static final String URL_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUrl()
         * @generated
         * @ordered
         */
        protected String url = URL_EDEFAULT;
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MoleculeResourceTypeImpl() {
                super();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return QsarPackage.Literals.MOLECULE_RESOURCE_TYPE;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isExcluded() {
                return excluded;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExcluded(boolean newExcluded) {
                boolean oldExcluded = excluded;
                excluded = newExcluded;
                boolean oldExcludedESet = excludedESet;
                excludedESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED, oldExcluded, excluded, !oldExcludedESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetExcluded() {
                boolean oldExcluded = excluded;
                boolean oldExcludedESet = excludedESet;
                excluded = EXCLUDED_EDEFAULT;
                excludedESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED, oldExcluded, EXCLUDED_EDEFAULT, oldExcludedESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetExcluded() {
                return excludedESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getFile() {
                return file;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setFile(String newFile) {
                String oldFile = file;
                file = newFile;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__FILE, oldFile, file));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getId() {
                return id;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setId(String newId) {
                String oldId = id;
                id = newId;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__ID, oldId, id));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
                return name;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(String newName) {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__NAME, oldName, name));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getNamespace() {
                return namespace;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNamespace(String newNamespace) {
                String oldNamespace = namespace;
                namespace = newNamespace;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__NAMESPACE, oldNamespace, namespace));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getNo2d() {
                if (no2d==-1)
                        calculateInfo();
                return no2d;
        }
        private void calculateInfo() {
                ICDKManager cdk=Activator.getDefault().getCDKManager();
                MoleculesInfo r=cdk.getInfo(getFile());
                setNoMols(r.getNoMols());
                setNo2d(r.getNoMols2d());
                setNo3d(r.getNoMols3d());
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNo2d(int newNo2d) {
                int oldNo2d = no2d;
                no2d = newNo2d;
                boolean oldNo2dESet = no2dESet;
                no2dESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D, oldNo2d, no2d, !oldNo2dESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetNo2d() {
                int oldNo2d = no2d;
                boolean oldNo2dESet = no2dESet;
                no2d = NO2D_EDEFAULT;
                no2dESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D, oldNo2d, NO2D_EDEFAULT, oldNo2dESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetNo2d() {
                return no2dESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getNo3d() {
                if (no3d==-1)
                        calculateInfo();
                return no3d;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNo3d(int newNo3d) {
                int oldNo3d = no3d;
                no3d = newNo3d;
                boolean oldNo3dESet = no3dESet;
                no3dESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D, oldNo3d, no3d, !oldNo3dESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetNo3d() {
                int oldNo3d = no3d;
                boolean oldNo3dESet = no3dESet;
                no3d = NO3D_EDEFAULT;
                no3dESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D, oldNo3d, NO3D_EDEFAULT, oldNo3dESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetNo3d() {
                return no3dESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         */
        public int getNoMols() {
                if (noMols==-1){
                        calculateInfo();
                }
                return noMols;
        }
//	/**
//	 * Added by Ola to produce a computed property.
//	 * @return number of mols in file
//	 */
//	private int calculateNoMols() {
//		ICDKManager cdk=Activator.getDefault().getCDKManager();
//		int r=cdk.getNoMolecules(getFile());
//		return r;
//	}
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNoMols(int newNoMols) {
                int oldNoMols = noMols;
                noMols = newNoMols;
                boolean oldNoMolsESet = noMolsESet;
                noMolsESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS, oldNoMols, noMols, !oldNoMolsESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetNoMols() {
                int oldNoMols = noMols;
                boolean oldNoMolsESet = noMolsESet;
                noMols = NO_MOLS_EDEFAULT;
                noMolsESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS, oldNoMols, NO_MOLS_EDEFAULT, oldNoMolsESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetNoMols() {
                return noMolsESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getUrl() {
                return url;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setUrl(String newUrl) {
                String oldUrl = url;
                url = newUrl;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.MOLECULE_RESOURCE_TYPE__URL, oldUrl, url));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED:
                                return isExcluded() ? Boolean.TRUE : Boolean.FALSE;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__FILE:
                                return getFile();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__ID:
                                return getId();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAME:
                                return getName();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAMESPACE:
                                return getNamespace();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D:
                                return new Integer(getNo2d());
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D:
                                return new Integer(getNo3d());
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS:
                                return new Integer(getNoMols());
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__URL:
                                return getUrl();
                }
                return super.eGet(featureID, resolve, coreType);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED:
                                setExcluded(((Boolean)newValue).booleanValue());
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__FILE:
                                setFile((String)newValue);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__ID:
                                setId((String)newValue);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAME:
                                setName((String)newValue);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAMESPACE:
                                setNamespace((String)newValue);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D:
                                setNo2d(((Integer)newValue).intValue());
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D:
                                setNo3d(((Integer)newValue).intValue());
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS:
                                setNoMols(((Integer)newValue).intValue());
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__URL:
                                setUrl((String)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED:
                                unsetExcluded();
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__FILE:
                                setFile(FILE_EDEFAULT);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAMESPACE:
                                setNamespace(NAMESPACE_EDEFAULT);
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D:
                                unsetNo2d();
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D:
                                unsetNo3d();
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS:
                                unsetNoMols();
                                return;
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__URL:
                                setUrl(URL_EDEFAULT);
                                return;
                }
                super.eUnset(featureID);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__EXCLUDED:
                                return isSetExcluded();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__FILE:
                                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NAMESPACE:
                                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO2D:
                                return isSetNo2d();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO3D:
                                return isSetNo3d();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__NO_MOLS:
                                return isSetNoMols();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE__URL:
                                return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
                }
                return super.eIsSet(featureID);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();
                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (excluded: ");
                if (excludedESet) result.append(excluded); else result.append("<unset>");
                result.append(", file: ");
                result.append(file);
                result.append(", id: ");
                result.append(id);
                result.append(", name: ");
                result.append(name);
                result.append(", namespace: ");
                result.append(namespace);
                result.append(", no2d: ");
                if (no2dESet) result.append(no2d); else result.append("<unset>");
                result.append(", no3d: ");
                if (no3dESet) result.append(no3d); else result.append("<unset>");
                result.append(", noMols: ");
                if (noMolsESet) result.append(noMols); else result.append("<unset>");
                result.append(", url: ");
                result.append(url);
                result.append(')');
                return result.toString();
        }
} //MoleculeResourceTypeImpl
