package com.sopra.javabasico.capitulo6;

public class Luz {
	public String color;
	public boolean estado;
	public int nivelDeBateria;
	
	public Luz(String color, boolean estado, int nivelDeBateria) {
		super();
		this.color = color;
		this.estado = estado;
		this.nivelDeBateria = nivelDeBateria;
	}

	public void encenderLuz() {
		estado = true;
	}
	
	public void apagarLuz() {
		estado = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getNivelDeBateria() {
		return nivelDeBateria;
	}

	public void setNivelDeBateria(int nivelDeBateria) {
		this.nivelDeBateria = nivelDeBateria;
	}
	
}
