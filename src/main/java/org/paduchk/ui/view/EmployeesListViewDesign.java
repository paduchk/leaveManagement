package org.paduchk.ui.view;

import org.paduchk.domain.employee.Employee;
import org.paduchk.tools.Subtitles;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.data.ValueProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import lombok.Data;

@DesignRoot
public class EmployeesListViewDesign extends VerticalLayout {
	
	Grid<Employee> employeesList;	
	Button addButton;
	Button editButton;
	Button removeButton;
	
	public EmployeesListViewDesign(Subtitles subtitles) {
		Design.read(this);
		
		employeesList.addColumn(new ValueProvider<Employee, String>() {
			@Override
			public String apply(Employee source) {
				return source.getEmployeeType().getName();
			}
		}).setId("employeeType").setCaption(subtitles.getEmployeeTypeCaption());

		employeesList.setColumns("firstName","lastName","email","active","employeeType");
		
		employeesList.getColumn("firstName").setCaption(subtitles.getFirstNameCaption());		
		employeesList.getColumn("lastName").setCaption(subtitles.getLastNameCaption());		
		employeesList.getColumn("active").setCaption(subtitles.getActiveCaption());
		employeesList.getColumn("email").setCaption(subtitles.getEmailCaption());
		
		addButton.setCaption(subtitles.getAddButtonCaption());
		editButton.setCaption(subtitles.getEditButtonCaption());
		removeButton.setCaption(subtitles.getRemoveButtonCaption());	
	}	
}
