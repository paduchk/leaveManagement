package org.paduchk.ui;

import org.paduchk.ui.view.EmployeeDetailsView;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Component;


public class MainLayout extends MainLayoutDesign {
	
	public void setPage(Component component ) {
		content.removeAllComponents();
		content.addComponent(component);
	}
}
