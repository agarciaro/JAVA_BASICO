package com.prueba6;

public class Prueba6 {

	public static void main(String[] args) throws NoEsVacioException, EsVacioException {
//		ReproductorDisco disco = new ReproductorDisco();//KAKA
//		ReproductorMP3 mp3 = new ReproductorMP3();//KAKA
//		
//		ReproductorMusica rDisco = new ReproductorDisco();
//		ReproductorMusica rMP3 = new ReproductorMP3();
		
		String palabra = "asds";
		
//		try {
//			palabra = "OK";
//			System.out.println("Abrir Fichero");
//			System.out.println("Leer fichero");
//			Prueba6.fall();
//			
//			
//			ReproductorMusica reproductor = ImplementacionManager.getReproductor();
//			System.out.println(reproductor.getTipoReproductor());
//		} catch (Exception e) {
//			System.out.println("Error: " + e.getMessage());
//			palabra = "fallo";
//		}finally {
//			System.out.println("Cerrar fichero");
//		}
//		System.out.println(palabra);
		
		try {
			metodoConExcepcion(palabra);
			
		} catch (EsVacioException eve) {
			System.out.println("Excepcion ha ocurrido al ser vacío: " + eve.getMessage());
		} catch (NoEsVacioException  neve) {
			System.out.println("Excepcion ha ocurrido por no ser vacío: " + neve.getMessage());
			throw neve;
		}finally {
			System.out.println("FIN BLOQUE");
//			double l = 9/0;
		}
		
		metodoConExcepcion("");
		

//		ReproductorVideo video = new Reproduct
		
		
		
	}
	
	public static void fall() throws Exception {
//		throw new Exception("Fallo al invocar fall");
	}
	
	public static void metodoConExcepcion(String vacio) throws NoEsVacioException, EsVacioException {
		if(!vacio.isEmpty()) {
			throw new NoEsVacioException("NO VACIO");
		}else {
			throw new EsVacioException("VACIO");
		}
	}

}
