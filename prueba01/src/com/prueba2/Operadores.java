package com.prueba2;

public class Operadores {
	
	public static void main(String[] args) {
		Integer x = 0, y = 0;
//		double x = 3 + 2 * --y;

//		int a = 2 * 5 + 3 * 4 - 8;
//		int b = 2 * ((5 + 3) * 4 - 8);
		
//		System.out.println(x.getClass());
		int xx = 3;
		int yy = ++xx * 5 / xx-- + --xx;
		
		System.out.println("xx es " + xx);
		System.out.println("yy es " + yy);
		
		int contador = 0;
		System.out.println(contador);
		System.out.println(++contador);
		System.out.println(contador);
		System.out.println(contador--);
		System.out.println(contador);
		
	}
	
}
