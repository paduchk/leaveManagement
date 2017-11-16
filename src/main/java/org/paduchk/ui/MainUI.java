package org.paduchk.ui;

import org.paduchk.ui.view.EmployeeDetailsView;
import org.paduchk.ui.view.EmployeesListView;
import org.paduchk.ui.view.test;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringUI
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {

	Navigator navigator;
	MainLayout mainLayout;
	

	//private static final long serialVersionUID = 1L;
	
	public MainUI(Navigator navigator) {
		this.navigator = navigator;
	}
	
	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		mainLayout = new MainLayout();
		setContent(mainLayout);
		//navigator.navigateTo(EmployeeDetailsView.VIEW_NAME);
		navigator.navigateTo(EmployeesListView.VIEW_NAME);
	}

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub
		mainLayout.setPage((Component)view);
		
	}
}
