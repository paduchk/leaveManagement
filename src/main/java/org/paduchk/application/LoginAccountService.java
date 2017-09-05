package org.paduchk.application;

import org.paduchk.domain.employee.LoginAccount;
import org.paduchk.domain.employee.LoginAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginAccountService {
	
	@Autowired
	LoginAccountRepository loginAccountRepository;
	
	void saveLoginAccount(LoginAccount loginAccount ) {
		loginAccountRepository.save(loginAccount);
	}

}
