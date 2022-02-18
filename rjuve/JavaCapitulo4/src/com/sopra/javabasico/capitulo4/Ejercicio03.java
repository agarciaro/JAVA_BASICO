package com.sopra.javabasico.capitulo4;

public class Ejercicio03 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.print("No se han pasado argumentos al programa.");
		} else {
			System.out.printf("Se han pasado %d argumentos.", args.length);
		}
	}
}
