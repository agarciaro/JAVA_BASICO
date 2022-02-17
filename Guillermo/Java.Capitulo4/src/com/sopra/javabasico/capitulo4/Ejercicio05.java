package com.sopra.javabasico.capitulo4;

public class Ejercicio05 {

	public static void main(String[] args) {
		if (args.equals(null) || args.length == 0) {
			System.out.println("No se han recivido argumentos");
		} else {
			System.out.println("Se han recivido " + args.length + " argumentos, que son:");
			for (String string : args) {
				System.out.print(string + " ");
			}
		}
	}
}
