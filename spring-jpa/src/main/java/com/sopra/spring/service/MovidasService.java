package com.sopra.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.spring.model.FabricanteDto;
import com.sopra.spring.repository.IFabricanteRepository;
import com.sopra.spring.repository.IProductoRepository;

@Service
public class MovidasService {
	
	@Autowired
	IFabricanteRepository fabricanteRepository;
	
	@Autowired
	IProductoRepository productoRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void ejecutaMovidas() {
		FabricanteDto f1 = new FabricanteDto();
		f1.setNombre("f1");
		FabricanteDto f2 = new FabricanteDto();
		f2.setNombre("f2");
		FabricanteDto f3 = new FabricanteDto();
		f3.setNombre("f3");
		
		fabricanteRepository.inserta(f1);
		fabricanteRepository.inserta(f2);
		
		fabricanteRepository.inserta(f3);
//		f1.setNombre("F1");
//		em.persist(f2);
//		em.persist(f3);
//		em.flush();
//		em.detach(f1);
		
//		Producto p1 = new Producto();
//		p1.setNombre("p1");
//		p1.setPrecio(20.9);
//		p1.setFabricante(f1);
//		productoRepository.inserta(p1);
//		
//		Producto p2 = new Producto();
//		p2.setNombre("p2");
//		p2.setPrecio(20.9);
//		p2.setFabricante(f2);
//		productoRepository.inserta(p2);
////		em.persist(f3);
//		f1.setNombre("F1");
		
	}
	
}
