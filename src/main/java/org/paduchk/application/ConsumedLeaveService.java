package org.paduchk.application;

import org.paduchk.domain.leave.ConsumedLeave;
import org.paduchk.domain.leave.ConsumedLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumedLeaveService {

	@Autowired
	ConsumedLeaveRepository consumedLeaveRepository;
	
	void saveConsumedLeave(ConsumedLeave consumedLeave) {
		consumedLeaveRepository.save(consumedLeave);
	}
}
