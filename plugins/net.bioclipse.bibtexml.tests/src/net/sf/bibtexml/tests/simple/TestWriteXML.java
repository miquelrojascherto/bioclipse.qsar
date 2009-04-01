package net.sf.bibtexml.tests.simple;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import net.sf.bibtexml.ArticleType;
import net.sf.bibtexml.BibTeXMLEntryType;
import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.DocumentRoot;
import net.sf.bibtexml.FileType;
import net.sf.bibtexml.util.BibtexmlAdapterFactory;
import net.sf.bibtexml.util.BibtexmlResourceFactoryImpl;


public class TestWriteXML {

    public static void main( String[] args ) {

        System.out.println("start");

        @SuppressWarnings("unused")
        BibtexmlAdapterFactory factory=new BibtexmlAdapterFactory();

        //Create the super types
        DocumentRoot root = BibtexmlFactory.eINSTANCE.createDocumentRoot();
        
        FileType file = BibtexmlFactory.eINSTANCE.createFileType();
        root.setFile( file );

        BibTeXMLEntryType entry = BibtexmlFactory.eINSTANCE.createBibTeXMLEntryType();

        ArticleType article=BibtexmlFactory.eINSTANCE.createArticleType();
        article.setAuthor( "Spjuth, Ola and Helmus, Tobias and Willighagen, Egon and Kuhn, Stefan and Eklund, Martin and Wagener, Johannes and Murray-Rust, Peter and Steinbeck, Christoph and Wikberg, Jarl" );
        article.setTitle( "Bioclipse: an open source workbench for chemo- and bioinformatics" );
        article.setJournal( "BMC Bioinformatics" );
        article.setVolume( "8" );

        try {
            DatatypeFactory dt = DatatypeFactory.newInstance();
            XMLGregorianCalendar cal = dt.newXMLGregorianCalendar();
            cal.setYear( 2007 );
            article.setYear( cal );
        } catch ( DatatypeConfigurationException e ) {
            e.printStackTrace();
            return;
        }
        article.setNumber( "1" );
        article.setPages( "59" );
        article.setDoi( "10.1186/1471-2105-8-59" );
        article.setUrl( "http://www.biomedcentral.com/1471-2105/8/59" );

        entry.setArticle( article );

        file.getEntry().add( entry );
        
        serializeToSTDOUT( root );

        System.out.println("end");


    }
    
    
    private static void serializeToSTDOUT(DocumentRoot root) {
        ResourceSet resourceSet=new ResourceSetImpl();
        URI fileURI;
        try {
          fileURI = URI.createFileURI(new File("serializedarticle.xml").getAbsolutePath());
          Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new BibtexmlResourceFactoryImpl());

          Resource resource=resourceSet.createResource(fileURI);
          resource.getContents().add(root);

          Map opts=new HashMap();
          opts.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
          opts.put(XMLResource.OPTION_ENCODING, "UTF-8");
          
          //Save to file
          resource.save(opts);

          //Serialize to byte[] and print to sysout
          ByteArrayOutputStream os=new ByteArrayOutputStream();
          resource.save(os, opts);
          System.out.println(new String(os.toByteArray()));

        } catch (IOException e) {
          e.printStackTrace();
        }
        
      }

}
