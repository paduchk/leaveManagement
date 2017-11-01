package org.paduchk.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name=EmployeeDetailsView.VIEW_NAME)
public class EmployeeDetailsView extends EmployeeDetailsViewDesign implements View {

	public static final String VIEW_NAME = "employee-details";
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
