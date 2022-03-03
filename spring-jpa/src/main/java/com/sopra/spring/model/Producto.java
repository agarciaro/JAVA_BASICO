package com.sopra.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer codigo;
	@Column(nullable = false, length = 100)
	private String nombre;
	@Column(nullable = false, length = 17, scale = 2)
	private Double precio;
	
	@ManyToOne
	@Column(name="codigo_fabricante")
	private Fabricante codigoFabricante;
}
