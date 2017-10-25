package org.paduchk.ui.view;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class EmployeeDetailsViewDesign extends VerticalLayout {
	String firstName;
	String lastName;
	String email;
	ComboBox<Boolean> active;
	ComboBox<String> employeeType;
	public EmployeeDetailsViewDesign() {
		Design.read(this);
	}
}
