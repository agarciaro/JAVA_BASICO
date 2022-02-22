
public class Luz {
	
	private String color;
	private boolean encendida = false;
	private int nivelBateria;
	

	public Luz() {
		// TODO Auto-generated constructor stub
	}
	
	//SETTERS Y GETTERS

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isEncendida() {
		return encendida;
	}


	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}


	public int getNivelBateria() {
		return nivelBateria;
	}


	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	
	//APAGAR O ENCENDER LUCES
	
	public void cambiarEstado () {
		
		encendida = !encendida;
		if(encendida) System.out.println("La luz se ha encendido");
		else System.out.println("Luz apagada");
		
	}
	

}
