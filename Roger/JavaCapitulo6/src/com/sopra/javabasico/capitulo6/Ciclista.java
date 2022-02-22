package com.sopra.javabasico.capitulo6;

import java.util.*;

public class Ciclista {

	public String nombre;
	public String ciudad;
	public String calle;
	public int numero;
	public boolean usaCasco;
	public List<Bicicleta> listaBicicletas = new ArrayList<Bicicleta>();
	
	public static void main(String[] args) {
		
	}

	public Ciclista(String nombre, String ciudad, String calle, int numero, boolean usaCasco,
			List<Bicicleta> listaBicicletas) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.usaCasco = usaCasco;
		this.listaBicicletas = listaBicicletas;
	}

	public void encenderLuz(Bicicleta bicicleta) {
		bicicleta.getLuzDelantera().encenderLuz();
		bicicleta.getLuzTrasera().encenderLuz();
	}
	
	public void apagarLuz(Bicicleta bicicleta) {
		bicicleta.getLuzDelantera().apagarLuz();
		bicicleta.getLuzTrasera().apagarLuz();
	}
	
	public void comprarBicicleta(Bicicleta bicicleta) {
		getListaBicicletas().add(bicicleta);
	}
	
	public void venderBicicleta(Bicicleta bicicleta) {
		getListaBicicletas().remove(bicicleta);
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

	public List<Bicicleta> getListaBicicletas() {
		return listaBicicletas;
	}

	public void setListaBicicletas(List<Bicicleta> listaBicicletas) {
		this.listaBicicletas = listaBicicletas;
	}

}
