package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.print("No se han recibido argumentos al programa.");
		} else if (args.length <= 4) {
			System.out.printf("Se han recibido %d argumentos.", args.length);
		} else {
			System.out.println("Se han recibido más de 4 argumentos.");
		}
	}
}
