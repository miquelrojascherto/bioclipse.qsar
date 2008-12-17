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
import java.util.Collection;
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.PreprocessingType;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ResponsesListType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.QsarTypeImpl#getMoleculelist <em>Moleculelist</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.QsarTypeImpl#getDescriptorlist <em>Descriptorlist</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.QsarTypeImpl#getDescriptorimpl <em>Descriptorimpl</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.QsarTypeImpl#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.QsarTypeImpl#getResponselist <em>Responselist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QsarTypeImpl extends EObjectImpl implements QsarType {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * The cached value of the '{@link #getMoleculelist() <em>Moleculelist</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMoleculelist()
         * @generated
         * @ordered
         */
        protected MoleculelistType moleculelist;
        /**
         * The cached value of the '{@link #getDescriptorlist() <em>Descriptorlist</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDescriptorlist()
         * @generated
         * @ordered
         */
        protected DescriptorlistType descriptorlist;
        /**
         * The cached value of the '{@link #getDescriptorimpl() <em>Descriptorimpl</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDescriptorimpl()
         * @generated
         * @ordered
         */
        protected EList<DescriptorimplType> descriptorimpl;
        /**
         * The cached value of the '{@link #getPreprocessing() <em>Preprocessing</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPreprocessing()
         * @generated
         * @ordered
         */
        protected PreprocessingType preprocessing;
        /**
         * The cached value of the '{@link #getResponselist() <em>Responselist</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getResponselist()
         * @generated
         * @ordered
         */
        protected ResponsesListType responselist;
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected QsarTypeImpl() {
                super();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return QsarPackage.Literals.QSAR_TYPE;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MoleculelistType getMoleculelist() {
                return moleculelist;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMoleculelist(MoleculelistType newMoleculelist, NotificationChain msgs) {
                MoleculelistType oldMoleculelist = moleculelist;
                moleculelist = newMoleculelist;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__MOLECULELIST, oldMoleculelist, newMoleculelist);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMoleculelist(MoleculelistType newMoleculelist) {
                if (newMoleculelist != moleculelist) {
                        NotificationChain msgs = null;
                        if (moleculelist != null)
                                msgs = ((InternalEObject)moleculelist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__MOLECULELIST, null, msgs);
                        if (newMoleculelist != null)
                                msgs = ((InternalEObject)newMoleculelist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__MOLECULELIST, null, msgs);
                        msgs = basicSetMoleculelist(newMoleculelist, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__MOLECULELIST, newMoleculelist, newMoleculelist));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DescriptorlistType getDescriptorlist() {
                return descriptorlist;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetDescriptorlist(DescriptorlistType newDescriptorlist, NotificationChain msgs) {
                DescriptorlistType oldDescriptorlist = descriptorlist;
                descriptorlist = newDescriptorlist;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__DESCRIPTORLIST, oldDescriptorlist, newDescriptorlist);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDescriptorlist(DescriptorlistType newDescriptorlist) {
                if (newDescriptorlist != descriptorlist) {
                        NotificationChain msgs = null;
                        if (descriptorlist != null)
                                msgs = ((InternalEObject)descriptorlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__DESCRIPTORLIST, null, msgs);
                        if (newDescriptorlist != null)
                                msgs = ((InternalEObject)newDescriptorlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__DESCRIPTORLIST, null, msgs);
                        msgs = basicSetDescriptorlist(newDescriptorlist, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__DESCRIPTORLIST, newDescriptorlist, newDescriptorlist));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DescriptorimplType> getDescriptorimpl() {
                if (descriptorimpl == null) {
                        descriptorimpl = new EObjectContainmentEList<DescriptorimplType>(DescriptorimplType.class, this, QsarPackage.QSAR_TYPE__DESCRIPTORIMPL);
                }
                return descriptorimpl;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public PreprocessingType getPreprocessing() {
                return preprocessing;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetPreprocessing(PreprocessingType newPreprocessing, NotificationChain msgs) {
                PreprocessingType oldPreprocessing = preprocessing;
                preprocessing = newPreprocessing;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__PREPROCESSING, oldPreprocessing, newPreprocessing);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPreprocessing(PreprocessingType newPreprocessing) {
                if (newPreprocessing != preprocessing) {
                        NotificationChain msgs = null;
                        if (preprocessing != null)
                                msgs = ((InternalEObject)preprocessing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__PREPROCESSING, null, msgs);
                        if (newPreprocessing != null)
                                msgs = ((InternalEObject)newPreprocessing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__PREPROCESSING, null, msgs);
                        msgs = basicSetPreprocessing(newPreprocessing, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__PREPROCESSING, newPreprocessing, newPreprocessing));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResponsesListType getResponselist() {
                return responselist;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetResponselist(ResponsesListType newResponselist, NotificationChain msgs) {
                ResponsesListType oldResponselist = responselist;
                responselist = newResponselist;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__RESPONSELIST, oldResponselist, newResponselist);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setResponselist(ResponsesListType newResponselist) {
                if (newResponselist != responselist) {
                        NotificationChain msgs = null;
                        if (responselist != null)
                                msgs = ((InternalEObject)responselist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__RESPONSELIST, null, msgs);
                        if (newResponselist != null)
                                msgs = ((InternalEObject)newResponselist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QsarPackage.QSAR_TYPE__RESPONSELIST, null, msgs);
                        msgs = basicSetResponselist(newResponselist, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.QSAR_TYPE__RESPONSELIST, newResponselist, newResponselist));
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case QsarPackage.QSAR_TYPE__MOLECULELIST:
                                return basicSetMoleculelist(null, msgs);
                        case QsarPackage.QSAR_TYPE__DESCRIPTORLIST:
                                return basicSetDescriptorlist(null, msgs);
                        case QsarPackage.QSAR_TYPE__DESCRIPTORIMPL:
                                return ((InternalEList<?>)getDescriptorimpl()).basicRemove(otherEnd, msgs);
                        case QsarPackage.QSAR_TYPE__PREPROCESSING:
                                return basicSetPreprocessing(null, msgs);
                        case QsarPackage.QSAR_TYPE__RESPONSELIST:
                                return basicSetResponselist(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case QsarPackage.QSAR_TYPE__MOLECULELIST:
                                return getMoleculelist();
                        case QsarPackage.QSAR_TYPE__DESCRIPTORLIST:
                                return getDescriptorlist();
                        case QsarPackage.QSAR_TYPE__DESCRIPTORIMPL:
                                return getDescriptorimpl();
                        case QsarPackage.QSAR_TYPE__PREPROCESSING:
                                return getPreprocessing();
                        case QsarPackage.QSAR_TYPE__RESPONSELIST:
                                return getResponselist();
                }
                return super.eGet(featureID, resolve, coreType);
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case QsarPackage.QSAR_TYPE__MOLECULELIST:
                                setMoleculelist((MoleculelistType)newValue);
                                return;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORLIST:
                                setDescriptorlist((DescriptorlistType)newValue);
                                return;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORIMPL:
                                getDescriptorimpl().clear();
                                getDescriptorimpl().addAll((Collection<? extends DescriptorimplType>)newValue);
                                return;
                        case QsarPackage.QSAR_TYPE__PREPROCESSING:
                                setPreprocessing((PreprocessingType)newValue);
                                return;
                        case QsarPackage.QSAR_TYPE__RESPONSELIST:
                                setResponselist((ResponsesListType)newValue);
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
                        case QsarPackage.QSAR_TYPE__MOLECULELIST:
                                setMoleculelist((MoleculelistType)null);
                                return;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORLIST:
                                setDescriptorlist((DescriptorlistType)null);
                                return;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORIMPL:
                                getDescriptorimpl().clear();
                                return;
                        case QsarPackage.QSAR_TYPE__PREPROCESSING:
                                setPreprocessing((PreprocessingType)null);
                                return;
                        case QsarPackage.QSAR_TYPE__RESPONSELIST:
                                setResponselist((ResponsesListType)null);
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
                        case QsarPackage.QSAR_TYPE__MOLECULELIST:
                                return moleculelist != null;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORLIST:
                                return descriptorlist != null;
                        case QsarPackage.QSAR_TYPE__DESCRIPTORIMPL:
                                return descriptorimpl != null && !descriptorimpl.isEmpty();
                        case QsarPackage.QSAR_TYPE__PREPROCESSING:
                                return preprocessing != null;
                        case QsarPackage.QSAR_TYPE__RESPONSELIST:
                                return responselist != null;
                }
                return super.eIsSet(featureID);
        }
} //QsarTypeImpl
