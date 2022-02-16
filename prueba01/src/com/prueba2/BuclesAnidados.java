package com.prueba2;

public class BuclesAnidados {

	public static void main(String[] args) {
		int[][] myComplexArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 7 } };

//		for (int i = 0; i < myComplexArray.length; i++) {
////			System.out.println("Elemento " + i);
//			for (int j = 0; j < myComplexArray[i].length; j++) {
//				System.out.print(myComplexArray[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
//		for (int[] mySimpleArray : myComplexArray) {
//			for (int num : mySimpleArray) {
//				System.out.print(num + "\t");
//			}
////			for (int i = 0; i < mySimpleArray.length; i++) {
////				System.out.print(mySimpleArray[i] + "\t");
////			}
//			System.out.println();
//		}
		
//		int x = 20;
//		while (x > 0) {
//			do {
//				x -= 2;
//			}while(x > 5);
//			x--;
//			System.out.print(x + "\t");
//		}
		
//		int x = 0;
//		while (x < 100) {
//			x+=10;
//			if(x == 30) {
//				continue;
//			}
//			if(x == 70) {
//				break;
//			}
//			System.out.println(x);		
//		}
		
		int[] simpleArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int num = 4;
		boolean encontrado = false;
		for(int i = 0;i < simpleArray.length && !encontrado;i++) {
			System.out.println(i);
			if(simpleArray[i] == num) {
				System.out.println("Encontrado en: " + i);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado el número");
		}
		
	}

}
