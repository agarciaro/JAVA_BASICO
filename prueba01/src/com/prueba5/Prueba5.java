package com.prueba5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Prueba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona c1 = Persona.getInstance();
//		c1.setNombre("nombre");
//		c1.setApellidos("apellido");
//		System.out.println(Persona.edadEstatica);
		
//		Persona p2 = new Persona("Aitor");
//		
//		System.out.println(Persona.getInstance().getNombre());
		
//		PersonaNoInmutable pni = new PersonaNoInmutable(new StringBuilder("Aitor"));
//		System.out.println(pni.getNombre().toString());
//		pni.getNombre().append(" García");
//		System.out.println(pni.getNombre().toString());
		
//		PatronSingleton singleton = PatronSingleton.getInstance();
//		PatronSingleton singleton2 = PatronSingleton.getInstance(0);
//		PatronSingleton singleton3 = PatronSingleton.getInstance(1);
//		
//		System.out.println(singleton);
//		System.out.println(singleton2);
//		System.out.println(singleton3);
//		
//		singleton.setNombre("Pepe");
//		System.out.println(singleton.getNombre());
//		System.out.println(singleton2.getNombre());
//		System.out.println(singleton3.getNombre());
//		
//		PatronBuilder p = new PatronBuilder()
//							.setNombre("Aitor")
//							.setEdad(8)
//							.setApellidos("Garcia");
		
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Animal("cebra", true, true));
		listaAnimales.add(new Animal("ñu", true, true));
		listaAnimales.add(new Animal("cocodrilo", false, true));
		
//		listCannotHop(listaAnimales);
		
//		listaAnimales.stream()
////			.forEach((Animal a) -> {
////				if(a.canHop() == false) {
////					System.out.println(a);
////				}
////			});
//		.forEach(a -> {
//			if(a.canHop() == false) {
//				System.out.println(a);
//			}
//		});
		
		List<Animal> listaCannotHop =  listaAnimales.stream().filter(animal -> !animal.canHop()).collect(Collectors.toList());;
		
		for (Animal animal2 : listaCannotHop) {
			System.out.println(animal2);
		}
		
		
//		boolean puedeSaltar = true;
//		a -> a.canHop() == puedeSaltar
		// (a, b) -> {int a = 5; return 0;}
		
		
		List<Float> precios = Arrays.asList(1.20f, 4.55f, 6f, 3f);
		List<Float> preciosMasIVA;
		List<Float> paresIncrementoImparesDecremento;
		
		preciosMasIVA = precios.stream().map(p -> (float) p * 1.25f).collect(Collectors.toList());
		System.out.println(preciosMasIVA);
		
		paresIncrementoImparesDecremento = precios.stream().map((Float p) -> p % 2 == 0?p*1.25f:p*0.75f).collect(Collectors.toList());
		System.out.println(paresIncrementoImparesDecremento);
	}
	
	public static void listCannotHop(List<Animal> lista) {
		for (Animal animal : lista) {
			if(animal.canHop() == false) {
				System.out.println(animal);
			}
		}
	}
	
	// () -> true
	// a -> a.cannotHop()
	// (Animal a) -> {return a.cannotHop();}
	//(String a, String b) -> a.startsWith("start") && b.endsWith("end")
}
