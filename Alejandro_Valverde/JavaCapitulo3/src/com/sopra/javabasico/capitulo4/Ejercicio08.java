package com.sopra.javabasico.capitulo4;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean fin = false;
		int i = 0;
		do {
			if(i == args.length) {
				fin = true;
			}else {
				System.out.println("El argumento " + i+1 + " es: " + args[i]);
				if(args[i].equals("fin")) {
					fin = true;
				}
			}
			++i;
		}while(!fin);
		//Si no se recibe ningún argumento no pasará nada
	}

}
