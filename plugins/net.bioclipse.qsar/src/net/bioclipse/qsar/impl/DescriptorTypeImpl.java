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

import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.ParameterType;
import net.bioclipse.qsar.QsarPackage;

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
 * An implementation of the model object '<em><b>Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getDescriptorimpl <em>Descriptorimpl</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptorTypeImpl extends EObjectImpl implements DescriptorType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parameter;

	/**
	 * The cached value of the '{@link #getDescriptorimpl() <em>Descriptorimpl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorimpl()
	 * @generated
	 * @ordered
	 */
	protected DescriptorimplType descriptorimpl;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QsarPackage.Literals.DESCRIPTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, QsarPackage.DESCRIPTOR_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorimplType getDescriptorimpl() {
		return descriptorimpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptorimpl(DescriptorimplType newDescriptorimpl, NotificationChain msgs) {
		DescriptorimplType oldDescriptorimpl = descriptorimpl;
		descriptorimpl = newDescriptorimpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL, oldDescriptorimpl, newDescriptorimpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorimpl(DescriptorimplType newDescriptorimpl) {
		if (newDescriptorimpl != descriptorimpl) {
			NotificationChain msgs = null;
			if (descriptorimpl != null)
				msgs = ((InternalEObject)descriptorimpl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL, null, msgs);
			if (newDescriptorimpl != null)
				msgs = ((InternalEObject)newDescriptorimpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL, null, msgs);
			msgs = basicSetDescriptorimpl(newDescriptorimpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL, newDescriptorimpl, newDescriptorimpl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QsarPackage.DESCRIPTOR_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL:
				return basicSetDescriptorimpl(null, msgs);
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
			case QsarPackage.DESCRIPTOR_TYPE__PARAMETER:
				return getParameter();
			case QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL:
				return getDescriptorimpl();
			case QsarPackage.DESCRIPTOR_TYPE__ID:
				return getId();
			case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
				return getNamespace();
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
			case QsarPackage.DESCRIPTOR_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL:
				setDescriptorimpl((DescriptorimplType)newValue);
				return;
			case QsarPackage.DESCRIPTOR_TYPE__ID:
				setId((String)newValue);
				return;
			case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
				setNamespace((String)newValue);
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
			case QsarPackage.DESCRIPTOR_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL:
				setDescriptorimpl((DescriptorimplType)null);
				return;
			case QsarPackage.DESCRIPTOR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case QsarPackage.DESCRIPTOR_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case QsarPackage.DESCRIPTOR_TYPE__DESCRIPTORIMPL:
				return descriptorimpl != null;
			case QsarPackage.DESCRIPTOR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //DescriptorTypeImpl
