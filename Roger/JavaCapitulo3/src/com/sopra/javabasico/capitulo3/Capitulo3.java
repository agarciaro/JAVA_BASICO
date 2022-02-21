package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * Clase Capitulo 3 con programas para aprender Java.
 * @author Roger
 * @version 1.0
 * 
 */

public class Capitulo3 {

	// Variables de clase
	private int num;
	private char c;
	private Random m;
	private static String s1 = "Esto es un String";
	private static String s2 = "Otro String";
	
	/**
	 * 
	 * Constructor de la clase Capitulo 3
	 * @param num Número entero
	 * @param c Carácter ASCII
	 * 
	 */
	public Capitulo3(int num, char c) {
		this.num = num;
		this.c = c;
		this.m = new Random();
		
		boolean var = true; // Inaccesible desde fuera del constructor
	}
	
	{
		System.out.println(num);
	}
	
	/**
	 * 
	 * Metodo main de la clase Capitulo 3
	 * @param args Argumentos de entrada, un texto.
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("Estoy aprendiendo a programar en Java.");
		
		if (args.length != 0) {
			System.out.println("Me has mandado el texto: " + args[0]);
		}
		
		Random r = new Random();
		System.out.println("Número random del 0 al 9: " + r.nextInt(10));

		Capitulo3 c3 = new Capitulo3(4, 'c');
		
		System.out.println(c3.num);
		System.out.println(c3.c);
		System.out.println(c3.m.nextInt(6));
		System.out.println(s1);
		System.out.println(s2);

		Capitulo3 c1 = null;
		Capitulo3 c2 = null;
		
//		c1.finalize();
//		c2.finalize();
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	{
		System.out.println("Este bloque es un inicializador de instancia.");
	}

}
