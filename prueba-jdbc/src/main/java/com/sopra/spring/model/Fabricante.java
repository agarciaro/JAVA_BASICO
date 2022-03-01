package com.sopra.spring.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fabricante implements Serializable{
	private Integer codigo;
	private String nombre;
}
