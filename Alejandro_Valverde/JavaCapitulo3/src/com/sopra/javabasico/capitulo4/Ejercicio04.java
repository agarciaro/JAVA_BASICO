package com.sopra.javabasico.capitulo4;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length == 0) {
			System.out.println("Este main no recibe ningún parámetro");
		}else if(args.length <= 4){
			System.out.println("Este main recibe " + args.length + " parámetros");
		}else if(args.length > 4) {
			System.out.println("Este main recibe más de 4 parámetros");
		}
	}

}
