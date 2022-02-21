package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		String jugadaHumano, jugadaMaquina;
		String opciones[] = { "P", "L", "T" };
		Scanner input = new Scanner(System.in);
		Random ran = new Random();

		do {

			System.out.println("introduce :[P]iedra, Pape[L], [T]ijera: ");
			System.out.println("Introduce [S] para salir");
			jugadaHumano = input.nextLine();
			jugadaMaquina = opciones[ran.nextInt(3)];
			if(jugadaHumano.equalsIgnoreCase(jugadaMaquina)) {
				System.out.println("Empate");
			}else if(jugadaHumano.equalsIgnoreCase(opciones[0])) { //humano tiene piedra
				if(jugadaMaquina.equalsIgnoreCase(opciones[1])) { //maquina tiene papel
					System.out.println("Gana maquina");
				} else {
					System.out.println("Gana humano");
				}
				
			}
			
			
			
			else if(jugadaHumano.equalsIgnoreCase(opciones[0])) { //humano tiene piedra
				if(jugadaMaquina.equalsIgnoreCase(opciones[1])) { //maquina tiene papel
					System.out.println("Gana maquina");
				} else {
					System.out.println("Gana humano");
				}
				
			}

		} while (!jugadaHumano.equalsIgnoreCase("S"));

	}
}