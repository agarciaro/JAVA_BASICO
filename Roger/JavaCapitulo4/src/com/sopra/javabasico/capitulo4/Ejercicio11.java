package com.sopra.javabasico.capitulo4;

import java.util.Random;

public class Ejercicio11 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
		float f = r.nextFloat();
		
		System.out.println("Número float: " + f);
		
		f = (f >= 0f) ? f : -f;
		System.out.println("Valor absoluto: " + f);
		}
	}

}
