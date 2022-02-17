package com.sopra.javabasico.capitulo4;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean fin = false;
		int i = 0;
		while(!fin) {
			if(i == args.length) {
				fin = true;
			}else if(args[i].equals("fin")) {
				fin = true;
			}else {
				System.out.println("El argumento: " + i+1 + " es: " + args[i]);
			}
			++i;
		}
		//Si no se recibe ningún argumento no pasará nada
	}

}
