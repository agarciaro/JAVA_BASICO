package com.prueba5;

public class Persona {

	private String nombre, apellidos;
	private int edad = 20;
	
	static {
		System.out.println(Persona.edadEstatica);
		Persona.edadEstatica = 40;
	}
	
	public static int edadEstatica = 20;

//	{
//		System.out.println(edad);
//		edad = 40;
//	}
	
	

	private Persona() {
		System.out.println("Constructor por defecto");
		System.out.println(edadEstatica);
		this.nombre = new String();
		this.apellidos = new String();
		this.edad = 50;
		Persona.edadEstatica = 50;
	}

	public Persona(String nombre) {
		this(nombre, "DESCONOCIDO");
		System.out.println("Constructor nombre");
	}

	public Persona(String nombre, String apellidos) {
		this();
		System.out.println("Constructor nombre apellidos");
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String nombre, int edad) {

	}

	public Persona(int edad, String nombre) {

	}

//	public Persona(String apellidos, int edad) {
//		
//	}

	public static Persona getInstance() {
		return new Persona();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
