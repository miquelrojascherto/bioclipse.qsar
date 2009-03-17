/**
 *  Copyright (c) 2009 Ola Spjuth
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar.impl;

import java.util.Collection;

import net.bioclipse.qsar.DescriptorType;
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
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.DescriptorTypeImpl#getProvider <em>Provider</em>}</li>
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
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

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
     * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isChanged()
     * @generated
     * @ordered
     */
    protected static final boolean CHANGED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isChanged()
     * @generated
     * @ordered
     */
    protected boolean changed = CHANGED_EDEFAULT;

    /**
     * This is true if the Changed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedESet;

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
     * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected static final String PROVIDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected String provider = PROVIDER_EDEFAULT;

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
    public boolean isChanged() {
        return changed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChanged(boolean newChanged) {
        boolean oldChanged = changed;
        changed = newChanged;
        boolean oldChangedESet = changedESet;
        changedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__CHANGED, oldChanged, changed, !oldChangedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetChanged() {
        boolean oldChanged = changed;
        boolean oldChangedESet = changedESet;
        changed = CHANGED_EDEFAULT;
        changedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, QsarPackage.DESCRIPTOR_TYPE__CHANGED, oldChanged, CHANGED_EDEFAULT, oldChangedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetChanged() {
        return changedESet;
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
    public String getProvider() {
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProvider(String newProvider) {
        String oldProvider = provider;
        provider = newProvider;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.DESCRIPTOR_TYPE__PROVIDER, oldProvider, provider));
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
            case QsarPackage.DESCRIPTOR_TYPE__CHANGED:
                return isChanged() ? Boolean.TRUE : Boolean.FALSE;
            case QsarPackage.DESCRIPTOR_TYPE__ID:
                return getId();
            case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
                return getNamespace();
            case QsarPackage.DESCRIPTOR_TYPE__PROVIDER:
                return getProvider();
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
            case QsarPackage.DESCRIPTOR_TYPE__CHANGED:
                setChanged(((Boolean)newValue).booleanValue());
                return;
            case QsarPackage.DESCRIPTOR_TYPE__ID:
                setId((String)newValue);
                return;
            case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
                setNamespace((String)newValue);
                return;
            case QsarPackage.DESCRIPTOR_TYPE__PROVIDER:
                setProvider((String)newValue);
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
            case QsarPackage.DESCRIPTOR_TYPE__CHANGED:
                unsetChanged();
                return;
            case QsarPackage.DESCRIPTOR_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
                setNamespace(NAMESPACE_EDEFAULT);
                return;
            case QsarPackage.DESCRIPTOR_TYPE__PROVIDER:
                setProvider(PROVIDER_EDEFAULT);
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
            case QsarPackage.DESCRIPTOR_TYPE__CHANGED:
                return isSetChanged();
            case QsarPackage.DESCRIPTOR_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case QsarPackage.DESCRIPTOR_TYPE__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
            case QsarPackage.DESCRIPTOR_TYPE__PROVIDER:
                return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
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
        result.append(" (changed: ");
        if (changedESet) result.append(changed); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", namespace: ");
        result.append(namespace);
        result.append(", provider: ");
        result.append(provider);
        result.append(')');
        return result.toString();
    }

} //DescriptorTypeImpl
