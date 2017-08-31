package org.paduchk.application;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.paduchk.domain.employee.Employee;
import org.paduchk.domain.leave.DueLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartupData {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DueLeaveService dueLeaveService;

	
	@PostConstruct
	public void init() {
		
		Employee emp1 = new Employee(1L, "Jan", "Nowak", "jan@nowak.pl", true);
		Employee emp2 = new Employee(2L, "John", "Rambo", "john@rambo.org" , true);
		Employee emp3 = new Employee(3L, "Janina", "Nowak", "john@rambo.org" , false);
		employeeService.saveEmployee(emp1);
		employeeService.saveEmployee(emp2);
		employeeService.saveEmployee(emp3);
		
		DueLeave emp1DueLeve = new DueLeave(1L, 26L, new Date(2017,1,1), emp1);
		DueLeave emp2DueLeve = new DueLeave(2L, 26L, new Date(2017,1,1), emp2);
		DueLeave emp3DueLeve = new DueLeave(3L, 26L, new Date(2017,1,1), emp3);
		dueLeaveService.saveDueLeave(emp1DueLeve);
		dueLeaveService.saveDueLeave(emp2DueLeve);
		dueLeaveService.saveDueLeave(emp3DueLeve);

	}
}
