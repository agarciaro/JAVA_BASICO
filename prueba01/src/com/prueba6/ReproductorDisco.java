package com.prueba6;

public class ReproductorDisco implements ReproductorMusica {

	public ReproductorDisco() {

	}

	@Override
	public void reproducir(Cancion cancion) {
		System.out.println("Girando plato");
		System.out.println("Situando aguja en disco");
		System.out.println("Reproduciendo musica");
		
	}

	@Override
	public void expulsar() {
		System.out.println("Retirando aguja de disco");
		System.out.println("Retirar disco");
		System.out.println("Parar plato");
		
	}

	@Override
	public void avanzar(int segundos) {
		System.out.println("Aumentar RPMs");
		
	}

	@Override
	public Cancion buscar(String titulo) {
		System.out.println("Buscando disco y corte");
		return new Cancion(titulo, -1);
	}

	@Override
	public String getTipoReproductor() {
		return "DISCO";
	}
	
}
