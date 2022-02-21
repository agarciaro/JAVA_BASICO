package com.prueba5;

public class Perro extends Animal {
	
	private boolean canBark= true;
	
	public Perro() {
		super();
	}

	public Perro(boolean canBark, String speciesName, boolean hopper, boolean swimmer) {
//		super();
		super(speciesName, hopper, swimmer);
		this.canBark = canBark;
	}
	
	public Perro(boolean canBark, Animal animal) {
		super(animal.species,animal.canHop, animal.canSwim);
		this.canBark = canBark;
	}
	
	@Override
	public boolean canHop() {
		super.canHop();
		System.out.println("Llamando a Perro canHop");
		return false;
	}
	
	public boolean getCanBark() {
		return super.canBark;
	}

	@Override
	public Perro devuelveme() {
		// TODO Auto-generated method stub
		return new Perro(true, super.devuelveme());
	}
	
//	@Override
	public void metodoPrivado() {
		
		System.out.println("Soy un método de la clase Perro");
	}
	
//	@Override
	public static void comer() {
//		Animal.comer();
		System.out.println("El perro come");
	}
	
	

}
