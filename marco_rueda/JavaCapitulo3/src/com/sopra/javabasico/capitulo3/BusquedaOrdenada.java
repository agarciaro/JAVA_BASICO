package com.sopra.javabasico.capitulo3;


import java.util.Arrays;
import java.util.Random;

public class BusquedaOrdenada {
	
	

	public static void main(String[] args) {
		
		int[] listaOrdenada = {1,2,3,4,5,6,7,8,9,10};
		
		int mitadArray = listaOrdenada.length / 2;
		//System.out.println(mitadArray);
		
		Random rand = new Random();
	
		
		for(int i=0; i < listaOrdenada.length; i++) {
			
			int r = rand.nextInt(10)+1;
			
			if(r == mitadArray) {
				
				System.out.println("Qué suerte! " + r);
				break;
					
			}
			
			else if (r < mitadArray) {
				
				int[] subArray = Arrays.copyOfRange(listaOrdenada, 0, mitadArray);
				
			
				int subResult = Arrays.binarySearch(subArray, r); 
				
				System.out.println("El número está en la parte inferior de la lista y es: " + r);
				break;
	
				
			}
				
					
			else {
				
				
				int[] topArray = Arrays.copyOfRange(listaOrdenada, mitadArray + 1, listaOrdenada.length);
				
				int topResult = Arrays.binarySearch(topArray, r);
				
				System.out.println("El número está en la parte superior de la lista y es: " + r);
				break;
				
			}
						
						
					}
					
					
				}

			
			
		}


	

	
	

