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
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.ResponseType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.ResponseTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ResponseTypeImpl#getArrayValues <em>Array Values</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ResponseTypeImpl#getMoleculeResource <em>Molecule Resource</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ResponseTypeImpl#getResourceIndex <em>Resource Index</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ResponseTypeImpl#getStructureID <em>Structure ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseTypeImpl extends EObjectImpl implements ResponseType {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected static final float VALUE_EDEFAULT = 0.0F;
        /**
         * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected float value = VALUE_EDEFAULT;
        /**
         * This is true if the Value attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean valueESet;
        /**
         * The default value of the '{@link #getArrayValues() <em>Array Values</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArrayValues()
         * @generated
         * @ordered
         */
        protected static final String ARRAY_VALUES_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getArrayValues() <em>Array Values</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArrayValues()
         * @generated
         * @ordered
         */
        protected String arrayValues = ARRAY_VALUES_EDEFAULT;
        /**
         * The default value of the '{@link #getMoleculeResource() <em>Molecule Resource</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMoleculeResource()
         * @generated
         * @ordered
         */
        protected static final String MOLECULE_RESOURCE_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getMoleculeResource() <em>Molecule Resource</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMoleculeResource()
         * @generated
         * @ordered
         */
        protected String moleculeResource = MOLECULE_RESOURCE_EDEFAULT;
        /**
         * The default value of the '{@link #getResourceIndex() <em>Resource Index</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getResourceIndex()
         * @generated
         * @ordered
         */
        protected static final int RESOURCE_INDEX_EDEFAULT = 0;
        /**
         * The cached value of the '{@link #getResourceIndex() <em>Resource Index</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getResourceIndex()
         * @generated
         * @ordered
         */
        protected int resourceIndex = RESOURCE_INDEX_EDEFAULT;
        /**
         * This is true if the Resource Index attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean resourceIndexESet;
        /**
         * The default value of the '{@link #getStructureID() <em>Structure ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStructureID()
         * @generated
         * @ordered
         */
        protected static final String STRUCTURE_ID_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getStructureID() <em>Structure ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStructureID()
         * @generated
         * @ordered
         */
        protected String structureID = STRUCTURE_ID_EDEFAULT;
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ResponseTypeImpl() {
                super();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return QsarPackage.Literals.RESPONSE_TYPE;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public float getValue() {
                return value;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setValue(float newValue) {
                float oldValue = value;
                value = newValue;
                boolean oldValueESet = valueESet;
                valueESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.RESPONSE_TYPE__VALUE, oldValue, value, !oldValueESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetValue() {
                float oldValue = value;
                boolean oldValueESet = valueESet;
                value = VALUE_EDEFAULT;
                valueESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.RESPONSE_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetValue() {
                return valueESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getArrayValues() {
                return arrayValues;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setArrayValues(String newArrayValues) {
                String oldArrayValues = arrayValues;
                arrayValues = newArrayValues;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.RESPONSE_TYPE__ARRAY_VALUES, oldArrayValues, arrayValues));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getMoleculeResource() {
                return moleculeResource;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMoleculeResource(String newMoleculeResource) {
                String oldMoleculeResource = moleculeResource;
                moleculeResource = newMoleculeResource;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.RESPONSE_TYPE__MOLECULE_RESOURCE, oldMoleculeResource, moleculeResource));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getResourceIndex() {
                return resourceIndex;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setResourceIndex(int newResourceIndex) {
                int oldResourceIndex = resourceIndex;
                resourceIndex = newResourceIndex;
                boolean oldResourceIndexESet = resourceIndexESet;
                resourceIndexESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX, oldResourceIndex, resourceIndex, !oldResourceIndexESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetResourceIndex() {
                int oldResourceIndex = resourceIndex;
                boolean oldResourceIndexESet = resourceIndexESet;
                resourceIndex = RESOURCE_INDEX_EDEFAULT;
                resourceIndexESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX, oldResourceIndex, RESOURCE_INDEX_EDEFAULT, oldResourceIndexESet));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetResourceIndex() {
                return resourceIndexESet;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getStructureID() {
                return structureID;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStructureID(String newStructureID) {
                String oldStructureID = structureID;
                structureID = newStructureID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.RESPONSE_TYPE__STRUCTURE_ID, oldStructureID, structureID));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case QsarPackage.RESPONSE_TYPE__VALUE:
                                return new Float(getValue());
                        case QsarPackage.RESPONSE_TYPE__ARRAY_VALUES:
                                return getArrayValues();
                        case QsarPackage.RESPONSE_TYPE__MOLECULE_RESOURCE:
                                return getMoleculeResource();
                        case QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX:
                                return new Integer(getResourceIndex());
                        case QsarPackage.RESPONSE_TYPE__STRUCTURE_ID:
                                return getStructureID();
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
                        case QsarPackage.RESPONSE_TYPE__VALUE:
                                setValue(((Float)newValue).floatValue());
                                return;
                        case QsarPackage.RESPONSE_TYPE__ARRAY_VALUES:
                                setArrayValues((String)newValue);
                                return;
                        case QsarPackage.RESPONSE_TYPE__MOLECULE_RESOURCE:
                                setMoleculeResource((String)newValue);
                                return;
                        case QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX:
                                setResourceIndex(((Integer)newValue).intValue());
                                return;
                        case QsarPackage.RESPONSE_TYPE__STRUCTURE_ID:
                                setStructureID((String)newValue);
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
                        case QsarPackage.RESPONSE_TYPE__VALUE:
                                unsetValue();
                                return;
                        case QsarPackage.RESPONSE_TYPE__ARRAY_VALUES:
                                setArrayValues(ARRAY_VALUES_EDEFAULT);
                                return;
                        case QsarPackage.RESPONSE_TYPE__MOLECULE_RESOURCE:
                                setMoleculeResource(MOLECULE_RESOURCE_EDEFAULT);
                                return;
                        case QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX:
                                unsetResourceIndex();
                                return;
                        case QsarPackage.RESPONSE_TYPE__STRUCTURE_ID:
                                setStructureID(STRUCTURE_ID_EDEFAULT);
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
                        case QsarPackage.RESPONSE_TYPE__VALUE:
                                return isSetValue();
                        case QsarPackage.RESPONSE_TYPE__ARRAY_VALUES:
                                return ARRAY_VALUES_EDEFAULT == null ? arrayValues != null : !ARRAY_VALUES_EDEFAULT.equals(arrayValues);
                        case QsarPackage.RESPONSE_TYPE__MOLECULE_RESOURCE:
                                return MOLECULE_RESOURCE_EDEFAULT == null ? moleculeResource != null : !MOLECULE_RESOURCE_EDEFAULT.equals(moleculeResource);
                        case QsarPackage.RESPONSE_TYPE__RESOURCE_INDEX:
                                return isSetResourceIndex();
                        case QsarPackage.RESPONSE_TYPE__STRUCTURE_ID:
                                return STRUCTURE_ID_EDEFAULT == null ? structureID != null : !STRUCTURE_ID_EDEFAULT.equals(structureID);
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
                result.append(" (value: ");
                if (valueESet) result.append(value); else result.append("<unset>");
                result.append(", arrayValues: ");
                result.append(arrayValues);
                result.append(", moleculeResource: ");
                result.append(moleculeResource);
                result.append(", resourceIndex: ");
                if (resourceIndexESet) result.append(resourceIndex); else result.append("<unset>");
                result.append(", structureID: ");
                result.append(structureID);
                result.append(')');
                return result.toString();
        }
} //ResponseTypeImpl
