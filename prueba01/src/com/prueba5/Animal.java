package com.prueba5;

public class Animal {
	
	protected String species;
	protected boolean canHop;
	protected boolean canSwim;
	protected boolean canBark = false;
	
	protected Animal() {
		this("", true, false);
	}
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
//		this();
		this.species = speciesName;
		this.canHop = hopper;
		this.canSwim = swimmer;

		
	}
	
	public boolean canHop() {
		System.out.println("Llamando a Animal canHop");
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}

	@Override
	public String toString() {
		super.toString();
		return species;
	}
	
	protected Animal devuelveme() {
		return new Animal();
	}
	
	private void metodoPrivado() {
		System.out.println("Soy un metodo privado de Animal");
	}
	
	public static void comer() {
		System.out.println("Animal come");
	}
	
	public final void metodoFinal() {
		System.out.println("Metodo final");
	}

}
