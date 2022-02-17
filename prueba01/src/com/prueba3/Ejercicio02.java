package com.prueba3;

public class Ejercicio02 {
	
	public static void main (String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		Rectangulo r = new Rectangulo();
		r.setLado1(3);
		r.setLado2(2);
		System.out.println(r.getArea());
	}
	
}

class Rectangulo{
	private int lado1, lado2;
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public long getArea() {
		return lado1 * lado2;
	}
}
