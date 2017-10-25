package org.paduchk.ui;

import org.paduchk.ui.view.EmployeeDetailsView;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {

	Navigator navigator;
	MainLayout mainLayout;
	

	private static final long serialVersionUID = 1L;
	
	public MainUI(Navigator navigator) {
		this.navigator = navigator;
	}
	
	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		mainLayout = new MainLayout();
		Label title = new Label("Leave Managenent");
		Label title1 = new Label("Leave Managenent1");
		Label title2 = new Label("Leave Managenent2");
/*
		mainLayout.addComponent(title);
		mainLayout.addComponent(title1);
		mainLayout.addComponent(title2);

		mainLayout.addComponent(title);
*/	
		
		setContent(mainLayout);
		navigator.addView("employee", EmployeeDetailsView.class);
		navigator.navigateTo("employee");
		
;
	}

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub
		mainLayout.setPage((Component)view);
		
	}
}
