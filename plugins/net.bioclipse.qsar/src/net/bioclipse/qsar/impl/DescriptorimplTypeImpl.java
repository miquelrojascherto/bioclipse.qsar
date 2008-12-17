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
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.QsarPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptorimpl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptorimplTypeImpl extends EObjectImpl implements DescriptorimplType {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
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
         * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReference()
         * @generated
         * @ordered
         */
        protected static final String REFERENCE_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReference()
         * @generated
         * @ordered
         */
        protected String reference = REFERENCE_EDEFAULT;
        /**
         * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getVendor()
         * @generated
         * @ordered
         */
        protected static final String VENDOR_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getVendor()
         * @generated
         * @ordered
         */
        protected String vendor = VENDOR_EDEFAULT;
        /**
         * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getVersion()
         * @generated
         * @ordered
         */
        protected static final String VERSION_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getVersion()
         * @generated
         * @ordered
         */
        protected String version = VERSION_EDEFAULT;
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DescriptorimplTypeImpl() {
                super();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return QsarPackage.Literals.DESCRIPTORIMPL_TYPE;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__ID, oldId, id));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__NAME, oldName, name));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__NAMESPACE, oldNamespace, namespace));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getReference() {
                return reference;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setReference(String newReference) {
                String oldReference = reference;
                reference = newReference;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__REFERENCE, oldReference, reference));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getVendor() {
                return vendor;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setVendor(String newVendor) {
                String oldVendor = vendor;
                vendor = newVendor;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__VENDOR, oldVendor, vendor));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getVersion() {
                return version;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setVersion(String newVersion) {
                String oldVersion = version;
                version = newVersion;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTORIMPL_TYPE__VERSION, oldVersion, version));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case QsarPackage.DESCRIPTORIMPL_TYPE__ID:
                                return getId();
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAME:
                                return getName();
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAMESPACE:
                                return getNamespace();
                        case QsarPackage.DESCRIPTORIMPL_TYPE__REFERENCE:
                                return getReference();
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VENDOR:
                                return getVendor();
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VERSION:
                                return getVersion();
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
                        case QsarPackage.DESCRIPTORIMPL_TYPE__ID:
                                setId((String)newValue);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAME:
                                setName((String)newValue);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAMESPACE:
                                setNamespace((String)newValue);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__REFERENCE:
                                setReference((String)newValue);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VENDOR:
                                setVendor((String)newValue);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VERSION:
                                setVersion((String)newValue);
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
                        case QsarPackage.DESCRIPTORIMPL_TYPE__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAMESPACE:
                                setNamespace(NAMESPACE_EDEFAULT);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__REFERENCE:
                                setReference(REFERENCE_EDEFAULT);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VENDOR:
                                setVendor(VENDOR_EDEFAULT);
                                return;
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VERSION:
                                setVersion(VERSION_EDEFAULT);
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
                        case QsarPackage.DESCRIPTORIMPL_TYPE__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case QsarPackage.DESCRIPTORIMPL_TYPE__NAMESPACE:
                                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
                        case QsarPackage.DESCRIPTORIMPL_TYPE__REFERENCE:
                                return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VENDOR:
                                return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
                        case QsarPackage.DESCRIPTORIMPL_TYPE__VERSION:
                                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
                result.append(" (id: ");
                result.append(id);
                result.append(", name: ");
                result.append(name);
                result.append(", namespace: ");
                result.append(namespace);
                result.append(", reference: ");
                result.append(reference);
                result.append(", vendor: ");
                result.append(vendor);
                result.append(", version: ");
                result.append(version);
                result.append(')');
                return result.toString();
        }
} //DescriptorimplTypeImpl
