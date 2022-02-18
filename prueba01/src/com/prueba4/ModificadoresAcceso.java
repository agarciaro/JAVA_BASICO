package com.prueba4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ModificadoresAcceso {
	private static String variablePrivada = "hola";
	
	private static final List<Integer> lista;
	
	static {
		lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
	}
	
	public static void main(String[] args) {
		String[] palabras = {"a", "b"};
		variablePrivada = "";
		ModificadoresAcceso m1 = new ModificadoresAcceso();
		ModificadoresAcceso.variablePrivada = "";
		Goose g = new Goose();
		System.out.println(g.text);
		Goose.ejemploStatic();
		Arrays.sort(palabras);
		sort(palabras);
	}
	
	public static void sort(String[] palabras) {
		
	}

}
