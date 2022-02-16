package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * @author Ismail Cherkaoui Mestari
 * @version 1.0
 *
 */

public class Capitulo3 {
	
	Random r = new Random();
	private int random = r.nextInt(9);
	private double numero;
	private boolean bool;
	
	//Variables de clase
	private static String cadena = "Esto es un String";
	private static String cadena2 = "Buenas";
	
	/**
	 * Constructor de la clase Capitulo3
	 * @param random
	 * @param numero
	 * @param bool
	 */
	public Capitulo3(Random random, double numero, boolean bool) {
		int a = 5; //inaccesible desde fuera del constructor
		this.random = random.nextInt(5);
		this.numero = numero;
		this.bool = bool;
	}
	
	
	/**
	 * 
	 * @param args argumentos que recibe cuando se ejecuta la clase
	 */
	public static void main(String[] args) {
		Random r = new Random();
		
		Capitulo3 cap = new Capitulo3(r, 7.7, true);
		Capitulo3 cap1 = null;
		Capitulo3 cap2 = null;
		System.out.println("Me has mandado el texto: " + args[0]);
		System.out.println("Estoy aprendiendo a programar en java");
		System.out.println(cap.random + " " + cap.numero + " " + cap.bool + " " + Capitulo3.cadena + " " + Capitulo3.cadena2);
	}
}
