package com.prueba3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM", Locale.FRENCH);
		System.out.println(ahora.format(format));
		
		String fecha = "2022-02-17";
		DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate fechaLocal = LocalDate.parse(fecha, fechaFormato);
		System.out.println(fechaLocal);
		fechaLocal.minusDays(2);
	}

}
