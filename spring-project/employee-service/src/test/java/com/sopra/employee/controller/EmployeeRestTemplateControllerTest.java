package com.sopra.employee.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.model.employee.Employee;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class EmployeeRestTemplateControllerTest {

	@LocalServerPort
	private int port;
	
	private String url;
	
	@Autowired
	TestRestTemplate restTemplate;
	
	@BeforeEach
	public void setUp() {
		url = String.format("http://localhost:%d/api/employees", port);
	}
	
	@Test
	public void whenCallRestEmployeesThenShouldReturnListOfEmployees() throws Exception {
		Employee[] employees = restTemplate.getForObject(url, Employee[].class);
		for (Employee employee : employees) {
			assertThat(employee.getEmail() != null);
		}
		assertThat(employees.length == 4);
	}
	
	
}
