package org.paduchk.application;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.paduchk.domain.employee.Employee;
import org.paduchk.domain.employee.EmployeeType;
import org.paduchk.domain.leave.ConsumedLeave;
import org.paduchk.domain.leave.DueLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartupData {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeTypeService employeeTypeService;
	
	@Autowired
	LeaveService dueLeaveService;
	
	@Autowired
	ConsumedLeaveService consumedLeaveService;
	
	@PostConstruct
	public void init() {
		
		Employee emp1 = new Employee("Jan", "Nowak", "jan@nowak.pl", true);
		Employee emp2 = new Employee("John", "Rambo", "john@rambo.org" , true);
		Employee emp3 = new Employee("Janina", "Nowak", "john@rambo.org" , false);
		
		EmployeeType employeeType1 = new EmployeeType(1L,"admin");
		EmployeeType employeeType2 = new EmployeeType(2L,"user");
		employeeTypeService.saveEmployeeType(employeeType1);
		employeeTypeService.saveEmployeeType(employeeType2);
		
		
		emp1.setEmployeeType(employeeType1);
		emp2.setEmployeeType(employeeType2);
		emp3.setEmployeeType(employeeType2);
		
		employeeService.saveEmployee(emp1);
		employeeService.saveEmployee(emp2);
		employeeService.saveEmployee(emp3);
		emp1.setEmail("jan@nowak.org");
		employeeService.saveEmployee(emp1);
		
		DueLeave emp1DueLeve = new DueLeave( 26L, LocalDate.of(2017,1,1), emp1);
		DueLeave emp2DueLeve = new DueLeave( 26L, LocalDate.of(2017,1,1), emp2);
		DueLeave emp3DueLeve = new DueLeave( 26L, LocalDate.of(2017,1,1), emp3);
		dueLeaveService.saveDueLeave(emp1DueLeve);
		dueLeaveService.saveDueLeave(emp2DueLeve);
		dueLeaveService.saveDueLeave(emp3DueLeve);
		
		ConsumedLeave emp1ConsLeave1 = new ConsumedLeave(LocalDate.of(2017, 02, 01), emp1);
		ConsumedLeave emp1ConsLeave2 = new ConsumedLeave(LocalDate.of(2017, 02, 02), emp1);
		ConsumedLeave emp1ConsLeave3 = new ConsumedLeave(LocalDate.of(2017, 02, 03), emp1);
		consumedLeaveService.saveConsumedLeave(emp1ConsLeave1);
		consumedLeaveService.saveConsumedLeave(emp1ConsLeave2);
		consumedLeaveService.saveConsumedLeave(emp1ConsLeave3);
		

		
		
		
		
		
		
		
		
	}
}
