package com.prueba3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaConsola {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce entrada:");
		String entrada = reader.readLine();
		System.out.println(entrada.toUpperCase());
		reader.close();
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce entrada:");
		String s = in.nextLine();
		System.out.println(s);
		int a = in.nextInt();
		System.out.println(++a);
		in.close();

		
//		String nombre = System.console().readLine();
//		System.out.println(nombre.toUpperCase());

	}

}
