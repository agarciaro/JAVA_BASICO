package com.prueba6;

import java.util.Random;

public class ReproductorMP3 implements ReproductorMusica {

	public ReproductorMP3() {
		ReproductorMusica.metodoEstatico();
	}

	@Override
	public void reproducir(Cancion cancion) {
		System.out.println("Cargando cancion en memoria");
		System.out.println("Reproduciendo musica");	
	}

	@Override
	public void expulsar() {
		System.out.println("Descargar cancion de memoria");
		
	}

	@Override
	public void avanzar(int segundos) {
		System.out.printf("Saltando %d segundos\n", segundos);
		
	}

	@Override
	public Cancion buscar(String titulo) {
		Random r = new Random();
		
		System.out.println("Buscando por título");
		return new Cancion(titulo, r.nextInt(601));
	}

	@Override
	public String getTipoReproductor() {
		return "MP3";
	}
	
}
