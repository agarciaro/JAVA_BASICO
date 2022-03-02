package com.sopra.spring.service;

import java.util.List;

import com.sopra.spring.model.Producto;

public interface IProductoService {

	List<Producto> getAllProductos();

	Producto getProductoByCodigo(Integer codigo);
	
	Producto insertProducto(Producto newProducto);
	
	Producto updateProducto(Producto producto);

}