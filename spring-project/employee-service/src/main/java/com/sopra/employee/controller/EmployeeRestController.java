package com.sopra.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.employee.service.IEmployeeService;
import com.sopra.model.employee.Employee;
import com.sopra.model.employee.Freelance;
import com.sopra.model.employee.Internal;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public Employee findEmployeeById(@PathVariable Long id){
		return employeeService.findById(id);
	}
	
	@PostMapping("/employees/freelance")
	public Freelance insertFreelance(@Valid @RequestBody Freelance freelance) {
		return (Freelance) employeeService.insert(freelance);
	}
	
	@PostMapping("/employees/internal")
	public Internal insertInternal(@Valid @RequestBody Internal internal) {
		return (Internal) employeeService.insert(internal);
	}
}
