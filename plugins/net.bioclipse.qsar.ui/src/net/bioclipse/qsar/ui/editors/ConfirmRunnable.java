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
package net.bioclipse.qsar.ui.editors;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Class to be able to ask for confirmation iside a non-UI thread
 * @author ola
 *
 */
public class ConfirmRunnable implements Runnable{
	public boolean answer;
	private Shell shell;
	private String contents;
	private String title;

	public ConfirmRunnable(Shell shell, String title, String contents) {
		this.shell=shell;
		this.title=title;
		this.contents=contents;
	}
	
	public void run() {
			answer=MessageDialog.openQuestion(shell, title, contents);
	}

	public boolean getAnswer() {
		return answer;
	}
	
	

}
