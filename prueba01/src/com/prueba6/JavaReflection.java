package com.prueba6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class JavaReflection {
	
	public static final String NOMBRE_CLASE = "com.prueba6.ReproductorDisco";
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Cancion cancion = new Cancion();
		System.out.println(cancion.getClass());
		
		Class<?> clazz = Class.forName(NOMBRE_CLASE);
		System.out.println(clazz.getName());
		
		int modificadores = clazz.getModifiers();
		System.out.println("Es publica? " + Modifier.isPublic(modificadores));
		System.out.println("Es abstracta? " + Modifier.isAbstract(modificadores));
		
		Package paquete = clazz.getPackage();
		System.out.println(paquete.getName());
		
		Constructor<?>[] constructores = clazz.getConstructors();
		
		for (Constructor<?> constructor : constructores) {
			System.out.println(constructor.toString());
		}
		
//		Cancion cancionPorReflexion = (Cancion) constructores[0].newInstance();
//		
//		System.out.println(cancionPorReflexion.getTitulo());
		
		ReproductorMusica reproductor = (ReproductorMusica) constructores[0].newInstance();
				
	}
}
