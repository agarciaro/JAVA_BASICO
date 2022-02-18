package com.sopra.javabasico.capitulo5;

public class Persona {
	String nombre;
	String apellido1;
	String apellido2;
	String trigrama;
	
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		
		trigrama = String.valueOf(nombre.charAt(0)) + String.valueOf(apellido1.charAt(0)) + String.valueOf(apellido2.charAt(apellido2.length() - 1));
		trigrama.toUpperCase();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public String getNombreCompleto() {
		return nombre + " " + apellido1 + " " + apellido2;
	}
	
	public String getTrigrama() {
		return trigrama;
	}
	
	public boolean compareTrigrama(Persona persona) {
		return (this.getTrigrama() == persona.getTrigrama());
	}
}
