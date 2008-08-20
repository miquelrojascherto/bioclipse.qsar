package net.bioclipse.qsar.descriptor.model;

import net.bioclipse.qsar.init.Activator;

import org.eclipse.swt.graphics.Image;


public class BaseEPObject {

	String id;
	String name;
	String icon_path;
	Image icon;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon_path() {
		return icon_path;
	}
	public void setIcon_path(String icon_path) {
		this.icon_path = icon_path;
	}
	public Image getIcon() {
		if (icon_path==null){
			return null;
		}
		if (icon==null){
			Activator.getDefault();
			icon=Activator.getImageDescriptor(icon_path).createImage();
		}
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}

	
	public BaseEPObject(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public BaseEPObject(String id, String name, String icon_path) {
		this(id,name);
		this.icon_path=icon_path;
	}

}
