package com.sopra.spring;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class InyeccionDependenciasSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InyeccionDependenciasSpringApplication.class, args);
	}
	
	@PostConstruct
	public void init(){
		log.info("INIT");
		log.error("Ha ocurrido un error");
		
	}

}
