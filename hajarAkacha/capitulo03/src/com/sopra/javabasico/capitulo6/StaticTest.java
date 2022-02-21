package com.sopra.javabasico.capitulo6;

public class StaticTest {
	
	private static int numero;
	private int numero2; 
	
	public int incrementa1 (int numero) {
		numero++; 
		System.out.println("El numero incrementado es: "+numero);
		return numero ;
		
	}
	
	public int incrementa2 (int numero2) {
		numero2 = numero2 + 2; 
		System.out.println("El numero 2 incrementado es: "+numero2);
		return numero2 ;
		
	}

	public static void main(String[] args) {
		int numero3 = 5;
		StaticTest ejemplo1 = new StaticTest();
		
		numero3 = ejemplo1.incrementa1(numero3);
		numero3 = ejemplo1.incrementa1(numero3);
		numero3 = ejemplo1.incrementa1(numero3);
		numero3 = ejemplo1.incrementa1(numero3);
		
		
		int numero4 = 8;
		StaticTest ejemplo2 = new StaticTest();
		
		numero4 = ejemplo2.incrementa2(numero4);
		numero4 = ejemplo2.incrementa2(numero4);
		numero4 = ejemplo2.incrementa2(numero4);
		numero4 = ejemplo2.incrementa2(numero4);
		numero4 = ejemplo2.incrementa2(numero4);
		
		
		

	}

}
