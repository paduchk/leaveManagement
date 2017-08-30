package org.paduchk.application;

import javax.annotation.PostConstruct;

import org.paduchk.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class StartupData {
	
	@PostConstruct
	public void init() {
		
		Employee emp1 = new Employee(1L, "Jan", "Nowak", "jan@nowak.pl", true);
		Employee emp2 = new Employee(2L, "John", "Rambo", "john@rambo.org" , true);
	}
}
