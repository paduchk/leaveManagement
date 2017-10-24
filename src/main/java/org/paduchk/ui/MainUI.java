package org.paduchk.ui;

import org.paduchk.ui.view.EmployeeDetailsView;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;

import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class MainUI extends UI {

	Navigator uiNavigator;
	MainLayout mainLayout;

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public MainUI(Navigator uiNavigator, MainLayout mainLayout) {
		this.uiNavigator = uiNavigator;
		this.mainLayout = mainLayout;
	}
	
	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub

		Label title = new Label("Leave Managenent");
		Label title1 = new Label("Leave Managenent1");
/*
		mainLayout.addComponent(title);
		mainLayout.addComponent(title1);
		mainLayout.addComponent(title);
		mainLayout.addComponent(title);
*/
		
		setContent(mainLayout);
;
	}
}
