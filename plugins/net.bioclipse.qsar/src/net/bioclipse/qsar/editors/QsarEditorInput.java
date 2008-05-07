/*******************************************************************************
 * Copyright (c) 2007 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     ola - initial API and implementation
 *     
 *******************************************************************************/
package net.bioclipse.qsar.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.part.FileEditorInput;

public class QsarEditorInput extends FileEditorInput {

    public QsarEditorInput(IFile file) {
        super(file);
    }
    
    

}
