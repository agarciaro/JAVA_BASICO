package com.sopra.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.model.Persona;

@RestController
@RequestMapping("/api")
public class JSController {
	
	@GetMapping(path = "/persona", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Persona getPersona() {
		return new Persona("Aitor", 100);
	}
	
}
