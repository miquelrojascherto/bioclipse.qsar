package net.bioclipse.qsar.ui.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

public class MoleculeResource {

	IResource resource;
	int noMols;
	boolean has2D;
	boolean has3D;
	
	public MoleculeResource() {
		noMols=-1;
		has2D=false;
		has3D=false;
	}

	public MoleculeResource(IResource resource) {
		this();
		this.resource=resource;
	}

	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		this.resource = resource;
	}

	public int getNoMols() {
		return noMols;
	}
	public void setNoMols(int noMols) {
		this.noMols = noMols;
	}
	public boolean isHas2D() {
		return has2D;
	}
	public void setHas2D(boolean has2D) {
		this.has2D = has2D;
	}
	public boolean isHas3D() {
		return has3D;
	}
	public void setHas3D(boolean has3D) {
		this.has3D = has3D;
	}

	
	
}
