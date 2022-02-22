package com.sopra.javabasico.capitulo4;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int mes = 5;
		
		System.out.println("El numero de dias del mes " + mes + " es " + calcularDia(mes));
	}

	public static int calcularDia(int nMes) {
		switch (nMes) {
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
		case 9:
		case 11:
			return 30;
		default:
			return -1;
		}

	}

}
