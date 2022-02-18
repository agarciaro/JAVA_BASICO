package com.sopra.javabasico.capitulo4;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.println(args[i]);
			i++;	
		} while (!args[i-1].equals("fin"));
		//Si no se recibe ningún argumento o ninguno de ellos es "fin" salta una excepción

	}

}
