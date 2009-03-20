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
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.IncollectionType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.bibtexml.IncollectionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IncollectionTypeItemProvider
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
    public IncollectionTypeItemProvider(AdapterFactory adapterFactory) {
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

            addAuthorPropertyDescriptor(object);
            addTitlePropertyDescriptor(object);
            addBooktitlePropertyDescriptor(object);
            addPublisherPropertyDescriptor(object);
            addYearPropertyDescriptor(object);
            addEditorPropertyDescriptor(object);
            addVolumePropertyDescriptor(object);
            addNumberPropertyDescriptor(object);
            addSeriesPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addChapterPropertyDescriptor(object);
            addPagesPropertyDescriptor(object);
            addAddressPropertyDescriptor(object);
            addEditionPropertyDescriptor(object);
            addMonthPropertyDescriptor(object);
            addNotePropertyDescriptor(object);
            addKeyPropertyDescriptor(object);
            addCrossrefPropertyDescriptor(object);
            addDoiPropertyDescriptor(object);
            addUrlPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Author feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_author_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_author_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__AUTHOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTitlePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_title_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_title_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__TITLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Booktitle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBooktitlePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_booktitle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_booktitle_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__BOOKTITLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Publisher feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPublisherPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_publisher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_publisher_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__PUBLISHER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Year feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYearPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_year_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_year_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__YEAR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Editor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEditorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_editor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_editor_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__EDITOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Volume feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVolumePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_volume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_volume_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__VOLUME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumberPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_number_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_number_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__NUMBER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Series feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_series_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_series_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__SERIES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_type_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Chapter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChapterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_chapter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_chapter_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__CHAPTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pages feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPagesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_pages_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_pages_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__PAGES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAddressPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_address_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_address_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__ADDRESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Edition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEditionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_edition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_edition_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__EDITION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Month feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMonthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_month_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_month_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__MONTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Note feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNotePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_note_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_note_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__NOTE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Key feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_key_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_key_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__KEY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Crossref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrossrefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_crossref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_crossref_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__CROSSREF,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Doi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDoiPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_doi_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_doi_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__DOI,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Url feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUrlPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IncollectionType_url_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IncollectionType_url_feature", "_UI_IncollectionType_type"),
                 BibtexmlPackage.Literals.INCOLLECTION_TYPE__URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns IncollectionType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/IncollectionType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((IncollectionType)object).getAuthor();
        return label == null || label.length() == 0 ?
            getString("_UI_IncollectionType_type") :
            getString("_UI_IncollectionType_type") + " " + label;
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

        switch (notification.getFeatureID(IncollectionType.class)) {
            case BibtexmlPackage.INCOLLECTION_TYPE__AUTHOR:
            case BibtexmlPackage.INCOLLECTION_TYPE__TITLE:
            case BibtexmlPackage.INCOLLECTION_TYPE__BOOKTITLE:
            case BibtexmlPackage.INCOLLECTION_TYPE__PUBLISHER:
            case BibtexmlPackage.INCOLLECTION_TYPE__YEAR:
            case BibtexmlPackage.INCOLLECTION_TYPE__EDITOR:
            case BibtexmlPackage.INCOLLECTION_TYPE__VOLUME:
            case BibtexmlPackage.INCOLLECTION_TYPE__NUMBER:
            case BibtexmlPackage.INCOLLECTION_TYPE__SERIES:
            case BibtexmlPackage.INCOLLECTION_TYPE__TYPE:
            case BibtexmlPackage.INCOLLECTION_TYPE__CHAPTER:
            case BibtexmlPackage.INCOLLECTION_TYPE__PAGES:
            case BibtexmlPackage.INCOLLECTION_TYPE__ADDRESS:
            case BibtexmlPackage.INCOLLECTION_TYPE__EDITION:
            case BibtexmlPackage.INCOLLECTION_TYPE__MONTH:
            case BibtexmlPackage.INCOLLECTION_TYPE__NOTE:
            case BibtexmlPackage.INCOLLECTION_TYPE__KEY:
            case BibtexmlPackage.INCOLLECTION_TYPE__CROSSREF:
            case BibtexmlPackage.INCOLLECTION_TYPE__DOI:
            case BibtexmlPackage.INCOLLECTION_TYPE__URL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
