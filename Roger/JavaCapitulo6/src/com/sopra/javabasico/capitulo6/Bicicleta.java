package com.sopra.javabasico.capitulo6;

public class Bicicleta {
	public String color;
	public int numeroMarchas;
	public int velocidad = 0;
	public int marcha = 1;
	public Luz luzDelantera;
	public Luz luzTrasera;
	
	public Bicicleta(String color, int numeroMarchas, int velocidad, int marcha, Luz luzDelantera, Luz luzTrasera) {
		super();
		this.color = color;
		this.numeroMarchas = numeroMarchas;
		this.velocidad = velocidad;
		this.marcha = marcha;
		this.luzDelantera = luzDelantera;
		this.luzTrasera = luzTrasera;
	}

	public void arrancar() {
		velocidad = 1;
	}
	
	public void acelerar() {
		velocidad++;
	}

	public void frenar() {
		velocidad--;
	}
	
	public void subirMarcha() {
		marcha++;
	}
	
	public void bajarMarcha() {
		marcha--;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public Luz getLuzDelantera() {
		return luzDelantera;
	}

	public void setLuzDelantera(Luz luzDelantera) {
		this.luzDelantera = luzDelantera;
	}

	public Luz getLuzTrasera() {
		return luzTrasera;
	}

	public void setLuzTrasera(Luz luzTrasera) {
		this.luzTrasera = luzTrasera;
	}
	
}
