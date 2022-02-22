package com.sopra.javabasico.capitulo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bicicleta {
	
	private static List<Bicicleta> bicicletas = new ArrayList<>();
	
	static {
		bicicletas.add(new Bicicleta());
		bicicletas.add(new Bicicleta());
		bicicletas.add(new Bicicleta());
		bicicletas.add(new Bicicleta());
		bicicletas.add(new Bicicleta());
		bicicletas.add(new Bicicleta());
	}
	
	private Luz luzDelantera, luzTrasera;
	private int marchaActual = 1;
	private float velocidad = 0.0f;
	private final int NUM_MARCHAS = 12;
	
	
	public Bicicleta() {
		
	}
	
	public Bicicleta(Luz luzDelantera, Luz luzTrasera) {
		super();
		this.luzDelantera = luzDelantera;
		this.luzTrasera = luzTrasera;
		apagarEncenderLuces(EstadoLuz.APAGADA);
	}



	public void apagarEncenderLuces(EstadoLuz estadoLuz) {
		if(luzDelantera != null) {
			luzDelantera.encenderApagar(estadoLuz);
		}
		if(luzTrasera != null) {
			luzTrasera.encenderApagar(estadoLuz);
		}
	}
	
}
