package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {
	public static void main(String[] args) {
		if(args.length == 2) {
			for(int i = 0; i<Integer.parseInt(args[0]); i++) {
				for(int j = 0; j<Integer.parseInt(args[1]); i++) {
					if(Integer.parseInt(args[0])*Integer.parseInt(args[1]) % 3 == 0) {
						System.out.println('#');
					} else if(Integer.parseInt(args[0])*Integer.parseInt(args[1]) % 3 == 1) {
						System.out.println('%');
					} else if(Integer.parseInt(args[0])*Integer.parseInt(args[1]) % 3 == 2) {
						System.out.println('x');
					}
				}
			}
		}
	}
}
