package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * @author Ismail Cherkaoui Mestari
 * @version 1.0
 *
 */

public class Capitulo3 {
	
	Random random = new Random(9);
	private double numero;
	private boolean bool;
	private static String cadena = "Esto es un String";
	private static String cadena2 = "Buenas";
	
	/**
	 * Constructor de la clase Capitulo3
	 * @param random
	 * @param numero
	 * @param bool
	 */
	
	public Capitulo3(Random random, double numero, boolean bool) {
		this.random = random;
		this.numero = numero;
		this.bool = bool;
	}
	
	
	/**
	 * 
	 * @param msg Cadena de caracteres que mostramos por consola
	 */
	public static void txt(String msg) {
		System.out.println("Me has mandado el texto: " + msg);
	}
	
	/**
	 * 
	 * @param args argumentos que recibe cuando se ejecuta la clase
	 */
	public static void main(String[] args) {
		System.out.println("Estoy aprendiendo a programar en java");
	}
}
