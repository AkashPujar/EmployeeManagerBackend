package com.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
