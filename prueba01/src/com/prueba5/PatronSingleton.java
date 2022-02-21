package com.prueba5;

import java.util.ArrayList;
import java.util.List;

public class PatronSingleton {
	private static final int NUM_INSTANCIAS = 3;
	
	private static final PatronSingleton[] instancias = new PatronSingleton[NUM_INSTANCIAS];
	
	static {
		for (PatronSingleton patronSingleton : instancias) {
			patronSingleton = null;
		}
	}
	
//	private static PatronSingleton p = null;
	
	private String nombre;
	
	private PatronSingleton() {
		this.nombre = "";
	}
	
	public static PatronSingleton getInstance() {
		return getInstance(0);
	}
	
	public static PatronSingleton getInstance(int instanceIndex) {
		if(instanceIndex >= NUM_INSTANCIAS || instanceIndex < 0) {
			return null;
		}
		
		//Si el elemento del array es nulo entonces devolver nueva instancia si no devolver ese elemento
		if(instancias[instanceIndex] == null) {
			instancias[instanceIndex] = new PatronSingleton();
		}
		return instancias[instanceIndex];

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
