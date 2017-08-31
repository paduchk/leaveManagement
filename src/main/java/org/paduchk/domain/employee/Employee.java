package org.paduchk.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	Long id;
	String firstName;
	String lastName;
	String email;
	Boolean acitve;
	
	public Employee(Long id, String firstName, String lastName, String email, Boolean acitve) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.acitve = acitve;
	}

	public Employee() {
		super();
	}
}
