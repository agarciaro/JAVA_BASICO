package com.sopra.javabasico.capitulo6;

public class Luz {
	
	EstadoLuz estado = EstadoLuz.APAGADA;
	Color color = Color.BLANCO;
	
	public void encenderApagar(EstadoLuz estadoLuz) {
		estado = estadoLuz;
	}
	
}
