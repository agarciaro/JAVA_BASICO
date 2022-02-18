package com.prueba4;

public class Goose extends Bird {

	public Goose() {
		super("hola");
	}

	public Goose(String text) {
		super(text);
		System.out.println("Constryuendo Goose");
	}



	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
		helpOtherGooseSwim();
	}

	private void helpOtherGooseSwim() {
		Bird other = new Goose();
		other.floatInWater(); // DOES NOT COMPILE
		System.out.println(other.text); // DOES NOT COMPILE
	}

	@Override
	protected void floatInWater() {
		super.floatInWater();
	}
	
	

}
