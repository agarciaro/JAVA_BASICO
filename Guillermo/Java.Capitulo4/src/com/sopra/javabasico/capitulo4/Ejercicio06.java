package com.sopra.javabasico.capitulo4;

public class Ejercicio06 {

	public static void main(String[] args) {//Es null o 0?
		if (args.equals(null) || args.length == 0) {
			System.out.println("No se han recivido argumentos");
		} else {
			System.out.println("Se han recivido " + args.length + " argumentos, que son:");
			for (int i =0;i<args.length;i++) {//Listado
				System.out.println((i+1) + ".- " + args[i]);
			}
		}
	}
}
