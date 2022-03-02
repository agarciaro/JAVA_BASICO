package com.sopra.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.spring.model.Fabricante;
import com.sopra.spring.repository.FabricanteRepository;

@Service
public class FabricanteServiceImpl implements FabricanteService {
	
	@Autowired
	FabricanteRepository fabricanteRepository;
	
	@Override
	public List<Fabricante> buscaTodos() {
		return (List<Fabricante>) fabricanteRepository.findAll();
	}

	@Override
	public Fabricante inserta(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return null;
	}

}
