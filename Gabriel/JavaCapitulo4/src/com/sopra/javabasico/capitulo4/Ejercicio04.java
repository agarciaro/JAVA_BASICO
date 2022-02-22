package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {

	public static void main(String[] args) {

		if (args.equals(null) || args.length == 0) {
			System.out.println("No hay argumentos");
		} else if (args.length < 4){
			System.out.println("Hay " + args.length + " argumentos");
		}
		else
		{
			System.out.println("Hay mas de 4 argumentos");
		}

	}

}
