package com.prueba5;

public class PersonaNoInmutable {
	
	private StringBuilder nombre;
	
	public PersonaNoInmutable(StringBuilder b) {
		this.nombre = b;
	}

	public StringBuilder getNombre() {
		return nombre;
	}
	

}
