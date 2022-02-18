package com.sopra.javabasico.capitulo4;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c;
		
		System.out.println("C�mo de largo quieres que sea el rect�ngulo?");
		int x = scanner.nextInt();

		System.out.println("C�mo de alto quieres que sea el rect�ngulo?");
		int y = scanner.nextInt();
		
		if ((x*y)%3 == 0) {
			c = '#';
		} else if ((x*y)%3 == 1) {
			c = '%';
		} else {
			c = 'X';
		}
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		scanner.close();
		
	}
}
