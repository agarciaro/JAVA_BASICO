package com.sopra.javabasico.capitulo4;

public class Ejercicio02 {

	public static void main(String[] args) {

		Rectangulo r = new Rectangulo();
		r.setLado1(Integer.parseInt(args[0]));
		r.setLado2(Integer.parseInt(args[1]));
		System.out.println("El area del rectangulo de lados " + args[0] + " y " + args[1] + "es " + r.getArea());

	}

}

class Rectangulo {
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

	public int getArea() {
		return (lado1 * lado2);
	}
}
