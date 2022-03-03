package com.sopra.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sopra.spring.model.Fabricante;

@Repository
public class FabricanteRepository implements IFabricanteRepository {
	
	@Autowired
	NamedParameterJdbcTemplate namedJdbcTemplate;
	
	@Override
	public List<Fabricante> getAll(){
		String sql = "SELECT * FROM FABRICANTE";
		return namedJdbcTemplate.query(sql, new BeanPropertyRowMapper<Fabricante>(Fabricante.class));
	}
}
