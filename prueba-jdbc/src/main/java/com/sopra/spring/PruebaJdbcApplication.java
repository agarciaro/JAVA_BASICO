package com.sopra.spring;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sopra.spring.model.Fabricante;
import com.sopra.spring.repository.FabricanteRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PruebaJdbcApplication {
	
	@Autowired
	FabricanteRepository fabricanteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaJdbcApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Fabricante> fabricantes = fabricanteRepository.getAll();
		for (Fabricante fabricante : fabricantes) {
			log.info("FABRICANTE: {}", fabricante);
		}
	}
}
