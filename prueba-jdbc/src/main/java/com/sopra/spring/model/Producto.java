package com.sopra.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Integer codigoFabricante;
	
}
