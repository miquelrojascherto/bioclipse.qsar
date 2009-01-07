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
 * A representation of the model object '<em><b>Preprocessing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.PreprocessingType#getPreprocessingStep <em>Preprocessing Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getPreprocessingType()
 * @model extendedMetaData="name='preprocessingType' kind='elementOnly'"
 * @generated
 */
public interface PreprocessingType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * Returns the value of the '<em><b>Preprocessing Step</b></em>' containment reference list.
	 * The list contents are of type {@link net.bioclipse.qsar.PreprocessingStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessing Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing Step</em>' containment reference list.
	 * @see net.bioclipse.qsar.QsarPackage#getPreprocessingType_PreprocessingStep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preprocessingStep' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PreprocessingStepType> getPreprocessingStep();

} // PreprocessingType
