package com.sopra.spring.repository;

import com.sopra.spring.model.entity.Producto;

public interface IProductoRepository {
	
	public Producto inserta(Producto p);
	public boolean elimina(Producto p);
	
}
