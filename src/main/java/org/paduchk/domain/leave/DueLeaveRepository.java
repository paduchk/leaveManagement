package org.paduchk.domain.leave;

import java.time.LocalDate;

import org.paduchk.domain.employee.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DueLeaveRepository extends PagingAndSortingRepository<DueLeave, Long> {
	DueLeave findByEmployeeAndYear(Employee employee, LocalDate year);

}
