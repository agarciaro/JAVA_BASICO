package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No hay argumentos");
		} else if(args.length<=4) {
			System.out.println(args.length);
		} else System.out.println("Mas de 4 argumentos");
	}
}
