package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {

	public static void main(String[] args) {
		if (args.equals(null) || args.length == 0) {//Es null o 0?
			System.out.println("No se han recivido argumentos");
		} else if (args.length <= 4) {
			System.out.println("Se han recivido " + args.length + " argumentos");
		} else {
			System.out.println("Se han recivido más de 4 argumentos");
		}
	}

}
