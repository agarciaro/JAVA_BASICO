package com.prueba6;

public interface ReproductorMusica {
	
	public void reproducir(Cancion cancion);
	public void expulsar();
	public void avanzar(int segundos);
	public Cancion buscar(String titulo);
	
	public String getTipoReproductor();
	
	public static void metodoEstatico() {
		System.out.println("Metodo estático de Reproductor Musica");
	}
	
}
