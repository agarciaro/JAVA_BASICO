package com.sopra.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sopra.spring.model.Producto;

@Repository
public class ProductoRepository implements IProductoRepository {
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Producto> getAllProductos(){
		String sql = "SELECT codigo, nombre, precio, codigo_fabricante FROM PRODUCTO";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Producto>(Producto.class));
		return jdbcTemplate.query(sql, new RowMapper<Producto>() {

			@Override
			public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
				Producto p = new Producto();
				p.setCodigo(rs.getInt("codigo"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				p.setCodigoFabricante(rs.getInt("codigo_fabricante"));
				return p;
			}
		});
	}
	
	@Override
	public Producto getProductoByCodigo(Integer codigo) {
		String sql = "SELECT codigo, nombre, precio, codigo_fabricante FROM PRODUCTO WHERE codigo = :mi_codigo";
		Map<String, Object> params = new HashMap<>();
		params.put("mi_codigo", codigo);
		
		return jdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<Producto>(Producto.class));
	}
	
	@Override
	public List<Producto> getProductosByNombre(String patron){
//		patron = "%" + patron + "%";
		String sql = "SELECT codigo, nombre, precio, codigo_fabricante FROM PRODUCTO WHERE nombre LIKE :patron";
		Map<String, Object> params = new HashMap<>();
		params.put("patron", "%" + patron + "%");
		return jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<Producto>(Producto.class));
	}

	@Override
	public Producto insertProducto(Producto newProducto) {
		String sql = "INSERT INTO PRODUCTO (nombre, precio, codigo_fabricante) VALUES (:nombre, :precio, :codigoFabricante)";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(sql, new BeanPropertySqlParameterSource(newProducto), keyHolder);
		return getProductoByCodigo(keyHolder.getKey().intValue());
	}

	@Override
	public Producto updateProducto(Producto producto) {
		String sql = "UPDATE PRODUCTO SET nombre = :nombre, precio = :precio, codigo_fabricante = :codigoFabricante WHERE codigo = :codigo";
		jdbcTemplate.update(sql, new BeanPropertySqlParameterSource(producto));
		return getProductoByCodigo(producto.getCodigo());
	}
	
}
