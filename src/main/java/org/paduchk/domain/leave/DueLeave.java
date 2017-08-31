package org.paduchk.domain.leave;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.paduchk.domain.employee.Employee;

import lombok.Data;

@Entity
@Data
public class DueLeave {

	@Id
	Long id;
	Long amount;
	Date year;
	@ManyToOne
	Employee employee;

	public DueLeave() {
	}

	public DueLeave(Long id, Long amount, Date year, Employee employee) {
		super();
		this.id = id;
		this.amount = amount;
		this.year = year;
		this.employee = employee;
	}
	
	

}
