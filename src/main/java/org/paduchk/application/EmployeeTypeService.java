package org.paduchk.application;

import org.paduchk.domain.employee.EmployeeType;
import org.paduchk.domain.employee.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTypeService {

	@Autowired
	EmployeeTypeRepository employeeTypeRepository;
	
	void saveEmployeeType(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}
}
