package org.paduchk.domain.leave;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.paduchk.domain.employee.Employee;

import lombok.Data;

@Entity
@Data
public class ConsumedLeave {
	
	@Id
	Long id;
	Date date;
	@ManyToOne
	Employee employee;
	
	public ConsumedLeave( ) {
		
	}

}
