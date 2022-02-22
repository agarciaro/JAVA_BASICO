package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random r = new Random();

		

		
		String s;
		char opciones[] = { 'P', 'L', 'T' };
		char eleccion_jugador = ' ', eleccion_sistema;

		while (eleccion_jugador != 'S') {

			System.out.println("Elije piedra (P), papel (L), Tijera (T) o Salir (S) escribiendo en la consola");

			s = in.nextLine();
			eleccion_jugador = s.charAt(0);

			eleccion_sistema = opciones[r.nextInt(3)];

			System.out.print(eleccion_jugador + " vs. " + eleccion_sistema + ": ");

			if (eleccion_jugador == eleccion_sistema)
				System.out.println("Empate");
			else if (eleccion_jugador == 'P') {
				if (eleccion_sistema == 'T')
					System.out.println("Ganas");
				else
					System.out.println("Pierdes");
			} else if (eleccion_jugador == 'L') {
				if (eleccion_sistema == 'P')
					System.out.println("Ganas");
				else
					System.out.println("Pierdes");
			} else if (eleccion_jugador == 'T') {
				if (eleccion_sistema == 'L')
					System.out.println("Ganas");
				else
					System.out.println("Pierdes");
			} else {
				System.out.println("Entrada incorrecta");
			}

		}

		System.out.println("Partida terminada");
	}

}
