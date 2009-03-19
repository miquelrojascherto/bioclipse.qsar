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
import net.sf.bibtexml.ConferenceType;

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
 * This is the item provider adapter for a {@link net.sf.bibtexml.ConferenceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceTypeItemProvider
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
    public ConferenceTypeItemProvider(AdapterFactory adapterFactory) {
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
            addYearPropertyDescriptor(object);
            addEditorPropertyDescriptor(object);
            addVolumePropertyDescriptor(object);
            addNumberPropertyDescriptor(object);
            addSeriesPropertyDescriptor(object);
            addPagesPropertyDescriptor(object);
            addAddressPropertyDescriptor(object);
            addMonthPropertyDescriptor(object);
            addOrganizationPropertyDescriptor(object);
            addPublisherPropertyDescriptor(object);
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
                 getString("_UI_ConferenceType_author_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_author_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__AUTHOR,
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
                 getString("_UI_ConferenceType_title_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_title_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__TITLE,
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
                 getString("_UI_ConferenceType_booktitle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_booktitle_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__BOOKTITLE,
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
                 getString("_UI_ConferenceType_year_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_year_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__YEAR,
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
                 getString("_UI_ConferenceType_editor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_editor_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__EDITOR,
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
                 getString("_UI_ConferenceType_volume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_volume_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__VOLUME,
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
                 getString("_UI_ConferenceType_number_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_number_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__NUMBER,
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
                 getString("_UI_ConferenceType_series_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_series_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__SERIES,
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
                 getString("_UI_ConferenceType_pages_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_pages_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__PAGES,
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
                 getString("_UI_ConferenceType_address_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_address_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__ADDRESS,
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
                 getString("_UI_ConferenceType_month_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_month_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__MONTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Organization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrganizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConferenceType_organization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_organization_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__ORGANIZATION,
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
                 getString("_UI_ConferenceType_publisher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_publisher_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__PUBLISHER,
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
                 getString("_UI_ConferenceType_note_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_note_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__NOTE,
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
                 getString("_UI_ConferenceType_key_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_key_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__KEY,
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
                 getString("_UI_ConferenceType_crossref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_crossref_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__CROSSREF,
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
                 getString("_UI_ConferenceType_doi_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_doi_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__DOI,
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
                 getString("_UI_ConferenceType_url_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConferenceType_url_feature", "_UI_ConferenceType_type"),
                 BibtexmlPackage.Literals.CONFERENCE_TYPE__URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ConferenceType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConferenceType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ConferenceType)object).getAuthor();
        return label == null || label.length() == 0 ?
            getString("_UI_ConferenceType_type") :
            getString("_UI_ConferenceType_type") + " " + label;
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

        switch (notification.getFeatureID(ConferenceType.class)) {
            case BibtexmlPackage.CONFERENCE_TYPE__AUTHOR:
            case BibtexmlPackage.CONFERENCE_TYPE__TITLE:
            case BibtexmlPackage.CONFERENCE_TYPE__BOOKTITLE:
            case BibtexmlPackage.CONFERENCE_TYPE__YEAR:
            case BibtexmlPackage.CONFERENCE_TYPE__EDITOR:
            case BibtexmlPackage.CONFERENCE_TYPE__VOLUME:
            case BibtexmlPackage.CONFERENCE_TYPE__NUMBER:
            case BibtexmlPackage.CONFERENCE_TYPE__SERIES:
            case BibtexmlPackage.CONFERENCE_TYPE__PAGES:
            case BibtexmlPackage.CONFERENCE_TYPE__ADDRESS:
            case BibtexmlPackage.CONFERENCE_TYPE__MONTH:
            case BibtexmlPackage.CONFERENCE_TYPE__ORGANIZATION:
            case BibtexmlPackage.CONFERENCE_TYPE__PUBLISHER:
            case BibtexmlPackage.CONFERENCE_TYPE__NOTE:
            case BibtexmlPackage.CONFERENCE_TYPE__KEY:
            case BibtexmlPackage.CONFERENCE_TYPE__CROSSREF:
            case BibtexmlPackage.CONFERENCE_TYPE__DOI:
            case BibtexmlPackage.CONFERENCE_TYPE__URL:
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
