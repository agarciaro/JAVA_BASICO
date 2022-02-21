package com.sopra.javabasico.capitulo6;

public class Luz {
	private String color;
	private boolean estado;
	private int nivelBateria;
	
	
	
	public Luz(String color, boolean estado, int nivelBateria) {
		this.color = color;
		this.estado = estado;
		this.nivelBateria = nivelBateria;
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



	public int getNivelBateria() {
		return nivelBateria;
	}



	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
}
