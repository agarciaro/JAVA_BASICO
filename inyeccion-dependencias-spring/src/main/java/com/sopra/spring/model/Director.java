package com.sopra.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component("director")
@Scope("prototype")
@Data
@NoArgsConstructor
public class Director extends Empleado {
	@Autowired
	private Direccion direccion;
		
//	@Autowired
	public Director(Direccion direccion) {
		this.direccion = direccion;
	}
	
//	@Autowired
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String getTarea() {
		return "Tarea del director";
	}
}
