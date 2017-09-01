package org.paduchk.domain.leave;

import java.time.LocalDate;

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
	LocalDate date;
	@ManyToOne
	Employee employee;
	
	public ConsumedLeave( ) {
		
	}

	public ConsumedLeave(Long id, LocalDate date, Employee employee) {
		super();
		this.id = id;
		this.date = date;
		this.employee = employee;
	}

}