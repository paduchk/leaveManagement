package org.paduchk.ui;


import com.vaadin.ui.Button;
import com.vaadin.ui.Component;


public class MainLayout extends MainLayoutDesign {
	
	public void setPage(Component component ) {
		content.removeAllComponents();
		menu.removeAllComponents();
		content.addComponent(component);
		menu.addComponent(new Button("Menu"));
		
	}
}
