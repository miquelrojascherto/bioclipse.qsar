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
package net.bioclipse.qsar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.QsarType#getMoleculelist <em>Moleculelist</em>}</li>
 *   <li>{@link net.bioclipse.qsar.QsarType#getDescriptorlist <em>Descriptorlist</em>}</li>
 *   <li>{@link net.bioclipse.qsar.QsarType#getDescriptorimpl <em>Descriptorimpl</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getQsarType()
 * @model extendedMetaData="name='qsarType' kind='elementOnly'"
 * @generated
 */
public interface QsarType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * Returns the value of the '<em><b>Moleculelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moleculelist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moleculelist</em>' containment reference.
	 * @see #setMoleculelist(MoleculelistType)
	 * @see net.bioclipse.qsar.QsarPackage#getQsarType_Moleculelist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moleculelist' namespace='##targetNamespace'"
	 * @generated
	 */
	MoleculelistType getMoleculelist();

	/**
	 * Sets the value of the '{@link net.bioclipse.qsar.QsarType#getMoleculelist <em>Moleculelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moleculelist</em>' containment reference.
	 * @see #getMoleculelist()
	 * @generated
	 */
	void setMoleculelist(MoleculelistType value);

	/**
	 * Returns the value of the '<em><b>Descriptorlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptorlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptorlist</em>' containment reference.
	 * @see #setDescriptorlist(DescriptorlistType)
	 * @see net.bioclipse.qsar.QsarPackage#getQsarType_Descriptorlist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptorlist' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptorlistType getDescriptorlist();

	/**
	 * Sets the value of the '{@link net.bioclipse.qsar.QsarType#getDescriptorlist <em>Descriptorlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptorlist</em>' containment reference.
	 * @see #getDescriptorlist()
	 * @generated
	 */
	void setDescriptorlist(DescriptorlistType value);

	/**
	 * Returns the value of the '<em><b>Descriptorimpl</b></em>' containment reference list.
	 * The list contents are of type {@link net.bioclipse.qsar.DescriptorimplType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptorimpl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptorimpl</em>' containment reference list.
	 * @see net.bioclipse.qsar.QsarPackage#getQsarType_Descriptorimpl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptorimpl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DescriptorimplType> getDescriptorimpl();

} // QsarType
