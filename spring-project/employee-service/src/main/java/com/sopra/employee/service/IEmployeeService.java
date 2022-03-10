package com.sopra.employee.service;

import com.sopra.model.employee.Employee;

public interface IEmployeeService {
	
	Employee findById(Long id);
	Employee insert(Employee employee);
	Employee update(Employee employee);

}