package com.sopra.javabasico.capitulo5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Ejercicio02 {

	public static void main(String[] args) {

		String nombre = "Gabriel", apellido1 = "Chaparro", apellido2 = "Villaescusa";
		
		StringBuilder b = new StringBuilder();
		
		System.out.println(nombre.concat(apellido1).concat(apellido2));
		System.out.println(b.append(nombre).append(apellido1).append(apellido2));
		
		b = new StringBuilder();
		
		System.out.println(b.append(nombre.subSequence(0, 1)).append(apellido1.subSequence(0, 1)).append(apellido2.toUpperCase().subSequence(apellido2.length()-1, apellido2.length())));
		
		
		List list = new ArrayList<>(); //Comprobar trigramas con otras personas
		
		
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM", Locale.FRENCH);
		System.out.println(ahora.format(format));
		
		String fecha = "2022-02-17";
		
		DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fechaLocal = LocalDate.parse(fecha);
		System.out.println(fechaLocal.format(fechaFormato));
		
		

		

	}

}
