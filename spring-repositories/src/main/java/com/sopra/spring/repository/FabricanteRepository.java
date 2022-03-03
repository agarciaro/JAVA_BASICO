package com.sopra.spring.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sopra.spring.model.Fabricante;

@Repository
public interface FabricanteRepository extends CrudRepository<Fabricante, Integer>{
	
	public List<Fabricante> findByNombreOrderByNombreDesc(String nombre);
	
	@Query("SELECT * FROM FABRICANTE WHERE LENGTH(nombre) > :size")
	public List<Fabricante> devuelveFabricantesCuyoLengthMayorQueElDado(@Param("size") Integer tamanyoNombre);
	
	@Query("SELECT f.nombre as nombre_fabricante, p.nombre as nombre_producto  FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante")
	public List<Map<String, Object>> felizCumpleGuille();
	
//	@Modifying -> Cuando la @Query va a realizar algún cambio en BD UPDATE, INSERT. DELETE
	
}
