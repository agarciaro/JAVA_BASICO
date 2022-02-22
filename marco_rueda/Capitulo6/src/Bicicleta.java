
public class Bicicleta {
	
	//color, número de marchas, velocidad actual, marcha actual.
	
	private String color;
	private final int NUM_MARCHAS = 6; 
	private int marchaActual = 0;
	private float velocidad = 0.0f;
	private Luz luzDelantera, luzTrasera;
	
	
	
	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}



	public Bicicleta(String color, int numMarchas, int marchaActual, float velocidad) {
		super();
		this.color = color;
		this.numMarchas = numMarchas;
		this.marchaActual = marchaActual;
		this.velocidad = velocidad;
	}

	//SETTERS

	public void setColor(String color) {
		this.color = color;
	}



	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}



	public void subirMarcha() {
		if(marchaActual < NUM_MARCHAS) 
		{ this.marchaActual += 1; }
		else {
			System.out.println("No puedes poner esta marcha a tu bicicleta");
		}
	}
	
	public void bajarMarcha() {
		if(marchaActual > 0) 
		{ this.marchaActual -= 1; }
		else {
			System.out.println("No puedes poner esta marcha a tu bicicleta");
		}
	}


	//GETTERS

	public String getColor() {
		return color;
	}



	public int getNumMarchas() {
		return numMarchas;
	}



	public int getMarchaActual() {
		return marchaActual;
	}



	public float getVelocidad() {
		return velocidad;
	}
	
	//ARRANCAR BICI
	
	public void arrancar () {
		
		this.velocidad = 1;
		this.marchaActual = 1;
	}
	
	public void acelerar (int kms) {
		
		this.velocidad += kms;
		
	}
	
	public void frenar (int kms) {
		
		this.velocidad -= kms;
		
	}
	
	
	

}
