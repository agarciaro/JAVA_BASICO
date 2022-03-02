package com.sopra.spring;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringRepositoriesApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRepositoriesApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
	}

}
