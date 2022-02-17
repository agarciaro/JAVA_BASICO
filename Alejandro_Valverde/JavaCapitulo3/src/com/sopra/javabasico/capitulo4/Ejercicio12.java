package com.sopra.javabasico.capitulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba P, L o T según quiera elegir piedra, papel o tijeras, respectivamente. "
				+ "La piedra gana a la tijeras, las tijeras al papel y el papel a la piedra.");
		String jugadaHumano = entrada.nextLine();
		String jugadaMaquina = generarOpcion();
		System.out.println("La máquina juega " + jugadaMaquina);
		jugar(jugadaHumano, jugadaMaquina);
		entrada.close();
	}
	
	public static String generarOpcion() {
		Random r = new Random();
		int num = r.nextInt(3);
		String jugada = "";
		if(num == 0) {
			jugada = "P";
		}else if(num == 1) {
			jugada = "L";
		}
		else if(num == 2) {
			jugada = "T";
		}
		return jugada;
	}
	
	public static void jugar(String humano, String maquina) {
		if(humano.equals("P") && maquina.equals("T") || humano.equals("T") && maquina.equals("L") || humano.equals("L") && maquina.equals("P")) {
			System.out.println("Enhorabuenaaa has ganadoo!!");
		}else if(humano.equals("P") && maquina.equals("L") || humano.equals("L") && maquina.equals("T") || humano.equals("T") && maquina.equals("P")) {
			System.out.println("Lo siento has perdido");
		}else {
			System.out.println("Empate");
		}
	}

}
