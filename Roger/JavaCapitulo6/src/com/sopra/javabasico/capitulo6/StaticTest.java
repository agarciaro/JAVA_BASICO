package com.sopra.javabasico.capitulo6;

public class StaticTest {

	public static int x = 10;
	public int y = 9;
	
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
		
		st1.incrementaY();
		st1.incrementaY();
		st2.incrementaY();
		st3.incrementaY();
		st3.incrementaY();
		st3.incrementaY();
		st4.incrementaY();
		st1.incrementaX();
		st1.incrementaX();
		st2.incrementaX();
		st3.incrementaX();
		
	}
	
	public static void incrementaX() {
		x++;
		System.out.println("X: " + x);
	}
	
	public void incrementaY() {
		y++;
		System.out.println("Y(" + this.toString() + "): " + y);
	}

}
