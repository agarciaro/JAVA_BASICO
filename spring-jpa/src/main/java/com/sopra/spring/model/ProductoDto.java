package com.sopra.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
	

	private Integer codigo;
	private String nombre;
	private Double precio;
	
	private FabricanteDto fabricante;
}
