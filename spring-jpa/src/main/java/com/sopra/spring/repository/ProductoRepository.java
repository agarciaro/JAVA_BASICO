package com.sopra.spring.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.spring.model.entity.Producto;

@Repository
public class ProductoRepository implements IProductoRepository {
	
	@Autowired
	EntityManager em;
	
	@Override
	public Producto inserta(Producto p) {
		em.persist(p);
		return p;
	}

	@Override
	public boolean elimina(Producto p) {
		throw new RuntimeException("Método no implementado");
		// TODO Auto-generated method stub
//		return false;
	}
	
}
