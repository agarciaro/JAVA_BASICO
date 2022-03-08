package com.sopra.spring.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import com.sopra.spring.model.FabricanteDto;
import com.sopra.spring.model.entity.Fabricante;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class FabricanteRepository implements IFabricanteRepository {
	
	@Autowired
	EntityManager em;
	
	@Override
	public FabricanteDto inserta(FabricanteDto f) {
		Fabricante entity = new Fabricante();
		BeanUtils.copyProperties(f, entity);
		em.persist(entity);
		BeanUtils.copyProperties(entity, f);
		return f;
	}

	@Override
	public boolean elimina(FabricanteDto f) {
		try {
			em.remove(f);
		} catch (Exception e) {
			log.error("Error al eliminar Fabricante:{}", e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public FabricanteDto actualiza(FabricanteDto f) {
		return em.merge(f);
	}

}
