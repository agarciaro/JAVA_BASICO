package com.sopra.javabasico.capitulo4;

public class Ejercicio07 {
	public static void main(String[] args) {
		int i = 0;
		while (args != null && !args[i].equals("fin")) {
			System.out.println(args[i]);
			i++;
		}
	}
}
