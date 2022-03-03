package com.sopra.spring.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sopra.spring.model.Director;
import com.sopra.spring.model.Jefe;

@Configuration
public class BeansConfiguration {
	
	@Bean("jefe")
	@Scope("prototype")
	public Jefe creaJefe() {
		Random random = new Random();
		Jefe jefe = new Jefe();
		jefe.setNombre("JEFE");
		jefe.setEdad(random.nextInt(100));
		return jefe;
	}
	
	@Bean("jefe2")
	@Scope("prototype")
	public Jefe creaJefe2() {
		Random random = new Random();
		Jefe jefe = new Jefe();
		jefe.setNombre("JEFE");
		jefe.setEdad(random.nextInt(100));
		return jefe;
	}
	
//	@Bean("directorBean")
//	public Director creaDirector() {
//		Random random = new Random();
//		Director director = new Director();
//		director.setNombre("DIRECTOR");
//		director.setEdad(random.nextInt(100));
//		return director;
//	}
	
}
