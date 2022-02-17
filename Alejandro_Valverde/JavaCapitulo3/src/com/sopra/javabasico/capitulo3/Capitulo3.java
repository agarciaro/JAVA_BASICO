package com.sopra.javabasico.capitulo3;

import java.util.Random;

public class Capitulo3 {
	
	private Random random;
	private int numero;
	private boolean bool;
	private static String texto = "esto es un String";
	private static String palabra;
	
	public Capitulo3(Random random, int numero, boolean bool) {
		boolean semaforo = true; //No se puede acceder desde fuera de este constructor
		this.random = random;
		this.numero = numero;
		this.bool = bool;
	}
	
	{System.out.println(numero);}
	
	public static void main(String[] args) {
		//Ejercicio 4 
		System.out.println("Estoy aprendiendo a programar en JAVA");
		//Ejercicio 5
		if(args.length != 0) {
			System.out.println("Me has mandado el texto: " + args[0]);
		}	
		//Ejercicio 6
		Random r = new Random();
		int numAleatorio = r.nextInt(10);
		System.out.println(numAleatorio);
		
		//Ejercicio 10
		Capitulo3 cap = new Capitulo3(r, 023, false);
		
		//Ejercicio 11
		System.out.println("Random: " + cap.random.nextInt(5) + " num: " + cap.numero + " bool: " + cap.bool + " texto: " + cap.texto + " palabra: " + cap.palabra);
		
	}
	
	{System.out.println("Este bloque es un bloque inicialozador de instancia");}
	
}
