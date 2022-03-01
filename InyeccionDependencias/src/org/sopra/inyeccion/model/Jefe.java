package org.sopra.inyeccion.model;

public class Jefe extends Empleado{
	
	@Override
	public String getTarea() {
		return "Tarea del jefe";
	}

	@Override
	public IEmpleado getInstancia() {
		return new Jefe();
	}
	
}
