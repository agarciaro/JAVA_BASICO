package com.sopra.javabasico.capitulo6;

import jdk.internal.dynalink.beans.StaticClass;

public class StaticTest {
	
	private static int numero1;
	private int numero2;

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		numero1 = StaticTest.incrementa1();
		StaticTest.incrementa2(st1);
		StaticTest.incrementa2(st2);
	}
	
	public static int incrementa1() {
		int numTemporal = numero1 + 1;
		System.out.println(numTemporal);
		return numTemporal;
	}
	
	public static void incrementa2(StaticTest st) {
		st.setNumero2(st.getNumero2() + 1);
		System.out.println(st.getNumero2());
	}

	public static void setNumero1(int numero1) {
		StaticTest.numero1 = numero1;
	}

	public void setNumero2(int numero2) {
		numero1 = 5; //MEHHH
		this.numero1 = 7; //KAKA
		StaticTest.numero1 = 8; //GUAY
		this.numero2 = numero2;
	}

	public static int getNumero1() {
		return numero1;
	}

	public int getNumero2() {
		return numero2;
	}
	
	

}
