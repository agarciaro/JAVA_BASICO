package com.sopra.spring;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sopra.spring.model.Producto;
import com.sopra.spring.repository.ProductoRepository;
import com.sopra.spring.service.ProductoService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PruebaJdbcApplication {
	
	@Autowired
	ProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaJdbcApplication.class, args);
	}
	
	@PostConstruct
//	@Transactional(rollbackFor = Exception.class)
	public void init() throws Exception{
		productoService.ejecutaQueries();
		
//		Producto p = new Producto();
//		p.setNombre("Nuevo");
//		p.setPrecio(50.0);
//		p.setCodigoFabricante(3);
		
//		try {
//			ejecutaQueries();
//			throw new Exception();
//		}
//		catch (Exception e) {
//			throw e;
//		}finally {
//			log.info("PRODUCTOS\n{}", productoRepository.getAllProductos());
//		}
		
		
//		System.out.println(productoRepository.insertProducto(p));
		
		
		
//		List<Fabricante> fabricantes = fabricanteRepository.getAll();
//		for (Fabricante fabricante : fabricantes) {
//			log.info("FABRICANTE: {}", fabricante);
//		}
	}
	
}
