package com.sopra.javabasico.capitulo3;

public class DivideyVenceras {

	public static void main(String[] args) {
		 
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 16, 20, 30, 65, 95, 100};
        DivideyVenceras a = new DivideyVenceras();
        a.buscaNumDyV(array, 0, array.length-1, 95);
	}
	public static int buscaNumDyV(int array[], int inicio, int fin, int numero) {
		if(array == null || array.length==0) {
			System.out.println("El array está vacio");
			return -1;
		}
		
		if(inicio>fin || inicio<0 || fin>=array.length ) {
			System.out.println("Error, el índice está fuera de los limites");
			return -1;
		}
		
		//System.out.println("Este es el punto de inicio: "+ inicio);
		//System.out.println("Este es el punto final: " +fin);
		
		
		if(inicio==fin) {
			if(array[inicio]== numero) {
				System.out.println("El numero esta en la posicion: " + inicio);
				return inicio ;
			}
			else return -1;
		}else {
			int posMedia = inicio +(fin-inicio) /2 ;
			if(numero== array[posMedia]) {
				System.out.println("El numero esta en la posicion: " + posMedia);
				return posMedia;
			}
			else if (numero<array[posMedia]) return buscaNumDyV(array, inicio, posMedia-1, numero);
			else return buscaNumDyV(array, posMedia+1, fin, numero);
		}
	}
	
}
