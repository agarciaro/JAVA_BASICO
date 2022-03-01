package com.sopra.spring.model;

public class Jefe extends Empleado{
	
	@Override
	public String getTarea() {
		return "Tarea del jefe";
	}
}
