package com.sopra.javabasico.capitulo4;

/**
 * 
 * @author Guille
 * @apiNote Algoritmos de vectores que pueden resultar útiles
 */
public class VectorUtil {

	public static int busquedaNum(int[] vec, final int goal) {
		int pit1 = 0;
		int pit2 = vec.length - 1;
		int value = 0; // valor del array en posicion i
		int i = 0;
		while (pit1 != pit2) {//Comparar pivotes
			i = Math.round((pit2 + pit1) / 2);//Punto medio
			value = vec[i];
			if (value == goal) {//Acertado?
				pit1 = pit2 = i;
			} else if (value < goal) {
				if (pit1 == i) {//Puede ser que busquemos el ultimo
					pit1 = ++i;
					value = goal;
				} else {
					pit1 = i;
				}
			} else {
				pit2 = i;
			}
		}
		if (pit1 == pit2) {
//			System.out.println("Encontrado: " + res + " en la posición " + i);
			return i;
		} else {
//			System.out.println("No encontrado");
			return -1;
		}
	}
}