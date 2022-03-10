package com.sopra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sopra.employee.service.IEmployeeService;

@Controller
public class EmployeeManagementController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("employees", employeeService.findAll());
		return "employee-management";
	}
	
}
