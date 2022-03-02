package com.sopra.spring.repository;

import java.util.List;

import com.sopra.spring.model.Producto;

public interface IProductoRepository {

	List<Producto> getAllProductos();

	Producto getProductoByCodigo(Integer codigo);

	List<Producto> getProductosByNombre(String patron);
	
	Producto insertProducto(Producto newProducto);
	
	Producto updateProducto(Producto producto);

}