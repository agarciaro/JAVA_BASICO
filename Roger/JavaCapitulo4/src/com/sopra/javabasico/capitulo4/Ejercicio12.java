package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String buffer;
		char jugada;
		boolean juego = true;
		
		System.out.println("Bienvenid@ al juego del Piedra, Papel y Tijera. Estoy seguro de que no podrás ganarme.");
		
		while (juego) {
			// Input del jugador
			System.out.print("Es tu turno (P - Piedra, L - Papel, T - Tijeras, S - Salir): ");
			buffer = scanner.next();
			
			// Comparamos la tirada del jugador en el switch case con la tirada random de la maquina
			switch (buffer) {
			case "p":
			case "P":
				jugada = 'P';
				switch (random.nextInt(3)) {
				case 0 :
					draw('P', 'P');
					break;
				case 1:
					lose('P', 'L');
					break;
				case 2:
					win('P', 'T');
					break;
				}
				break;
			case "l":
			case "L":
				jugada = 'L';
				switch (random.nextInt(3)) {
				case 0 :
					win('L', 'P');
					break;
				case 1:
					draw('L', 'L');
					break;
				case 2:
					lose('L', 'T');
					break;
				}
				break;
			case "t":
			case "T":
				jugada = 'T';
				switch (random.nextInt(3)) {
				case 0 :
					lose('T', 'P');
					break;
				case 1:
					win('T', 'L');
					break;
				case 2:
					draw('T', 'T');
					break;
				}
				break;
			case "s":
			case "S":
				juego = false;
				break;
			default:
				System.out.println("Jugada incorrecta.");
			
			}
			
			System.out.println("");

		}
		
	}
	
	// Metodos de impresión del resultado
	public static void win(char c1, char c2) {
		System.out.printf("VICTORIA! Has usado %c contra %c y ha sido muy efectivo.\n", c1, c2);
	}
	
	public static void draw(char c1, char c2) {
		System.out.printf("EMPATE! Has usado %c contra %c y ha sido poco efectivo.\n", c1, c2);
	}
	
	public static void lose(char c1, char c2) {
		System.out.printf("DERROTA! Has usado %c contra %c y no ha tenido efecto.\n", c1, c2);
	}

}
