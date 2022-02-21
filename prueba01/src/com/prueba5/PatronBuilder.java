package com.prueba5;

public class PatronBuilder {
	
	private String nombre, apellidos;
	private Integer edad;
	
	public PatronBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public PatronBuilder setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public PatronBuilder setApellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}
	
	public PatronBuilder setEdad(Integer edad) {
		this.edad = edad;
		return this;
	}
}
