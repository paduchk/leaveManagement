package org.paduchk.domain.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeeType {

	@Id
	@GeneratedValue
	Long id;
	String name;
	
	public EmployeeType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public EmployeeType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
