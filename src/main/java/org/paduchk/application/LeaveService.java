package org.paduchk.application;

import org.paduchk.domain.leave.ConsumedLeave;
import org.paduchk.domain.leave.ConsumedLeaveRepository;
import org.paduchk.domain.leave.DueLeave;
import org.paduchk.domain.leave.DueLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeaveService {

	@Autowired
	DueLeaveRepository dueLeaveRepository;
	
	@Autowired
	ConsumedLeaveRepository consumedLeaveRepository;	
	
	void saveDueLeave(DueLeave dueLeave) {
		dueLeaveRepository.save(dueLeave);
	}
	
	void saveConsumedLeave(ConsumedLeave consumedLeave) {
		consumedLeaveRepository.save(consumedLeave);
	}	
	

}
