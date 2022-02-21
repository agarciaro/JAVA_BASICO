package com.sopra.javabasico.capitulo4;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		if (args.length != 1) return;
		System.out.println(numeroDiasMes(Integer.parseInt(args[0])));
		
	}
	
	public static int numeroDiasMes(int m) {

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2: 
			return 28;
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			return 30;
		default:
			System.out.println("Número de mes incorrecto.");
			return -1;
		}
	}

}
