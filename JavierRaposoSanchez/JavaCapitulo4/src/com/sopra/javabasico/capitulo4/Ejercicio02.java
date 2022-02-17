package com.sopra.javabasico.capitulo4;

//import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

//		Scanner r = new Scanner(System.in);
//		System.out.println("Introduce el lado1:");
//		int lado1 = r.nextInt();		
//		System.out.println("Introduce el lado2:");
//		int lado2 = r.nextInt();	
//		System.out.println("El rectángulo de " + lado1 + " por " + lado2 + " tiene un área de " + (lado1 * lado2));
		
//		int lado1 = Integer.parseInt(args[0]), lado2 = Integer.parseInt(args[1]);
//		System.out.println("El rectángulo de " + lado1 + " por " + lado2 + " tiene un área de " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
		
		
//		AreaReactangulo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		
		AreaRectangulo s = new AreaRectangulo();
		s.setLado1(Integer.parseInt(args[0]));
		s.setLado2(Integer.parseInt(args[1]));
		System.out.println("El rectángulo de " + Integer.parseInt(args[0]) + " por " + Integer.parseInt(args[1]) + " tiene un área de " + s.getArea());
					
	}
	
//	private static void AreaReactangulo(int l1, int l2) {
//		System.out.println("El rectángulo de " + l1 + " por " + l2 + " tiene un área de " + (l1 * l2));
//	}

}

class AreaRectangulo{
	
	private int lado1, lado2;
	
	public void setLado1(int l1) {
		this.lado1 = l1;
	}
	public void setLado2(int l2) {
		this.lado2 = l2;
	}
	public int getArea() {
		return (lado1 * lado2);
	}
		
}