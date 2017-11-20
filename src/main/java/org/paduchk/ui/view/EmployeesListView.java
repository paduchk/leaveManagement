package org.paduchk.ui.view;

import org.paduchk.domain.employee.Employee;
import org.paduchk.domain.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.data.ValueProvider;
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
	
	public EmployeesListView() {
		// TODO Auto-generated constructor stub
		//employeesList.setSizeFull();
		//this.setExpandRatio(employeesList, 1);
		//this.setSizeFull();
		//this.setWidth("100%");
		
		//changing existing column valueprovider
/*		
		String colName = employeesList.getColumn("employeeType").getCaption();
		employeesList.removeColumn("employeeType");
		employeesList.addColumn(new ValueProvider<Employee, String>() {

			@Override
			public String apply(Employee source) {
				// TODO Auto-generated method stub
				return source.getEmployeeType().getName();
			}
		}).setId("employeeType").setCaption(colName);
*/
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		employeesList.setItems(employeeRepository.findAll());
	}

}
