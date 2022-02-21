package com.prueba5;

public class Prueba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona c1 = Persona.getInstance();
//		c1.setNombre("nombre");
//		c1.setApellidos("apellido");
//		System.out.println(Persona.edadEstatica);
		
//		Persona p2 = new Persona("Aitor");
//		
//		System.out.println(Persona.getInstance().getNombre());
		
//		PersonaNoInmutable pni = new PersonaNoInmutable(new StringBuilder("Aitor"));
//		System.out.println(pni.getNombre().toString());
//		pni.getNombre().append(" García");
//		System.out.println(pni.getNombre().toString());
		
		PatronSingleton singleton = PatronSingleton.getInstance();
		PatronSingleton singleton2 = PatronSingleton.getInstance(0);
		PatronSingleton singleton3 = PatronSingleton.getInstance(1);
		
		System.out.println(singleton);
		System.out.println(singleton2);
		System.out.println(singleton3);
		
		singleton.setNombre("Pepe");
		System.out.println(singleton.getNombre());
		System.out.println(singleton2.getNombre());
		System.out.println(singleton3.getNombre());
		
		PatronBuilder p = new PatronBuilder()
							.setNombre("Aitor")
							.setEdad(8)
							.setApellidos("Garcia");
	}

}
