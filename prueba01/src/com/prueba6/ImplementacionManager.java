package com.prueba6;

public class ImplementacionManager {
	public static ReproductorMusica getReproductor() {
		return new ReproductorMP3();
	}
}
