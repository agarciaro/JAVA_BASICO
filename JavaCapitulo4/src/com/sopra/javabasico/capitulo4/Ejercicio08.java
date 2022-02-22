package com.sopra.javabasico.capitulo4;

public class Ejercicio08 {

	public static void main(String[] args) {

		int index = 0;

		if (args.equals(null) || args.length == 0) {
			System.out.println("Sin argumentos");
		} else {

			do {
				System.out.println(args[index]);

				index++;

			} while (index != args.length && args[index] != "fin");
		}

	}

}
