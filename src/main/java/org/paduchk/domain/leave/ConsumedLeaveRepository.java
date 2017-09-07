package org.paduchk.domain.leave;


import java.util.List;

import org.paduchk.domain.employee.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConsumedLeaveRepository extends PagingAndSortingRepository<ConsumedLeave, Long> {
	List<ConsumedLeave> findByEmployee(Employee employee);
}
