package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * @author Ismail Cherkaoui Mestari
 * @version 1.0
 *
 */

public class Capitulo3 {
	
	private Random random = new Random(9);
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
		Random r = new Random(5);
		
		Capitulo3 cap = new Capitulo3(r, 7.7, true);
		Capitulo3 cap1 = null;
		Capitulo3 cap2 = null;
		
		System.out.println("Estoy aprendiendo a programar en java");
		System.out.println(cap.random + " " + cap.numero + " " + cap.bool + " " + Capitulo3.cadena + " " + Capitulo3.cadena2);
		
		try {
			cap.finalize();
			cap1.finalize();
			cap2.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
