package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * @author Ismail Cherkaoui Mestari
 * @version 1.0
 *
 */
public class Capitulo3 {

	// Variables de clase
	private static String cadena = "Esto es un String";
	private static String cadena2 = "Buenas";

	private Random r;
	private int random;
	private double numero;
	private boolean bool;

	{
		System.out.println(numero);
	}

	/**
	 * Constructor de la clase Capitulo3
	 * 
	 * @param random
	 * @param numero
	 * @param bool
	 */
	public Capitulo3(Random random, double numero, boolean bool) {
		int a = 5; // inaccesible desde fuera del constructor
		this.r = random;
		this.numero = numero;
		this.bool = bool;
	}

	/**
	 * 
	 * @param args argumentos que recibe cuando se ejecuta la clase
	 */
	public static void main(String[] args) {
		Random rndm = new Random();
		System.out.println(rndm.nextInt(10));

		Capitulo3 cap = new Capitulo3(rndm, 7.7, true);
		Capitulo3 cap1 = new Capitulo3(rndm, 0, false);
		Capitulo3 cap2 = null;
		if (args.length != 0) {
			System.out.println("Me has mandado el texto: " + args[0]);
		}
		
		cap1 = null;
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Estoy aprendiendo a programar en java");
		System.out.println(cap.r.nextInt(6) + " " + cap.numero + " " + cap.bool + " " + Capitulo3.cadena + " "
				+ Capitulo3.cadena2);
	}

	{
		System.out.println("Este bloque es un inicializador de instancia");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Instancia recolectada por GC");
	}
	
	
}
