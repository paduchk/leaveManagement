package org.paduchk.application;

import org.paduchk.domain.employee.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleRepository {
	
	@Autowired
	RoleRepository roleRepository;
	
	void saveRole(Role role) {
		roleRepository.saveRole(role);
	}

}
