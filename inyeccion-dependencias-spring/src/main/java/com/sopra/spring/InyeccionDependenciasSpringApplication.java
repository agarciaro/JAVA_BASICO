package com.sopra.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sopra.spring.model.Director;
import com.sopra.spring.model.Empleado;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class InyeccionDependenciasSpringApplication {
	
	@Autowired
	@Qualifier("jefe")
	Empleado empleado1;
	
	@Autowired
//	@Qualifier("directorBean")
	Director empleado2;
	
	@Value("${sopra.nombre-instancia:director}")
	String nombreBean;
	
	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(InyeccionDependenciasSpringApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		log.info("INIT");
//		log.error("Ha ocurrido un error");
		
//		log.info(empleado1.toString());
//		log.info(empleado2.toString());
		
		log.info("TIPO BEAN: {}", nombreBean);
		Empleado e = (Empleado)context.getBean(nombreBean);
		log.info("Bean: {}", e);
	}

}
