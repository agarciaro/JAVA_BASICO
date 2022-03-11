package com.sopra.spring;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sopra.spring.model.entity.Fabricante;
import com.sopra.spring.service.MovidasService;

@SpringBootApplication
public class SpringJpaApplication {
	
	@Autowired
	MovidasService fabricanteService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		fabricanteService.ejecutaMovidas();
		
	}

}
