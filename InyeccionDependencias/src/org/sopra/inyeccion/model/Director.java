package org.sopra.inyeccion.model;

public class Director extends Empleado {
	
	@Override
	public String getTarea() {
		return "Tarea del director";
	}
}
