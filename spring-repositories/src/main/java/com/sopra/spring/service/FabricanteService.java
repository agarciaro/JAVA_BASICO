package com.sopra.spring.service;

import java.util.List;

import com.sopra.spring.model.Fabricante;

public interface FabricanteService {
	
	public List<Fabricante> buscaTodos();
	public Fabricante inserta(Fabricante fabricante);
	
}
