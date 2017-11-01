package org.paduchk.ui;


import com.vaadin.ui.Component;


public class MainLayout extends MainLayoutDesign {
	
	public void setPage(Component component ) {
		content.removeAllComponents();
		content.addComponent(component);
	}
}
