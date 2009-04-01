package net.bioclipse.qsar.test.business;

import java.io.ByteArrayInputStream;

import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.ui.util.QsarXMLUtils;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;



public class TestQsarBuilder {

    @Test
    public void testReadEmptyFile(){
        
        ByteArrayInputStream bos=new ByteArrayInputStream(QsarXMLUtils.getEmptyContent());

        
        

    }
    
    
}
