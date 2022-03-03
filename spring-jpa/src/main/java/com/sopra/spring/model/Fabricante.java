package com.sopra.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer codigo;
	@Column(nullable = false, length = 100)
	private String nombre;
	
}
