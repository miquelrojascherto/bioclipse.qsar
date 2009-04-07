/*******************************************************************************
 * Copyright (c) 2009 Ola Spjuth.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 ******************************************************************************/
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
