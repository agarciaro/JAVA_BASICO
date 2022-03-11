package com.sopra.spring.repository;

import com.sopra.spring.model.FabricanteDto;
import com.sopra.spring.model.entity.Fabricante;

public interface IFabricanteRepository {
	
	public FabricanteDto inserta(FabricanteDto f);
	public boolean elimina(FabricanteDto f);
	public FabricanteDto actualiza(FabricanteDto f);
	
}
