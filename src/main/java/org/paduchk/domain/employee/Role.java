package org.paduchk.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {

	@Id
	Long id;
	String name;
}
