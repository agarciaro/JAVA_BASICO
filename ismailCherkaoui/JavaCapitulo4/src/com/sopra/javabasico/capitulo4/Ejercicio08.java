package com.sopra.javabasico.capitulo4;

public class Ejercicio08 {
	public static void main(String[] args) {
		int i = -1;
		do {
			i++;
			System.out.println(args[i]);
		} while(!args[i].equals("fin"));
	}
}
