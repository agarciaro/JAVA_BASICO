package com.sopra.javabasico.capitulo3; // 1

import java.util.Random; //Si se usa java.util.* se importa toda la librería de java.util

// 3

/**
 * 
 * @author gvchaparro
 *
 */
public class Capitulo3 { // 2

	/*
	 * { System.out.println("Inicializador de instancia del principio: " + num); //
	 * 9 }
	 */
	// No se puede acceder a num antes de que sea declarada

	// 7
	// Variables de clase
	private static String s1 = "Esto es un String";
	private static String s2;

	private int num;
	private boolean flag;
	private Random rand;

	// 8
	/**
	 * Constructor de la clase Capitulo3
	 */
	public Capitulo3() {
		num = 2;
		flag = true;
		rand = new Random();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	/**
	 * Constructor de la clase Capitulo3
	 * 
	 * @param n numero
	 * @param b booleano
	 */
	public Capitulo3(int n, boolean b) {
		num = n;
		flag = b;
		rand = new Random();

		// 12
		int local = 12; // No se puede acceder desde fuera del constructor
	}

	public static int buscar(int[] vec, int num) {
		int index = -1;

		int izq = 0;
		int der = vec.length - 1;
		int mitad = izq + ((der - izq) / 2);
		boolean encontrado = false;

		while (izq <= der && !encontrado) {
			if (vec[mitad] < num) {
				izq = mitad + 1;
			} else if (vec[mitad] == num) {
				System.out.println("Encontrado");
				index = mitad;
				encontrado = true;
			} else {
				der = mitad - 1;
			}
			mitad = (izq + der) / 2;
		}

		if (izq > der) {
			System.out.println("No encontrado");
		}

		return index;
	}

	/**
	 * 
	 * @param args Argumentos de entrada
	 */
	public static void main(String[] args) {

		// 4
		System.out.println("Estoy aprendiendo a programar en java");

		// 5
		if (args.length != 0)
			System.out.println("Me has mandado el texto: " + args[0]);

		// 6
		Random r = new Random();
		System.out.println("Numero aleatorio: " + r.nextInt(10));

		// 10
		Capitulo3 capitulo3 = new Capitulo3(10, false);

		// 11
		System.out.println("Ejercicio 11");
		System.out.println(Capitulo3.s1);
		System.out.println(Capitulo3.s2);
		System.out.println(capitulo3.getNum());
		System.out.println(capitulo3.isFlag());
		System.out.println(capitulo3.rand.nextInt(6));

		// 14
		Capitulo3 cap1 = new Capitulo3(20, true);
		Capitulo3 cap2 = new Capitulo3(30, false);

		cap1 = null;
		cap2 = null;

		System.gc();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Buscar en vector

		int[] vector = { 3, 4, 5, 6, 7, 8 };

		System.out.println(Capitulo3.buscar(vector, 5));

	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Instancia recolectada por el gc");
	}

	{
		System.out.println("Este bloque es un inicializador de instancia (final)"); // 9
	}

}
