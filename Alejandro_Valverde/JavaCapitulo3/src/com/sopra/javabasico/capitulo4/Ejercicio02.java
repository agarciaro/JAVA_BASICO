package com.sopra.javabasico.capitulo4;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		calcularAreaReactangulo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));		
	}
	
	public static void calcularAreaReactangulo(int base, int altura) {
		System.out.println("El área del rectángulo de base: " + base + " y altura: " + altura + " es: " + base * altura);
	}

}
