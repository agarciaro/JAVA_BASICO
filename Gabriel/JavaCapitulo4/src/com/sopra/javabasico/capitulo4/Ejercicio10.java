package com.sopra.javabasico.capitulo4;

public class Ejercicio10 {

	public static void main(String[] args) {

		Rectangulo2 r = new Rectangulo2();

//		r.setAlto(Integer.parseInt(args[0]));
//		r.setAncho(Integer.parseInt(args[1]));

		r.setAlto(3);
		r.setAncho(6);

		r.pintar();

	}

}

class Rectangulo2 {
	private int alto, ancho;

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void pintar() {
		int area = alto * ancho;

		char relleno = ' ';

		int resto = area % 3;

		if (resto == 0) {
			relleno = '#';
		} else if (resto == 1) {
			relleno = '%';
		} else if (resto == 2) {
			relleno = 'X';
		}

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {

				System.out.print(relleno);

			}
			System.out.println();
		}
	}

}
