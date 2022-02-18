package com.sopra.javabasico.capitulo4;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Atención, no se han introducido argumentos");
		} else {
			System.out.println("Se han introducido " + args.length + " argumentos");
		}
		
	}

}