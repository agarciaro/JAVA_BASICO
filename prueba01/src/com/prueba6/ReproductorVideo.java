package com.prueba6;

public interface ReproductorVideo extends ReproductorMusica {
	
	public static final int MAX_PULGADAS = 100;
	
	public default int modificarBrillo(int lms){
		//En lumens
		return lms *10;
	}
	
//	public int modificarBrillo(int lms);
	
}
