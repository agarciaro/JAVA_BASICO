package com.sopra.javabasico.algoritmo;

import java.lang.reflect.Array;

public class Algoritmo {
	
	public static void burbuja(int[] array) {
		int aux;
		for(int i = 0; i<Array.getLength(array)-1; i++) {
			if(array[i] > array[i+1]) {
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;
				i=-1;
			}
		}
	}
	
	public static void binario(int[] array, int num) {
		int inicio = 0;
		int fin = array.length;
		int mid = (inicio+fin)/2;
		
		if(num > array[0] && num < array[array.length-1]) {
			while(inicio<=fin) {
				if(num == array[mid]) {
					System.out.println("El numero buscado esta en la pos " + mid);
				} else if(num < array[mid]) {
					fin = mid-1;
				} else if(num > array[mid]) {
					inicio = mid+1;
				}
				
				mid = (inicio+fin)/2;
			}
		}
	
	}

}
