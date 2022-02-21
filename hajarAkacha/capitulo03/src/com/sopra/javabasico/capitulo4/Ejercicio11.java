package com.sopra.javabasico.capitulo4;

public class Ejercicio11 {

	public static void main(String[] args) {
		int ancho = Integer.parseInt(args[0]);
		int alto = Integer.parseInt(args[1]);
		int area = ancho * alto;
		int resto = area % 3;
		if (resto == 0) {
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		} else if (resto == 1) {
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					System.out.print("%");
				}
				System.out.println();
			}

		}else {
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					System.out.print("x");
				}
				System.out.println();
			}
		}
	}
}
