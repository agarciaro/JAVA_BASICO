package com.sopra.javabasico.capitulo4;

public class Ejercicio03 {

	public static void main(String[] args) {

		if (args.equals(null) || args.length == 0) {
			System.out.println("No hay argumentos");
		} else {
			System.out.println("Hay " + args.length + " argumentos");
		}

	}

}
