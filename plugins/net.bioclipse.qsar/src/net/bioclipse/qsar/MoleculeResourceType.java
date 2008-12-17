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
import org.eclipse.emf.ecore.EObject;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecule Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#isExcluded <em>Excluded</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getFile <em>File</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getName <em>Name</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getNo2d <em>No2d</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getNo3d <em>No3d</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getNoMols <em>No Mols</em>}</li>
 *   <li>{@link net.bioclipse.qsar.MoleculeResourceType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType()
 * @model extendedMetaData="name='moleculeResourceType' kind='empty'"
 * @generated
 */
public interface MoleculeResourceType extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * Returns the value of the '<em><b>Excluded</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Excluded</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Excluded</em>' attribute.
         * @see #isSetExcluded()
         * @see #unsetExcluded()
         * @see #setExcluded(boolean)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_Excluded()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
         *        extendedMetaData="kind='attribute' name='excluded'"
         * @generated
         */
        boolean isExcluded();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#isExcluded <em>Excluded</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Excluded</em>' attribute.
         * @see #isSetExcluded()
         * @see #unsetExcluded()
         * @see #isExcluded()
         * @generated
         */
        void setExcluded(boolean value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#isExcluded <em>Excluded</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetExcluded()
         * @see #isExcluded()
         * @see #setExcluded(boolean)
         * @generated
         */
        void unsetExcluded();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#isExcluded <em>Excluded</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Excluded</em>' attribute is set.
         * @see #unsetExcluded()
         * @see #isExcluded()
         * @see #setExcluded(boolean)
         * @generated
         */
        boolean isSetExcluded();
        /**
         * Returns the value of the '<em><b>File</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>File</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>File</em>' attribute.
         * @see #setFile(String)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_File()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='file'"
         * @generated
         */
        String getFile();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getFile <em>File</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>File</em>' attribute.
         * @see #getFile()
         * @generated
         */
        void setFile(String value);
        /**
         * Returns the value of the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Id</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Id</em>' attribute.
         * @see #setId(String)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_Id()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='id'"
         * @generated
         */
        String getId();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getId <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Id</em>' attribute.
         * @see #getId()
         * @generated
         */
        void setId(String value);
        /**
         * Returns the value of the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Name</em>' attribute.
         * @see #setName(String)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_Name()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='name'"
         * @generated
         */
        String getName();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);
        /**
         * Returns the value of the '<em><b>Namespace</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Namespace</em>' attribute.
         * @see #setNamespace(String)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_Namespace()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='namespace'"
         * @generated
         */
        String getNamespace();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNamespace <em>Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Namespace</em>' attribute.
         * @see #getNamespace()
         * @generated
         */
        void setNamespace(String value);
        /**
         * Returns the value of the '<em><b>No2d</b></em>' attribute.
         * The default value is <code>"-1"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>No2d</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>No2d</em>' attribute.
         * @see #isSetNo2d()
         * @see #unsetNo2d()
         * @see #setNo2d(int)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_No2d()
         * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" transient="true"
         *        extendedMetaData="kind='attribute' name='no2d'"
         * @generated
         */
        int getNo2d();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo2d <em>No2d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>No2d</em>' attribute.
         * @see #isSetNo2d()
         * @see #unsetNo2d()
         * @see #getNo2d()
         * @generated
         */
        void setNo2d(int value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo2d <em>No2d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetNo2d()
         * @see #getNo2d()
         * @see #setNo2d(int)
         * @generated
         */
        void unsetNo2d();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo2d <em>No2d</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>No2d</em>' attribute is set.
         * @see #unsetNo2d()
         * @see #getNo2d()
         * @see #setNo2d(int)
         * @generated
         */
        boolean isSetNo2d();
        /**
         * Returns the value of the '<em><b>No3d</b></em>' attribute.
         * The default value is <code>"-1"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>No3d</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>No3d</em>' attribute.
         * @see #isSetNo3d()
         * @see #unsetNo3d()
         * @see #setNo3d(int)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_No3d()
         * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" transient="true"
         *        extendedMetaData="kind='attribute' name='no3d'"
         * @generated
         */
        int getNo3d();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo3d <em>No3d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>No3d</em>' attribute.
         * @see #isSetNo3d()
         * @see #unsetNo3d()
         * @see #getNo3d()
         * @generated
         */
        void setNo3d(int value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo3d <em>No3d</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetNo3d()
         * @see #getNo3d()
         * @see #setNo3d(int)
         * @generated
         */
        void unsetNo3d();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNo3d <em>No3d</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>No3d</em>' attribute is set.
         * @see #unsetNo3d()
         * @see #getNo3d()
         * @see #setNo3d(int)
         * @generated
         */
        boolean isSetNo3d();
        /**
         * Returns the value of the '<em><b>No Mols</b></em>' attribute.
         * The default value is <code>"-1"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>No Mols</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>No Mols</em>' attribute.
         * @see #isSetNoMols()
         * @see #unsetNoMols()
         * @see #setNoMols(int)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_NoMols()
         * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" transient="true"
         *        extendedMetaData="kind='attribute' name='noMols'"
         * @generated
         */
        int getNoMols();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNoMols <em>No Mols</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>No Mols</em>' attribute.
         * @see #isSetNoMols()
         * @see #unsetNoMols()
         * @see #getNoMols()
         * @generated
         */
        void setNoMols(int value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNoMols <em>No Mols</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetNoMols()
         * @see #getNoMols()
         * @see #setNoMols(int)
         * @generated
         */
        void unsetNoMols();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getNoMols <em>No Mols</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>No Mols</em>' attribute is set.
         * @see #unsetNoMols()
         * @see #getNoMols()
         * @see #setNoMols(int)
         * @generated
         */
        boolean isSetNoMols();
        /**
         * Returns the value of the '<em><b>Url</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Url</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Url</em>' attribute.
         * @see #setUrl(String)
         * @see net.bioclipse.qsar.QsarPackage#getMoleculeResourceType_Url()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='url'"
         * @generated
         */
        String getUrl();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.MoleculeResourceType#getUrl <em>Url</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Url</em>' attribute.
         * @see #getUrl()
         * @generated
         */
        void setUrl(String value);
} // MoleculeResourceType
