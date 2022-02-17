package com.sopra.javabasico.capitulo4;

public class Ejercicio02 {

	public static void main(String[] args) {

		if (args.length == 0 || args.length > 2 || args.equals(null)) {// Comprobamos los argumentos de entrada
			System.out.println("Entradas invalidas");
		} else {
			if (args.length == 1) {// Un argumento o dos?
				System.out.println("El rectángulo de " + Integer.parseInt(args[0]) + " por " + Integer.parseInt(args[0])
						+ " tiene un area de " + (Integer.parseInt(args[0]) * Integer.parseInt(args[0])));
			} else {
				System.out.println("El rectángulo de " + Integer.parseInt(args[0]) + " por " + Integer.parseInt(args[1])
						+ " tiene un area de " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
			}
		}
	}
}
