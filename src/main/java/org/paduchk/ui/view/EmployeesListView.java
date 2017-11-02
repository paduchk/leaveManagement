package org.paduchk.ui.view;

import org.paduchk.domain.employee.Employee;
import org.paduchk.domain.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;

@SpringView(name = EmployeesListView.VIEW_NAME)
public class EmployeesListView extends EmployeesListViewDesign implements View {
	
	public static final String VIEW_NAME = "employees-list";
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		employeesList.setItems(employeeRepository.findAll());
	}

}
