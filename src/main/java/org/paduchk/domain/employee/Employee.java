package org.paduchk.domain.employee;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;
import org.paduchk.domain.leave.ConsumedLeave;
import org.paduchk.domain.leave.DueLeave;

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
//	@OneToMany(mappedBy="employee")
//	List<DueLeave> dueLeaves;
//	@OneToMany(mappedBy="employee")
//	List<ConsumedLeave> consumedLeaves;
	@ManyToOne
	EmployeeType employeeType;
//	@OneToOne
//	@JoinColumn(name="ID")
//	LoginAccount loginAccount;
	
	
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
