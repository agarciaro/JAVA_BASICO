package com.sopra.javabasico.capitulo4;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		if(args.length == 1) {
			switch(args[0]) {
				case "1": case "3": case "5": case "7":	case "8": case "10": case "12":
					System.out.println(31);
					break;
				case "4": case "6": case "9": case "11":
					System.out.println(30);
					break;
				case "2":
					System.out.println(28);
					break;
				default:
					System.out.println("Introduzca por argumentos un mes v�lido en formato num�rico (1-12)");
			}
		} else if(args.length == 0)	{
			System.out.println("Introduzca por argumentos un mes del a�o en formato num�rico (1-12)");
		} else {
			System.out.println("Introduzca por argumentos un s�lo argumento");
		}

	}
	
}
