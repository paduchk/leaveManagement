package org.paduchk.domain.leave;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.paduchk.domain.employee.Employee;

import lombok.Data;

@Entity
@Data
public class DueLeave {

	@Id
	@GeneratedValue
	Long id;
	Long amount;
	LocalDate year;
	@ManyToOne
	Employee employee;

	public DueLeave() {
	}

	public DueLeave( Long amount, LocalDate year, Employee employee) {
		super();
		this.amount = amount;
		this.year = year;
		this.employee = employee;
	}
	
	

}
