package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio02 {
	
	
	
	public static void main (String[] args) {
		
		//Scanner reader = new Scanner(System.in);
		//int base = reader.nextInt(), altura=reader.nextInt(), areaRectangulo=base*altura;
		//System.out.println( "El área de " + base + " por " + altura + " tiene un área de: " + areaRectangulo);
		
		String base = args[0], altura = args[1];
		
		int areaRectangulo = Integer.parseInt(base) * Integer.parseInt(altura);
		
		System.out.println("La base es " + base + " y la altura es " + " por lo que el área del triángulo es " + areaRectangulo);
		
		
		
	}
	
	

}
