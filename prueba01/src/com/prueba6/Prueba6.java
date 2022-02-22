package com.prueba6;

public class Prueba6 {

	public static void main(String[] args) {
//		ReproductorDisco disco = new ReproductorDisco();//KAKA
//		ReproductorMP3 mp3 = new ReproductorMP3();//KAKA
//		
//		ReproductorMusica rDisco = new ReproductorDisco();
//		ReproductorMusica rMP3 = new ReproductorMP3();
		
		ReproductorMusica reproductor = ImplementacionManager.getReproductor();
		System.out.println(reproductor.getTipoReproductor());

//		ReproductorVideo video = new Reproduct
	}

}
