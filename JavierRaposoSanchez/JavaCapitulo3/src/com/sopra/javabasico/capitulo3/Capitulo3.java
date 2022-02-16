package com.sopra.javabasico.capitulo3;

import java.util.Random;
//Import java.util.*; Importa todas las librerías "java.util"
 
/**
 * @author Javier Raposo Sánchez
 * @version 1.0.0
 */

public class Capitulo3 {
	
	private int a;
	private char b;
	private Random c;
	private static String d = "Esto es un String";
	private static String e;
	
	/**
	 * Constructor de la clase Capitulo3
	 * @param a1
	 * @param b1
	 * @param c1
	 */
	public Capitulo3(int a1, char b1, Random c1) {
		
		this.a = a1;
		this.b = b1;
		this.c = c1;
		
		int f = 1; //Inaccesible fuera del constructor, desaparece al acabar el constructor
		
	}

	public static void main(String[] args) {
		
		System.out.println("Estoy aprendiendo a programar en Java");
		
		if(args.length != 0) {
			System.out.println("Me has mandado el texto: " + args[0]);
		}
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
				
		Capitulo3 s = new Capitulo3(4, 'j', r);
				
		System.out.println(s.a + "\t" + s.b + "\t" + s.c.nextInt(6)+ "\t" + Capitulo3.d + "\t" + Capitulo3.e);
			
	}
}