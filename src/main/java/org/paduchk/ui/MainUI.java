package org.paduchk.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		Label title = new Label("Leave Managenent");
		setContent(title);

	}

}
