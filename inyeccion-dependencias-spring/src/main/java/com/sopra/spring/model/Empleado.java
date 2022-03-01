package com.sopra.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Empleado implements ITarea{
	
	private String nombre;
	private Integer edad;
	
	@Override
	public String getTarea() {
		return "Tarea del empleado";
	}
	
}
