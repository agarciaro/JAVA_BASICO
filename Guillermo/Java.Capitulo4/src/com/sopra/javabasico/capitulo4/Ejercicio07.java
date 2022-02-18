package com.sopra.javabasico.capitulo4;

public class Ejercicio07 {

	public static void main(String[] args) {
		if (args.equals(null) || args.length == 0) {
			System.out.println("No se han recivido argumentos");
		} else {
			System.out.println("Se han recivido " + args.length + " argumentos, que son:");
			int i = 0;
			while (i < args.length && !args[i].equals("fin")) {// Listado
				System.out.println((i + 1) + ".- " + args[i]);
				i++;
			}
		}
	}
}
