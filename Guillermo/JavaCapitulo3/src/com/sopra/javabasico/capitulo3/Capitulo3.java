package com.sopra.javabasico.capitulo3;

//import java.util.*; //Importa todo lo que hay en java.util, resulta ineficiente.
import java.util.Random;

/**
 * 
 * @author Guille
 *
 */

public class Capitulo3 {

	int var1;
	float var2;
	Random var3;
	static String var4;
	static String var5 = "Esto es un String";

	public static void main(String[] args) {
		System.out.println("Estoy aprendiendo a programar Java");
	}

	// Constructor

	void Capitulo3() {
		var1 = 10;
		var2 = 1.0f;
		
	}

	// Funciones

	public void mostrarTexto(String texto) {
		System.out.println("Me has mandado el texto: " + texto);
	}

	public void mostrarRandom() {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}
