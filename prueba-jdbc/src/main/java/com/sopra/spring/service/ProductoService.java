package com.sopra.spring.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.spring.model.Producto;
import com.sopra.spring.repository.IProductoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional(rollbackFor = SQLException.class)
@Slf4j
public class ProductoService implements IProductoService{
	
	@Autowired
	IProductoRepository productoRepository;
	
	public void ejecutaQueries() {
		Producto p = productoRepository.getProductoByCodigo(12);
		p.setNombre("Nuevo" + new Random().nextInt(1000));
		log.info("Producto actualizado: {}", productoRepository.updateProducto(p));
		p.setCodigoFabricante(13);
		log.info("Producto actualizado: {}", productoRepository.updateProducto(p));
	}
	
	@Override
	public List<Producto> getAllProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getProductoByCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto insertProducto(Producto newProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
