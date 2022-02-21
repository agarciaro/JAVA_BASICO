package com.sopra.javabasico.capitulo6;

public class Bicicleta {
	//color, número de marchas, velocidad actual, marcha actual.
	private String color;
	private int numMarchas;
	private double velocidadActual;
	private int marchaActual;
	
	// creamos dos objetos luz
	 Luz luzDelantera ;
	 Luz luzTrasera ;

	
	
	
	public Bicicleta(String color, int numMarchas, double velocidadActual, int marchaActual, Luz luzDelantera, Luz luzTrasera) {
		this.color = color;
		this.numMarchas = numMarchas;
		this.velocidadActual = velocidadActual;
		this.marchaActual = marchaActual;
		this.luzDelantera = luzDelantera;
		this.luzTrasera = luzTrasera;
	}
	
	//devuelve lo contrario al estado en el que estan las luces
	
	public void enecenderApagarLuces (boolean delante , boolean detras) {
		//delante = !delante;
		//detras = !detras;
		luzDelantera.setEstado(!delante);
		luzTrasera.setEstado(!detras);
		System.out.println("la luz delantera esta en modo " + luzDelantera.isEstado()+ " y la luz trasera esta en modo " +luzTrasera.isEstado());
		
	}


	//Arrancar la bici pondrá la marcha actual y la velocidad a 1.
	public void arrancar() {
		setVelocidadActual(1);
		setMarchaActual(1);
		System.out.println("La marcha actual es: "+getMarchaActual()+ " y la velocidad actual es: " +getVelocidadActual());
	}
	
	public void acelerar() {
		double velocidad = getVelocidadActual() + 9 ;
		setVelocidadActual(velocidad);
		System.out.println("ha acelerado hasta: "+velocidad);
	}
	
	//Frenar disminuirá la velocidad actual.
	public void frenar() {
		double velocidad2 = getVelocidadActual() - 2.3 ;
		if(velocidad2 >= 0) {
			setVelocidadActual(velocidad2);
		}else {
			setVelocidadActual(0);
		}
		
		System.out.println("ha frenado hasta: "+getVelocidadActual());
	}
	
	public void marcha(boolean cambioMarcha) {
		//true aumenta la velocidad y false disminuye
		if(cambioMarcha == true) {
			if(getMarchaActual() < 6) {
				setMarchaActual(getMarchaActual()+1);
			}else {
				setMarchaActual(6);
			}
			
		}else {
			if(getMarchaActual() > 1) {
				setMarchaActual(getMarchaActual()-1);

			}else {
				setMarchaActual(1);
			}
			
		}
		System.out.println("La marcha actual es "+getMarchaActual());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	public Luz getLuzDelantera() {
		return luzDelantera;
	}

	public void setLuzDelantera(Luz luzDelantera) {
		this.luzDelantera = luzDelantera;
	}

	public Luz getLuzTrasera() {
		return luzTrasera;
	}

	public void setLuzTrasera(Luz luzTrasera) {
		this.luzTrasera = luzTrasera;
	}

	public static void main(String[] args) {
		
		// damos valores a las luces 
		Luz luz1 = new Luz("rojo", false, 75);
		Luz luz2 = new Luz("azul", true, 75);
		
		//creamos una bici y las luces que tiene
		Bicicleta bici1 = new Bicicleta("rosa", 6, 30, 5, luz1, luz2);
		
		// a esa bici le cambiamos el estado de las luces
		bici1.enecenderApagarLuces(luz1.isEstado(), luz2.isEstado());
		//arrancar la bici los pone a 1
		bici1.arrancar();	
		bici1.acelerar();
		bici1.acelerar();
		bici1.frenar();
		bici1.frenar();
		bici1.frenar();
		bici1.marcha(true);
		bici1.marcha(true);
		bici1.marcha(true);
		bici1.marcha(true);
		bici1.marcha(true);
		bici1.marcha(true);
		bici1.marcha(true);


		
	}

	
	

}
