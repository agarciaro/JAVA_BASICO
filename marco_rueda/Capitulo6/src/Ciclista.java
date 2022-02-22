import java.util.ArrayList;
import java.util.List;

public class Ciclista {
	
	private String nombre, ciudad, calle;
	private int numero;
	private boolean usaCasco;
	private List<Bicicleta> bicicletas = new ArrayList();
	
	public Ciclista() {
		super();
	}

	public Ciclista(String nombre, String ciudad, String calle, int numero, boolean usaCasco) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.usaCasco = usaCasco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isUsaCasco() {
		return usaCasco;
	}

	public void setUsaCasco(boolean usaCasco) {
		this.usaCasco = usaCasco;
	}
	
	
	
	
	
	
	
	
	

	

}
