package com.sopra.javabasico.capitulo4;

public class Ejercicio05 {

	public static void main(String[] args) {

		if (!args.equals(null) && args.length != 0) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}

	}

}
