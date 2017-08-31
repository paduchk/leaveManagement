package org.paduchk.application;

import org.paduchk.domain.leave.DueLeave;
import org.paduchk.domain.leave.DueLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DueLeaveService {

	@Autowired
	DueLeaveRepository dueLeaveRepository;
	
	void saveDueLeave(DueLeave dueLeave) {
		dueLeaveRepository.save(dueLeave);
	}
}
