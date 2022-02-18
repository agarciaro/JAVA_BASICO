package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Atención, no se han introducido argumentos");
		} else if (args.length > 4) {
			System.out.println("Atención, se han introducido más de 4 argumentos");
		} else {
			System.out.println("Se han introducido " + args.length + " argumentos");
		}
		
	}

}
