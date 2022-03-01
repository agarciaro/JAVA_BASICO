package org.sopra.inyeccion.service;

import java.util.HashMap;
import java.util.Map;

import org.sopra.inyeccion.exception.BeanNoEncontradoException;
import org.sopra.inyeccion.model.Director;
import org.sopra.inyeccion.model.IEmpleado;
import org.sopra.inyeccion.model.Jefe;

public class Contenedor implements IContenedor {
	
	private Map<String, IEmpleado> beans = new HashMap<>();
	
	public Contenedor() {
		init();
	}

	private void init() {
		beans.put("jefe", new Jefe());
		beans.put("director", new Director());
	}
	
	@Override
	public IEmpleado getEmpleado(String clave) throws BeanNoEncontradoException {
		IEmpleado e = beans.get(clave);
		if(e == null) {
			throw new BeanNoEncontradoException("La clave " + clave + " no ha sido encontrada en el contenedor");
		}
		return e.getInstancia();
	}
	
}
