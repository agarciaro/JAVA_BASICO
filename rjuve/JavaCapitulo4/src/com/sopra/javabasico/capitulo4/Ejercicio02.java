package com.sopra.javabasico.capitulo4;

public class Ejercicio02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		System.out.printf("El rectangulo de %d por %d tiene un área de %d.", a, b, calcularAreaRectangulo(a, b));
	}
	
	public static int calcularAreaRectangulo(int x, int y) {
		return x*y;
	}
}
