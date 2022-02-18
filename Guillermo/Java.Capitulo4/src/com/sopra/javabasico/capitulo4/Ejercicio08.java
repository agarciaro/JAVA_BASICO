package com.sopra.javabasico.capitulo4;

public class Ejercicio08 {

	public static void main(String[] args) {
		if (args.equals(null) || args.length == 0) {
			System.out.println("No se han recivido argumentos");
		} else {
			System.out.println("Se han recivido " + args.length + " argumentos, que son:");
			int i = 0;
			do {// Listado
				System.out.println((i + 1) + ".- " + args[i]);
				i++;
			} while (i < args.length && !args[i-1].equals("fin"));
		}
	}
}
