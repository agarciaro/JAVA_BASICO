package com.sopra.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.spring.annotation.LogueaTiempo;
import com.sopra.spring.model.Fabricante;
import com.sopra.spring.repository.FabricanteRepository;

@Service
public class FabricanteServiceImpl implements FabricanteService {
	
	@Autowired
	FabricanteRepository fabricanteRepository;
	
	@Override
	@LogueaTiempo(maxTiempo = 1000)
	public List<Fabricante> buscaTodos() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (List<Fabricante>) fabricanteRepository.findAll();
	}

	@Override
	@LogueaTiempo
	public Fabricante inserta(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return null;
	}

}
