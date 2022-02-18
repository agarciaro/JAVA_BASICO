package com.prueba4;

public class Bird {

	protected String text = "floating"; // protected access
	
	public Bird() {
		System.out.println("Construyendo Bird");
	}
	
	public Bird(String text) {
		System.out.println("Construyendo Bird con text");
		this.text = text;
	}

	protected void floatInWater() { // protected access
		System.out.println(text);
		Bird.ejemploStatic();
	}
	
	public static void ejemploStatic() {
		System.out.println("static");
		ejemploStatic2();
	}
	
	public static void ejemploStatic2() {
		System.out.println("static2");
		ejemploStatic3();
	}
	
	public static void ejemploStatic3() {
		System.out.println("static3");
		ejemploStatic();
	}

}
