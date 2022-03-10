package com.sopra.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.model.employee.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private List<Employee> employees = new ArrayList<>();
	
//	{
//		employees.add(new Employee(1L, "empleado1"));
//		employees.add(new Employee(2L, "empleado2"));
//		employees.add(new Employee(3L, "empleado3"));
//	}
//	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return employees;
	}
	
	
}
