package org.sopra.inyeccion;

import org.sopra.inyeccion.model.IEmpleado;
import org.sopra.inyeccion.service.Contenedor;
import org.sopra.inyeccion.service.IContenedor;

public class Aproximacion1 {

	public static void main(String[] args) {
//		Director director = new Director();
//		System.out.println(director.getTarea());
		
//		Jefe jefe = new Jefe();
//		System.out.println(jefe.getTarea());
		
//		Empleado empleado = new Director();
//		System.out.println(empleado.getTarea());
		
//		Empleado empleado = new Jefe();
//		System.out.println(empleado.getTarea());
		
//		IEmpleado empleado = new Jefe();
//		System.out.println(empleado.getTarea());
		
		IContenedor contenedor = new Contenedor();
		
		
		IEmpleado jefe =  contenedor.getEmpleado("jefe");
		System.out.println(jefe.getTarea());
		IEmpleado jefe2 =  contenedor.getEmpleado("jefe");
		System.out.println(jefe2.getTarea());
		System.out.println(jefe + " \n" + jefe2);
		
		IEmpleado director =  contenedor.getEmpleado("director");
		System.out.println(director.getTarea());
		IEmpleado director2 =  contenedor.getEmpleado("director");
		System.out.println(director2.getTarea());
		System.out.println(director + " \n" + director2);
	}

}
