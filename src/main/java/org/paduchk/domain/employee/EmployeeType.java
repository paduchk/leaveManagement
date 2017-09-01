package org.paduchk.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeeType {

	@Id
	Long id;
	String name;
	
}
