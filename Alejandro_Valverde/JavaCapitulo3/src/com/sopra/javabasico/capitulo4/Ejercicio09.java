package com.sopra.javabasico.capitulo4;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("El número de días es " + calcularDias(0));

	}
	
	public static int calcularDias(int numMes){
		switch(numMes) {
			case 1: 
			case 3:
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: 
				return 31;
			case 4: 
			case 6: 
			case 9: 
			case 11: 
				return 30;
			case 2: 
				return 28;
			default:
				System.out.println("Se debe introducir un número del 1 al 12");
				return -1;
		}
	}
}
