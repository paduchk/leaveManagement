package org.paduchk.tools;

import org.paduchk.domain.employee.EmployeeType;
import org.paduchk.domain.employee.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;

public class StringEmployeeTypeConverter implements Converter<String, EmployeeType> {
	
	EmployeeTypeRepository employeeTypeRepository;

	@Autowired
	public StringEmployeeTypeConverter(EmployeeTypeRepository employeeTypeRepository) {
		super();
		this.employeeTypeRepository = employeeTypeRepository;
	}

	@Override
	public Result<EmployeeType> convertToModel(String value, ValueContext context) {
		// TODO Auto-generated method stub
		return Result.ok(employeeTypeRepository.findByName(value));
	}

	@Override
	public String convertToPresentation(EmployeeType value, ValueContext context) {
		// TODO Auto-generated method stub
		if ( null == value) {
			return "";
		} else {
			return value.getName();
		}
	}

}
