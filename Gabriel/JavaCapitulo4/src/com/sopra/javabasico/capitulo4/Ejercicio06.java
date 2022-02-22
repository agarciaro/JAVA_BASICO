package com.sopra.javabasico.capitulo4;

public class Ejercicio06 {

	public static void main(String[] args) {

		if (!args.equals(null) && args.length != 0) {

			for (int i = 0; i < args.length; i++) {
				System.out.println(i + "--->" + args[i]);

			}
		}

	}

}
