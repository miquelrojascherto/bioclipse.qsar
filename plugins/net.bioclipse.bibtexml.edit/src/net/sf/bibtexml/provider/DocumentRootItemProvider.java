/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.provider;


import java.util.Collection;
import java.util.List;

import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.DocumentRoot;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link net.sf.bibtexml.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

            addAddressPropertyDescriptor(object);
            addAnnotePropertyDescriptor(object);
            addAuthorPropertyDescriptor(object);
            addBooktitlePropertyDescriptor(object);
            addChapterPropertyDescriptor(object);
            addCrossrefPropertyDescriptor(object);
            addDoiPropertyDescriptor(object);
            addEditionPropertyDescriptor(object);
            addEditorPropertyDescriptor(object);
            addHowpublishedPropertyDescriptor(object);
            addInstitutionPropertyDescriptor(object);
            addJournalPropertyDescriptor(object);
            addKeyPropertyDescriptor(object);
            addMonthPropertyDescriptor(object);
            addNotePropertyDescriptor(object);
            addNumberPropertyDescriptor(object);
            addOrganizationPropertyDescriptor(object);
            addPagesPropertyDescriptor(object);
            addPublisherPropertyDescriptor(object);
            addSchoolPropertyDescriptor(object);
            addSeriesPropertyDescriptor(object);
            addTitlePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addUrlPropertyDescriptor(object);
            addVolumePropertyDescriptor(object);
            addYearPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_DocumentRoot_address_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_address_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__ADDRESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Annote feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAnnotePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_annote_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_annote_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__ANNOTE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_DocumentRoot_author_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_author_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__AUTHOR,
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
                 getString("_UI_DocumentRoot_booktitle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_booktitle_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKTITLE,
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
                 getString("_UI_DocumentRoot_chapter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_chapter_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__CHAPTER,
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
                 getString("_UI_DocumentRoot_crossref_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_crossref_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__CROSSREF,
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
                 getString("_UI_DocumentRoot_doi_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_doi_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__DOI,
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
                 getString("_UI_DocumentRoot_edition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_edition_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITION,
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
                 getString("_UI_DocumentRoot_editor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_editor_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Howpublished feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHowpublishedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_howpublished_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_howpublished_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__HOWPUBLISHED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Institution feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstitutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_institution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_institution_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__INSTITUTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Journal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJournalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_journal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_journal_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__JOURNAL,
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
                 getString("_UI_DocumentRoot_key_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_key_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__KEY,
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
                 getString("_UI_DocumentRoot_month_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_month_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__MONTH,
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
                 getString("_UI_DocumentRoot_note_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_note_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__NOTE,
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
                 getString("_UI_DocumentRoot_number_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_number_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__NUMBER,
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
                 getString("_UI_DocumentRoot_organization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_organization_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION,
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
                 getString("_UI_DocumentRoot_pages_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_pages_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__PAGES,
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
                 getString("_UI_DocumentRoot_publisher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_publisher_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the School feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSchoolPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_school_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_school_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__SCHOOL,
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
                 getString("_UI_DocumentRoot_series_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_series_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__SERIES,
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
                 getString("_UI_DocumentRoot_title_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_title_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__TITLE,
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
                 getString("_UI_DocumentRoot_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_type_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__TYPE,
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
                 getString("_UI_DocumentRoot_url_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_url_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__URL,
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
                 getString("_UI_DocumentRoot_volume_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_volume_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__VOLUME,
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
                 getString("_UI_DocumentRoot_year_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_year_feature", "_UI_DocumentRoot_type"),
                 BibtexmlPackage.Literals.DOCUMENT_ROOT__YEAR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__ARTICLE);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOK);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKLET);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__CONFERENCE);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__ENTRY);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__FILE);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__INBOOK);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__INCOLLECTION);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__INPROCEEDINGS);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__MANUAL);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__MASTERSTHESIS);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__MISC);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__PHDTHESIS);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__PROCEEDINGS);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__TECHREPORT);
            childrenFeatures.add(BibtexmlPackage.Literals.DOCUMENT_ROOT__UNPUBLISHED);
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
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DocumentRoot)object).getAddress();
        return label == null || label.length() == 0 ?
            getString("_UI_DocumentRoot_type") :
            getString("_UI_DocumentRoot_type") + " " + label;
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

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case BibtexmlPackage.DOCUMENT_ROOT__ADDRESS:
            case BibtexmlPackage.DOCUMENT_ROOT__ANNOTE:
            case BibtexmlPackage.DOCUMENT_ROOT__AUTHOR:
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKTITLE:
            case BibtexmlPackage.DOCUMENT_ROOT__CHAPTER:
            case BibtexmlPackage.DOCUMENT_ROOT__CROSSREF:
            case BibtexmlPackage.DOCUMENT_ROOT__DOI:
            case BibtexmlPackage.DOCUMENT_ROOT__EDITION:
            case BibtexmlPackage.DOCUMENT_ROOT__EDITOR:
            case BibtexmlPackage.DOCUMENT_ROOT__HOWPUBLISHED:
            case BibtexmlPackage.DOCUMENT_ROOT__INSTITUTION:
            case BibtexmlPackage.DOCUMENT_ROOT__JOURNAL:
            case BibtexmlPackage.DOCUMENT_ROOT__KEY:
            case BibtexmlPackage.DOCUMENT_ROOT__MONTH:
            case BibtexmlPackage.DOCUMENT_ROOT__NOTE:
            case BibtexmlPackage.DOCUMENT_ROOT__NUMBER:
            case BibtexmlPackage.DOCUMENT_ROOT__ORGANIZATION:
            case BibtexmlPackage.DOCUMENT_ROOT__PAGES:
            case BibtexmlPackage.DOCUMENT_ROOT__PUBLISHER:
            case BibtexmlPackage.DOCUMENT_ROOT__SCHOOL:
            case BibtexmlPackage.DOCUMENT_ROOT__SERIES:
            case BibtexmlPackage.DOCUMENT_ROOT__TITLE:
            case BibtexmlPackage.DOCUMENT_ROOT__TYPE:
            case BibtexmlPackage.DOCUMENT_ROOT__URL:
            case BibtexmlPackage.DOCUMENT_ROOT__VOLUME:
            case BibtexmlPackage.DOCUMENT_ROOT__YEAR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
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
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__ARTICLE,
                 BibtexmlFactory.eINSTANCE.createArticleType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOK,
                 BibtexmlFactory.eINSTANCE.createBookType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKLET,
                 BibtexmlFactory.eINSTANCE.createBookletType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__CONFERENCE,
                 BibtexmlFactory.eINSTANCE.createConferenceType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__ENTRY,
                 BibtexmlFactory.eINSTANCE.createEntryType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__FILE,
                 BibtexmlFactory.eINSTANCE.createFileType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__INBOOK,
                 BibtexmlFactory.eINSTANCE.createInbookType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__INCOLLECTION,
                 BibtexmlFactory.eINSTANCE.createIncollectionType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__INPROCEEDINGS,
                 BibtexmlFactory.eINSTANCE.createInproceedingsType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__MANUAL,
                 BibtexmlFactory.eINSTANCE.createManualType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__MASTERSTHESIS,
                 BibtexmlFactory.eINSTANCE.createMastersthesisType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__MISC,
                 BibtexmlFactory.eINSTANCE.createMiscType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__PHDTHESIS,
                 BibtexmlFactory.eINSTANCE.createPhdthesisType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__PROCEEDINGS,
                 BibtexmlFactory.eINSTANCE.createProceedingsType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__TECHREPORT,
                 BibtexmlFactory.eINSTANCE.createTechreportType()));

        newChildDescriptors.add
            (createChildParameter
                (BibtexmlPackage.Literals.DOCUMENT_ROOT__UNPUBLISHED,
                 BibtexmlFactory.eINSTANCE.createUnpublishedType()));
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
