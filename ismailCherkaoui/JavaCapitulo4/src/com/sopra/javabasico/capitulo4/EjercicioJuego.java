package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class EjercicioJuego {

	public static void main(String[] args) {
		Random random = new Random();
		String[] com = {"P", "L", "T"};
		Scanner in = new Scanner(System.in);
		System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras. Escribe P, L o T respectivamente para jugar. Escribe Salir para parar el juego");
		String jugador;
		int conCom = 0;
		int conJ = 0;
		int ronda = 1;
		
		do {
			String selCom = com[random.nextInt(3)];
			jugador = in.next().toUpperCase();
			while(!jugador.equals("P") && !jugador.equals("L") && !jugador.equals("T") && !jugador.equals("SALIR")) {
				System.out.println("Porfavor introduce P, L, T o Salir");
				jugador = in.next().toUpperCase();
			}
			
			if(!jugador.equals("SALIR")) {
				System.out.println("\nRonda " + ronda);
				System.out.println("Jugador: " + jugador + "    Com: " + selCom);
				
				if(jugador.equals("P")) {
					if(selCom.equals("L")) {
						conCom++;
					} else if(selCom.equals("T")) {
						conJ++;
					}
				} else if(jugador.equals("L")) {
					if(selCom.equals("P")) {
						conJ++;
					} else if(selCom.equals("T")) {
						conCom++;
					}
				} else {
					if(selCom.equals("P")) {
						conCom++;
					} else if(selCom.equals("L")) {
						conJ++;
					}
				}
				
				System.out.println("Jugador: " + conJ + "    Com: " + conCom);
				ronda++;
			}
			
		} while(!jugador.equals("SALIR"));
	}
}
