package com.sopra.javabasico.capitulo4;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio09 {

	public static void main(String[] args) {
		if (args.length == 1) {//Tiene solo 1 argumento?
			int month = Integer.parseInt(args[0]);
			if ( 13 > month && month > 0) {//Corresponde a un mes?
				System.out.println(Month.of(month) + " tiene " + Month.of(month).length(LocalDate.now().isLeapYear()) + " dias");//Es bisiesto?
			}else {
				System.out.println(month + " no corresponde a ningún mes");
			}
		}else {
			System.out.println("Datos no validos");
		}
	}
}
