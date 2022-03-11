package com.sopra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.model.employee.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
