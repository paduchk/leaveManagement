package org.paduchk.domain.employee;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	@Override
	List<Employee> findAll();
	

}
