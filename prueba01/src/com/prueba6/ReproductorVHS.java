package com.prueba6;

public class ReproductorVHS implements ReproductorVideo {

	@Override
	public void reproducir(Cancion cancion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void expulsar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void avanzar(int segundos) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cancion buscar(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipoReproductor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modificarBrillo(int lms) {
		// TODO Auto-generated method stub
		return ReproductorVideo.super.modificarBrillo(lms);
	}
	
	

}
