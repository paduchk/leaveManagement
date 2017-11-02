package org.paduchk.ui.view;

import org.paduchk.domain.employee.Employee;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class EmployeesListViewDesign extends VerticalLayout {
	
	Grid<Employee> employeesList;
	Button addButton;
	Button editButton;
	Button removeButton;
	
	public EmployeesListViewDesign() {
		// TODO Auto-generated constructor stub
		Design.read(this);
	}
}
