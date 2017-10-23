package org.paduchk.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView
public class EmployeeDetailsView extends EmployeeDetailsViewDesign implements View {

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		View.super.enter(event);
	}

}
