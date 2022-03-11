package com.sopra.employee.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void whenCallRestEmployeeByIdThenShouldReturnEmployee() throws Exception {
		mockMvc.perform(get("/api/employees/1"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.id", is(1)))
			.andExpect(jsonPath("$.email", is(notNullValue())));
	}
	
	@Test
	@Transactional
	public void whenInsertFreelanceThenReturn_200() throws Exception {
		String freelanceJson = "{"
				+ "    \"name\": \"hdher\","
				+ "    \"lastName\": \"García\","
				+ "    \"email\": \"test@hotmail.com\","
				+ "    \"priceHour\": 14"
				+ "}";
		
		mockMvc.perform(post("/api/employees/freelance")
				.content(freelanceJson)
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
		;
				
	}
	
}
