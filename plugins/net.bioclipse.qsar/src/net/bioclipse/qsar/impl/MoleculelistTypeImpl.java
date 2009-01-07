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

import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.QsarPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moleculelist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.MoleculelistTypeImpl#getMoleculeResource <em>Molecule Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoleculelistTypeImpl extends EObjectImpl implements MoleculelistType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * The cached value of the '{@link #getMoleculeResource() <em>Molecule Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoleculeResource()
	 * @generated
	 * @ordered
	 */
	protected EList<MoleculeResourceType> moleculeResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoleculelistTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QsarPackage.Literals.MOLECULELIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MoleculeResourceType> getMoleculeResource() {
		if (moleculeResource == null) {
			moleculeResource = new EObjectContainmentEList<MoleculeResourceType>(MoleculeResourceType.class, this, QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE);
		}
		return moleculeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE:
				return ((InternalEList<?>)getMoleculeResource()).basicRemove(otherEnd, msgs);
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
			case QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE:
				return getMoleculeResource();
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
			case QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE:
				getMoleculeResource().clear();
				getMoleculeResource().addAll((Collection<? extends MoleculeResourceType>)newValue);
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
			case QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE:
				getMoleculeResource().clear();
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
			case QsarPackage.MOLECULELIST_TYPE__MOLECULE_RESOURCE:
				return moleculeResource != null && !moleculeResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MoleculelistTypeImpl
