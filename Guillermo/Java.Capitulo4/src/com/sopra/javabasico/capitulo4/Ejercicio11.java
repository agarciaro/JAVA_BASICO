package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número:\t");
		float f = sc.nextFloat();
//		System.out.println(Math.abs(f));
		System.out.println(f>0?f:-f);
	}
}
