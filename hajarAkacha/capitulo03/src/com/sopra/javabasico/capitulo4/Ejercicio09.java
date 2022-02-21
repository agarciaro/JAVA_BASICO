package com.sopra.javabasico.capitulo4;
import java.util.Scanner;

public class Ejercicio09 {
	
	 
	 
	    public static void main(String[] args){
	 
	        int mes, numDias = 0;
	        mes = leerEntero("Introduce el mes: ");
	 
	        switch (mes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                numDias = 31;
	                break;
	            case 4: case 6: case 9: case 11: case 2:
	                numDias = 30;
	                break;
	            
	                
	            default:
	                System.out.println("\nEl mes " + mes + " es incorrecto.");
	                break;
	        }
	 
	        if(numDias!=0){
	            System.out.println("\nEl mes " + mes + " tiene " + numDias + " días.");
	        }
	    }
	 
	    private static int leerEntero(String s){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(s);
	        return sc.nextInt();
	    }
	}