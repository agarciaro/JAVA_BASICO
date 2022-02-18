package com.sopra.javabasico.capitulo5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String apellido1;
		String apellido2;
		Scanner scanner = new Scanner(System.in);
		Persona persona1;

		// Pedimos los datos de una persona al usuario con el scanner
		System.out.print("Cual es tu nombre?: ");
		nombre = scanner.next();
		System.out.println();
		
		System.out.print("Cual es tu primer apellido?: ");
		apellido1 = scanner.next();
		System.out.println();
		
		System.out.print("Cual es tu segundo apellido?: ");
		if (scanner.hasNext()) {
			apellido2 = scanner.next();
		} else {
			apellido2 = "";
		}
		System.out.println();
		
		// Inicializamos el objeto persona
		persona1 = new Persona(nombre, apellido1, apellido2);
		
		// Imprimimos sus datos
		System.out.printf("Tu nombre es " + persona1.getNombreCompleto() + ".\n");
		
		System.out.printf("Trigrama: %s\n", persona1.getTrigrama());

		// Creamos objetos personas para hacer un array
		Persona persona2 = new Persona("Damian", "Suarez", "Lopez");
		Persona persona3 = new Persona("Dario", "Solomillo", "Perez");
		Persona persona4 = new Persona("Mario", "Luigi", "Pizzi");
		
		Persona[] personas = {persona1, persona2, persona3, persona4};
		
		// Preparamos dos ArrayLists para las estadísticas de los trigramas
		
		ArrayList<String> trigramas = new ArrayList<String>();
		ArrayList<Integer> estadisticasTrigramas = new ArrayList<Integer>();
		
		for (Persona persona : personas) {
			
		}
	}

}
