package com.sopra.employee.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sopra.employee.service.EmployeeService;
import com.sopra.model.employee.Employee;

@ExtendWith(MockitoExtension.class)
public class EmployeeRestMockControllerTest {
	
	@Mock
	private EmployeeService employeeService;
	
	@InjectMocks
	private EmployeeRestController employeeController;
	
	@Test
	public void whenCallRestEmployeeByIdThenShouldReturnEmployee() throws Exception {
		
		when(employeeService.findById(3L))
		.thenReturn(new Employee(3L, "pepe", "perez", "pepe@hotmail.com", null, null, null));
		
		Employee response = employeeController.findEmployeeById(3L);
		assertThat(response.getName()).isEqualTo("pepe");
//		mockMvc.perform(get("/api/employees/1"))
			
	}
	
}
