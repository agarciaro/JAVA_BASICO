package com.sopra.javabasico.capitulo4;

public class Ejercicio07 {

	public static void main(String[] args) {
			
		int i = 0;
		while(!args[i].equals("fin")) {
			System.out.println(args[i]);
			i++;	
		}
		//Si no se recibe ning�n argumento o ninguno de ellos es "fin" salta una excepci�n
		
	}

}
