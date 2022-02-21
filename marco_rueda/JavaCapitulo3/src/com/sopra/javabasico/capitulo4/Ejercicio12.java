package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		// ---DECLARACIÓN DE VARIABLES---
		String jugador = " ";
		String[] movimientos = { "P", "L", "T" };
		Random ran = new Random();

		// ----CONTADORES---

		int contadorUsuario = 0;
		int contadorMaquina = 0;

		// ---JUGAR HASTA QUE EL USUARIO DECIDA SALIR DEL JUEGO

		while (!jugador.equalsIgnoreCase("S")) {

			// JUGADA DE LA MÁQUINA

			System.out.println("¿Qué eliges?: [P]iedra, pape[L], [T]ijeras, [S]alir del juego");
			jugador = new Scanner(System.in).nextLine();
			System.out.println("Has elegido: " + jugador);

			String maquina = movimientos[ran.nextInt(3)];

			if (jugador.equalsIgnoreCase(maquina)) {
				System.out.println("Empate");
				continue;
			}

			else if (jugador.equalsIgnoreCase(movimientos[0])) // Humano-Piedra
			{

				if (maquina.equalsIgnoreCase(movimientos[1])) // Maquina-Papel
				{

					System.out.println("La máquina ha elegido papel. Has perdido");
					contadorMaquina += 1;

				}

				else if (maquina.equalsIgnoreCase(movimientos[2])) // Maquina-Tijeras
				{

					System.out.println("La máquina ha elegido tijeras. Has ganado");
					contadorUsuario += 1;

				}
			}

			else if (jugador.equalsIgnoreCase(movimientos[1])) // Humano-Papel
			{

				if (maquina.equalsIgnoreCase(movimientos[0])) // Maquina-Piedra
				{
					System.out.println("La máquina ha elegido piedra. Has ganado");
					contadorUsuario += 1;

				}

				else if (maquina.equalsIgnoreCase(movimientos[2])) // Maquina-Tijeras
				{

					System.out.println("La máquina ha elegido tijeras. Has perdido");
					contadorMaquina += 1;

				}

			}

			else if (jugador.equalsIgnoreCase(movimientos[2])) // Humano-Tijeras
			{

				if (maquina.equalsIgnoreCase(movimientos[0])) // Maquina-Piedra
				{

					System.out.println("La máquina ha elegido piedra. Has perdido");
					contadorMaquina += 1;

				}

				else if (maquina.equalsIgnoreCase(movimientos[1])) // Maquina-Papel
				{

					System.out.println("La máquina ha elegido papel. Has ganado");
					contadorUsuario += 1;

				}

			}

			else {
				System.out.println("Error. Por favor, introduce un valor válido");
			}

		}

		System.out.println("Has elegido salir del juego");
		System.out.println("Contador usuario: " + contadorUsuario);
		System.out.println("Contador máquina: " + contadorMaquina);
		if (contadorUsuario > contadorMaquina) {
			System.out.println("Enhorabuena, has ganado");
		} else {
			System.out.println("Oh vaya, has perdido contra los robots");
		}
		
		jugador.close();

	}

}
