package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {

	public static void main(String[] args) {
		
//		int resto = (ancho * alto) % 3; 
//		if(resto == 0) {
//			for(int i = 0; i < alto; i++) {
//				for(int j = 0; j < ancho; j++) {
//					System.out.print("#");
//				}
//				System.out.println();
//			}
//		} else if(resto == 1) {
//			for(int i = 0; i < alto; i++) {
//				for(int j = 0; j < ancho; j++) {
//					System.out.print("%");
//				}
//				System.out.println();
//			}
//		}
//		else if(resto == 2) {
//			for(int i = 0; i < alto; i++) {
//				for(int j = 0; j < ancho; j++) {
//					System.out.print("X");
//				}
//				System.out.println();
//			}
//		}
		
		DibujoRectangulo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

	}
	
	private static void DibujoRectangulo(int ancho, int alto) {
		
		for(int i = 0; i < alto; i++) {
			for(int j = 0; j < ancho; j++) {
				switch((ancho * alto) % 3) {
					case 0:
						System.out.print("#");
						break;
					case 1:
						System.out.print("%");
						break;
					case 2:
						System.out.print("X");
//						break; 
				}
			}
			System.out.println();
		}
	
	}
}
