package com.wuncid.nosqltest.repository;

import com.wuncid.nosqltest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
