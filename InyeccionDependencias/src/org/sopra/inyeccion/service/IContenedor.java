package org.sopra.inyeccion.service;

import org.sopra.inyeccion.exception.BeanNoEncontradoException;
import org.sopra.inyeccion.model.IEmpleado;

public interface IContenedor {

	IEmpleado getEmpleado(String clave) throws BeanNoEncontradoException;

}