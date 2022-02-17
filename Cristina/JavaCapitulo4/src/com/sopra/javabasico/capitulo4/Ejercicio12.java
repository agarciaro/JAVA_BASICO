package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String jugadaHumano, jugadaMaquina;
		String opciones[] = { "P", "L", "T" };
		Scanner input = new Scanner(System.in);
		Random ran = new Random();

		do {
			System.out.println("Introduce: [P]iedra, Pape[L], [T]ijera");
			System.out.println("Introduce S para salir");
			jugadaHumano = input.nextLine();
			if (!jugadaHumano.equalsIgnoreCase(opciones[0]) && !jugadaHumano.equalsIgnoreCase(opciones[1])
					&& !jugadaHumano.equalsIgnoreCase(opciones[2])) {
				System.out.println("Jugada no valida");
				continue;
			}
			jugadaMaquina = opciones[ran.nextInt(3)];
			System.out.println("La maquina saca: "+ jugadaMaquina);
			if (jugadaHumano.equalsIgnoreCase(jugadaMaquina)) {
				System.out.println("Empate");
			}

			else if (jugadaHumano.equalsIgnoreCase(opciones[0])) { // humano tiene piedra
				if (jugadaMaquina.equalsIgnoreCase(opciones[1])) {// maquina tiene papel
					System.out.println("Gana Maquina");
				} else {

					System.out.println("Gana Humano"); //
				}

			} else if (jugadaHumano.equalsIgnoreCase(opciones[1])) { // humano tiene papel
				if (jugadaMaquina.equalsIgnoreCase(opciones[0])) { // Maquina tienen piedra
					System.out.println("Gana Humano");
				} else {

					System.out.println("Gana Maquina");
				}

			} else if (jugadaHumano.equalsIgnoreCase(opciones[2])) { // humano tiene tijera
				if (jugadaMaquina.equalsIgnoreCase(opciones[1])) { // Maquina tiene papel
					System.out.println("Gana Humano");
				} else {

					System.out.println("Gana Maquina");
				}

			}

		} while (!jugadaHumano.equalsIgnoreCase("S"));

		System.out.println("Has terminado la partida");

	}

}
