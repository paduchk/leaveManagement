package org.paduchk.application;

import java.util.List;

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
	
	Employee getEmployee(Long employeeId) {
		return employeeRepository.findOne(employeeId);
	}
	
	List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	void setEmployeeActive(Employee employee, Boolean active) {
		employee.setAcitve(active);
		employeeRepository.save(employee);
	}
	
	
	
	void grantDueLeave(Employee employee) {
		return;
	}
}
