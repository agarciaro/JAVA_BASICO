package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarRectangulo(6, 3);
	}
	
	public static void mostrarRectangulo(int base, int altura) {
		if(base*altura % 3 == 0) {
			iterar(base, altura, "#");
		}else if(base*altura % 3 == 1) {
			iterar(base, altura, "%");
		}else if(base*altura % 3 == 2) {
			iterar(base, altura, "X");
		}
		
	}
	
	public static void iterar(int base, int altura, String caracter) {
		for(int i=0; i<altura; i++) {
			for(int j=0; j<base; j++) {
				System.out.print("caracter");
			}
			System.out.println();
		}
	}

}
