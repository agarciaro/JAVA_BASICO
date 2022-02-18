package com.sopra.javabasico.algoritmo;

import java.util.Arrays;

public class Algoritmo {

	public static void burbuja(int[] array) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				aux = array[i];
				array[i] = array[i + 1];
				array[i + 1] = aux;
				i = -1;
			}
		}
	}

	public static int binario(int[] array, int num) {
		int inicio = 0;
		int fin = array.length;
		int mid = (inicio+fin)/2;
		boolean found = false;
		
		if(num > array[0] && num < array[array.length-1]) {
			while(inicio<=fin && !found) {
				if(num == array[mid]) {
					found = true;
				} else if(num < array[mid]) {
					fin = mid-1;
				} else if(num > array[mid]) {
					inicio = mid+1;
				}
				
				mid = (inicio+fin)/2;
			}
						
		}
		
		if(found) {
			return mid;		
		} else return -1;
	
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 4, 6, 3, 9, 7, 3, 6 };

		burbuja(array);
		System.out.println(Arrays.toString(array));
		if(binario(array, 8) != -1) {
			System.out.println("El numero buscado se encuentra en la pos " + binario(array,8));
		} else System.out.println("El numero no esta en el array");

	}

}
