package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {

	public static void main(String[] args) {

		if (args.length == 1 || args.length == 2) {
			
			int ancho = Integer.parseInt(args[0]);// Transformacion a enteros
			int alto = Integer.parseInt(args[1]);
			
			if ((ancho * alto) % 3 == 0) {// divisible?
				printCuadrado("#", ancho, alto);
			} else if ((ancho * alto) % 1 == 0) {
				printCuadrado("%", ancho, alto);
			} else {
				printCuadrado("X", ancho, alto);
			}
			
		} else {
			System.out.println("Argumentos inv�lidos");
		}
	}

	public static void printCuadrado(String marca, int ancho, int alto) {// Graficador
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(marca + " ");
			}
			System.out.println();
		}
	}

}