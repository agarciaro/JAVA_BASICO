package com.sopra.javabasico.capitulo6;

import java.util.ArrayList;
import java.util.List;

public class Ciclista {
	private String nombre;
	private String ciudad;
	private String calle;
	private int numero;
	private boolean usaCasco;
	
	List<Bicicleta> listaBicis = new ArrayList<Bicicleta>();
	
	public static void main(String[] args) {
		// crear un objeto ciclista1
		Ciclista ciclista1 = new Ciclista("Ana", "Almeria", "Real", 35, true);
		
		//creamos objetos luz
		Luz luz1 = new Luz("rojo", true, 75);
		Luz luz2 = new Luz("azul", false, 75);
		
		
		//le añadimos las bicis que tiene Ana
		ciclista1.listaBicis.add(new Bicicleta("rojo", 3, 10.5, 2, new Luz("naranja", false, 100), new Luz("negro", false, 80)));
		ciclista1.listaBicis.add(new Bicicleta("azul", 3, 10.5, 2, luz1, luz2));
		ciclista1.listaBicis.add(new Bicicleta("amarillo", 3, 10.5, 2, luz1, luz2));
		ciclista1.listaBicis.add(new Bicicleta("negro", 3, 10.5, 2, luz1, luz2));
		
		
		//llamamos la lista en la pos1 llamamos el metodo turnof de bicicleta 
		ciclista1.listaBicis.get(0).enecenderApagarLuces(ciclista1.listaBicis.get(0).luzDelantera.isEstado(), ciclista1.listaBicis.get(0).luzTrasera.isEstado());
		ciclista1.listaBicis.get(0).arrancar();
		ciclista1.listaBicis.get(0).acelerar();
		ciclista1.listaBicis.get(0).marcha(true);
	}
	
	public Ciclista(String nombre, String ciudad, String calle, int numero, boolean usaCasco) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.usaCasco = usaCasco ;
	}
	
	public void comprarVender () {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isUsaCasco() {
		return usaCasco;
	}

	public void setUsaCasco(boolean usaCasco) {
		this.usaCasco = usaCasco;
	}

	public List<Bicicleta> getList() {
		return listaBicis;
	}

	public void setList(List<Bicicleta> list) {
		this.listaBicis = list;
	}

	
	
	
}
