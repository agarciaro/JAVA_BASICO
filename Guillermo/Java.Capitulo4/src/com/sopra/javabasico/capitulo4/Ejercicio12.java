package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int jugadaMaquina = 0;
		System.out.print("Este programa juega a Piedra, papel o tijera. Sintroduce el comando deseado en el menu.\n\n");
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		do {
			System.out.print("\n---------------------------------------------------------\n\n"
					+ "Menu:\n1.-Piedra: P\n2.-Papel: L\n3.-Tijeras: T\nSalir: S\n\nElecci�n:\t");
			jugadaMaquina = r.nextInt(3);
			sb.delete(0, sb.length());
			sb.append(sc.nextLine());
			System.out.println();
			sb.trimToSize();
			String p = sb.toString().toUpperCase();
			switch (p) {
			case "P":
				resulGame(0, jugadaMaquina);
				break;
			case "L":
				resulGame(1, jugadaMaquina);
				break;
			case "T":
				resulGame(2, jugadaMaquina);
				break;
			case "S":
				System.out.println("\nFin del juego :)");
				flag = false;
				break;
			default:
				System.out.print("Elecci�n no v�lida\n\n");
				break;
			}
		} while (flag);

	}

	public static void resulGame(int elec, int jug) {
		System.out.println("T�: "+ stringJugada(elec) + "\nM�quina: " + stringJugada(jug));
		if (elec == 0 && jug == 2) {
			System.out.println("\nVICTORIA!\n");
		} else if (elec > jug) {
			System.out.println("\nVICTORIA!\n");
		} else {
			if(elec==jug) {
				System.out.println("\nEMPATE\n");
			}else {
				System.out.println("\nDERROTA\n");
			}
		}
	}

	public static String stringJugada(int jug) {
		switch (jug) {
		case 0:
			return "Piedras";
		case 1:
			return "Papel";
		case 2:
			return "Tijeras";
		default:
			return "---";
		}
	}

}
