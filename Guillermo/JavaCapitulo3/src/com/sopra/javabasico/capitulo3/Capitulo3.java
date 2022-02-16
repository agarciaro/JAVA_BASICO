package com.sopra.javabasico.capitulo3;

//import java.util.*; //Importa todo lo que hay en java.util, resulta ineficiente.
import java.util.Random;

/**
 * 
 * @author Guille
 * @version 1.0
 */

public class Capitulo3 {


	private static String var4 = "Hola";
	private static String var5 = "Esto es un String";
	
	private int num;
	private float var2;
	private Random var3;


	{
		System.out.println("Este bloque es un inicializador de instancia");
	}

	public static void main(String[] args) {
		System.out.println("Estoy aprendiendo a programar Java");
		if (args.length != 0) {
			System.out.print("Me has mandado el texto: ");
			for (String string : args) {
				System.out.print(args);
			}
		} else {
			System.out.println("No has enviado texto.");
		}
		Random r = new Random();
		Capitulo3 cap = new Capitulo3(0xA, 20f, r);
		System.out.println("var4: " + cap.getVar4() + "\nvar5: " + cap.getVar5() + "\nrandom: " + cap.getVar3().nextInt(6));
		Capitulo3 cap_1 = new Capitulo3(07,5f, r), cap_2 =new Capitulo3(0xF,7.2f,r);
		cap_1 = null;
		cap_2 = null;
		System.gc();
		
	}

	/**
	 * Constructor Capitulo3
	 * 
	 * @param num
	 * @param var2
	 * @param var3
	 */
	public Capitulo3(int num, float var2, Random var3) {
		this.num = num;
		this.var2 = var2;
		this.var3 = var3;
		int local = 1;// Desaparece al acabar el constructor
	}

	// Funciones

	public void mostrarTexto(String texto) {

	}

	public void mostrarRandom() {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}

	public Random getVar3() {
		return var3;
	}

	public static String getVar4() {
		return var4;
	}

	public static String getVar5() {
		return var5;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Instancia recolectada por GC");
	}

	{
		System.out.println(num);// se ejecuta al ejecutar la clase
	}
}
