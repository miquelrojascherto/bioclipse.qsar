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
package net.sf.bibtexml.provider;


import java.util.Collection;
import java.util.List;

import net.bioclipse.qsar.provider.QsarmodelEditPlugin;
import net.sf.bibtexml.BibTeXMLEntriesClass;
import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.BibtexmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.bibtexml.BibTeXMLEntriesClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BibTeXMLEntriesClassItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibTeXMLEntriesClassItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__ARTICLE);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__BOOK);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__BOOKLET);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MANUAL);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INBOOK);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED);
            childrenFeatures.add(BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MISC);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns BibTeXMLEntriesClass.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/BibTeXMLEntriesClass"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_BibTeXMLEntriesClass_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(BibTeXMLEntriesClass.class)) {
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__ARTICLE,
                 BibtexmlFactory.eINSTANCE.createArticleType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__BOOK,
                 BibtexmlFactory.eINSTANCE.createBookType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__BOOKLET,
                 BibtexmlFactory.eINSTANCE.createBookletType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MANUAL,
                 BibtexmlFactory.eINSTANCE.createManualType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT,
                 BibtexmlFactory.eINSTANCE.createTechreportType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS,
                 BibtexmlFactory.eINSTANCE.createMastersthesisType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS,
                 BibtexmlFactory.eINSTANCE.createPhdthesisType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INBOOK,
                 BibtexmlFactory.eINSTANCE.createInbookType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION,
                 BibtexmlFactory.eINSTANCE.createIncollectionType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS,
                 BibtexmlFactory.eINSTANCE.createProceedingsType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS,
                 BibtexmlFactory.eINSTANCE.createInproceedingsType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE,
                 BibtexmlFactory.eINSTANCE.createConferenceType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED,
                 BibtexmlFactory.eINSTANCE.createUnpublishedType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS__MISC,
                 BibtexmlFactory.eINSTANCE.createMiscType()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return QsarmodelEditPlugin.INSTANCE;
    }

}
