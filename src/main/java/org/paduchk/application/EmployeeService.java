package org.paduchk.application;

import org.paduchk.domain.employee.Employee;
import org.paduchk.domain.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	void grantDueLeave(Employee employee) {
		return;
	}
}
