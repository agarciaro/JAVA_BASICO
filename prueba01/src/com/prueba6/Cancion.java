package com.prueba6;

public class Cancion {
	
	private String titulo = "UNKNOWN";
	private long duracion; //En segundos
	
	public Cancion() {}

	public Cancion(String titulo, long duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	

}
