package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble(), b = in.nextDouble();
		System.out.println("El rectangulo de " + a + " por " + b + " tiene un area de " + a*b);
	}

}
