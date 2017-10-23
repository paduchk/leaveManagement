package org.paduchk.application;

import java.time.LocalDate;
import java.util.List;

import org.paduchk.domain.employee.Employee;
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
	
	void saveConsumedLeaves(List<ConsumedLeave> consumedLeaves) {
		for(ConsumedLeave leave:consumedLeaves ) {
			consumedLeaveRepository.save(leave);
		}
		return;
	}

	List<ConsumedLeave> getEmployeeConsumedLeaves(Employee employee) {
		return consumedLeaveRepository.findByEmployee(employee);
	}
	
	int getEmployeeConsumedLeavesCount(Employee employee) {
		return getEmployeeConsumedLeaves(employee).size();
	}
	
	int getEmployeeDueLeaveCount(Employee employee, LocalDate year) {
		DueLeave dueLeave =  dueLeaveRepository.findByEmployeeAndYear(employee, year);
		return dueLeave.getAmount().intValue();
	}
}
