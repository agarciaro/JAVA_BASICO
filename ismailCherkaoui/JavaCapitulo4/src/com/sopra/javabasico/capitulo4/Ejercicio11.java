package com.sopra.javabasico.capitulo4;

public class Ejercicio11 {
	public static void main(String[] args) {
		float a = -1.7f;
		(a<0) ? System.out.println(a*-1) : System.out.println(a);
		
		a = (a<0) ? a*-1 : a;
		
		System.out.println(a);
	}
}
