package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.print("Introduzca el n�mero del que desea conocer el valor absoluto:\t");
		float numero = r.nextFloat();
		System.out.println("El valor absoluto de " + numero + " es " + ((numero > 0) ? numero : (-numero)));
		//Debe introducirse por consola un n�mero real no decimal o salta una excepci�n
		
	}

}