package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String base = args[0], altura = args[1];
		
		for (String arg: args) {
			
			System.out.println(arg);
		}
		
		for (int i=0; args != null && i<args.length,i++) {
			
			System.out.println(args[i]);
		}
		
		
		if(args.length > 0) {
			
			int i = 0;
			
			while (!args[i].equals("fin"))
			{
				System.out.println(args[i]);
				i++;
			}
			
		}
		
		
		
		
		if(args.length == 0)
				
				{ System.out.println("El programa no tiene argumentos");}
		
		else if {System.out.println(args.length);}
		
		long areaRectangulo = Integer.parseInt(base) * Integer.parseInt(altura);
		
		System.out.println("La base es " + base + " y la altura es " + " por lo que el área del triángulo es " + areaRectangulo);

	}

}
