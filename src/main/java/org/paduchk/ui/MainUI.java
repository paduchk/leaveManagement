package org.paduchk.ui;

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
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {

	Navigator navigator;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public MainUI(Navigator navigator) {
		this.navigator = navigator;
	}
	
	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub
		

	}

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		VerticalLayout mainLayout = new VerticalLayout();
		Label title = new Label("Leave Managenent");
		mainLayout.addComponent(title);
		setContent(mainLayout);
		navigator.navigateTo("employee");
	}

}
