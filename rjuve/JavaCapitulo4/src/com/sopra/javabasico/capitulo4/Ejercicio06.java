package com.sopra.javabasico.capitulo4;

public class Ejercicio06 {
	public static void main(String[] args) {
		for (int i = 0; args != null && i < args.length; i++) {
			System.out.printf("%d - %s\n", i, args[i]);
		}
	}
}
