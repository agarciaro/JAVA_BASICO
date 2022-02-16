package com.sopra.javabasico.capitulo3;

import java.util.Random;

/**
 * 
 * @author marcojoseruedaaguila
 * @version 1.0
 */

public class Capitulo3 {
	
	
	private int numCapitulo;
	private char idCiudad;
	private Random numAleatorio;
	private boolean isTrue;
	
	//---VARIABLES DE CLASE-----
	private static String nombreCapitulo;
	private static String esString = "Esto es una string";
	
	
	
	//----CONSTRUCTORES----
	
	public Capitulo3 () {}
	
	public Capitulo3(int numCapitulo, char idCiudad, Random numAleatorio) {
		super();
		this.numCapitulo = numCapitulo;
		this.idCiudad = idCiudad;
		this.numAleatorio = numAleatorio;
	}
	
	//----BLOQUES INICIALIZADORES DE INSTANCIAS-----
	{System.out.println("Inicializador de instancia");}
	{System.out.println(numCapitulo);}
		
	
	public void iniciarInstancia2()
	{
		
		System.out.println(numCapitulo);
		
	}
	
	
	




	//---MÉTODO MAIN----
	public static void main(String[] args) {
		
		if(args.length != 0) {
		System.out.println("Me has mandado el texto: " + args[0]); 
		}
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
		
		System.gc();

		
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	//---OVERRIDE IMPLEMENT METHODS - FINALIZE
	
	
	

}
