package com.sopra.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.model.Fabricante;
import com.sopra.spring.repository.FabricanteRepository;
import com.sopra.spring.service.FabricanteService;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteService fabricanteService;
	
	@GetMapping("/fabricante")
	public List<Fabricante> findAll(){
		return fabricanteService.buscaTodos();
	}
	
}
