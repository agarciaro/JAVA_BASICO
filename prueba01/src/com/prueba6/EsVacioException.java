package com.prueba6;

public class EsVacioException extends Exception {
	private static final long serialVersionUID = -8122822676606557607L;

	static final int CODIGO_ERROR = 100;
	
	public EsVacioException(String msg) {
		super("Error(" + CODIGO_ERROR + "): " + msg);
	}
	
	
}
