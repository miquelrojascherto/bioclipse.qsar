/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.provider;


import java.util.Collection;
import java.util.List;

import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.InbookType;

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
 * This is the item provider adapter for a {@link net.sf.bibtexml.InbookType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InbookTypeItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InbookTypeItemProvider(AdapterFactory adapterFactory) {
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
            addEditorPropertyDescriptor(object);
            addTitlePropertyDescriptor(object);
            addChapterPropertyDescriptor(object);
            addPagesPropertyDescriptor(object);
            addPages1PropertyDescriptor(object);
            addPublisherPropertyDescriptor(object);
            addYearPropertyDescriptor(object);
            addVolumePropertyDescriptor(object);
            addNumberPropertyDescriptor(object);
            addSeriesPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
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
                 getString("_UI_InbookType_author_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_author_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__AUTHOR,
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
                 getString("_UI_InbookType_editor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_editor_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__EDITOR,
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
                 getString("_UI_InbookType_title_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_title_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__TITLE,
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
                 getString("_UI_InbookType_chapter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_chapter_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__CHAPTER,
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
                 getString("_UI_InbookType_pages_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_pages_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__PAGES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pages1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPages1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InbookType_pages1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_pages1_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__PAGES1,
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
                 getString("_UI_InbookType_publisher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_publisher_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__PUBLISHER,
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
                 getString("_UI_InbookType_year_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_year_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__YEAR,
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
                 getString("_UI_InbookType_volume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_volume_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__VOLUME,
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
                 getString("_UI_InbookType_number_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_number_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__NUMBER,
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
                 getString("_UI_InbookType_series_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_series_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__SERIES,
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
                 getString("_UI_InbookType_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_type_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__TYPE,
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
                 getString("_UI_InbookType_address_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_address_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__ADDRESS,
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
                 getString("_UI_InbookType_edition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_edition_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__EDITION,
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
                 getString("_UI_InbookType_month_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_month_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__MONTH,
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
                 getString("_UI_InbookType_note_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_note_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__NOTE,
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
                 getString("_UI_InbookType_key_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_key_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__KEY,
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
                 getString("_UI_InbookType_crossref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_crossref_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__CROSSREF,
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
                 getString("_UI_InbookType_doi_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_doi_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__DOI,
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
                 getString("_UI_InbookType_url_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InbookType_url_feature", "_UI_InbookType_type"),
                 BibtexmlPackage.Literals.INBOOK_TYPE__URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns InbookType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/InbookType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((InbookType)object).getAuthor();
        return label == null || label.length() == 0 ?
            getString("_UI_InbookType_type") :
            getString("_UI_InbookType_type") + " " + label;
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

        switch (notification.getFeatureID(InbookType.class)) {
            case BibtexmlPackage.INBOOK_TYPE__AUTHOR:
            case BibtexmlPackage.INBOOK_TYPE__EDITOR:
            case BibtexmlPackage.INBOOK_TYPE__TITLE:
            case BibtexmlPackage.INBOOK_TYPE__CHAPTER:
            case BibtexmlPackage.INBOOK_TYPE__PAGES:
            case BibtexmlPackage.INBOOK_TYPE__PAGES1:
            case BibtexmlPackage.INBOOK_TYPE__PUBLISHER:
            case BibtexmlPackage.INBOOK_TYPE__YEAR:
            case BibtexmlPackage.INBOOK_TYPE__VOLUME:
            case BibtexmlPackage.INBOOK_TYPE__NUMBER:
            case BibtexmlPackage.INBOOK_TYPE__SERIES:
            case BibtexmlPackage.INBOOK_TYPE__TYPE:
            case BibtexmlPackage.INBOOK_TYPE__ADDRESS:
            case BibtexmlPackage.INBOOK_TYPE__EDITION:
            case BibtexmlPackage.INBOOK_TYPE__MONTH:
            case BibtexmlPackage.INBOOK_TYPE__NOTE:
            case BibtexmlPackage.INBOOK_TYPE__KEY:
            case BibtexmlPackage.INBOOK_TYPE__CROSSREF:
            case BibtexmlPackage.INBOOK_TYPE__DOI:
            case BibtexmlPackage.INBOOK_TYPE__URL:
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
        return BibtexmlHandwrittenEditPlugin.INSTANCE;
    }

}
