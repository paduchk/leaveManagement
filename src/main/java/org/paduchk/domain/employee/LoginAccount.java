package org.paduchk.domain.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class LoginAccount {

	@Id
	@GeneratedValue
	Long id;
	String login;
	Boolean active;
	
}
