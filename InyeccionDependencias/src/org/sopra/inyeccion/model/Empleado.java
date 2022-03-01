package org.sopra.inyeccion.model;

public class Empleado implements IEmpleado{
	protected String nombre;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getTarea() {
		return "Tarea del empleado";
	}

	@Override
	public IEmpleado getInstancia() {
		return this;
	}
	
}
