package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {
	
	public static void main (String[] args) {
		
		//---refactorizar utilizando abstracción-----
		
		
		int base = Integer.parseInt(args[0]), altura=Integer.parseInt(args[1]);
		int area = base*altura;
		int resto = area % 3;
		
		if(resto==0) {
			
			for (int i=0; i<altura; i++) {
			
				for (int j=0; j<base; j++) {
					
					System.out.print("#");
				}
				
				System.out.println();
			}
		}
		
		else if(resto==1) {
			
			for (int i=0; i<altura; i++) {
				
				for (int j=0; j<base; j++) {
					
					System.out.print("%");
				}
				
				System.out.println();
			}
			
			
		}
		
		else {
			
			for (int i=0; i<altura; i++) {
				
				for (int j=0; j<base; j++) {
					
					System.out.print("X");
				}
				
				System.out.println();
			}
			
			
		}
		
		
		
	}
	
	

}
