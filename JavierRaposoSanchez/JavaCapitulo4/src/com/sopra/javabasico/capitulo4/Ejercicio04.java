package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Atenci�n, no se han introducido argumentos");
		} else if (args.length > 4) {
			System.out.println("Atenci�n, se han introducido m�s de 4 argumentos");
		} else {
			System.out.println("Se han introducido " + args.length + " argumentos");
		}
		
	}

}
