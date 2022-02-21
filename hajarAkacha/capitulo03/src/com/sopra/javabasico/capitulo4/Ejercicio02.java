package com.sopra.javabasico.capitulo4;

public class Ejercicio02 {

	public static void main(String[] args) {
		//****************************************************
		if (args.length == 0) {
		      System.out.println("No hay argumentos");
		    }else {
		    	System.out.println("el numero de argumentos es "+ args.length);
		    }
		//*****************************************************
		 for (String arg: args) {
			 System.out.println(arg);
		 }
		//******************************************************
		 
		 for(int i= 0; args != null && i<args.length ; i++) {
			 System.out.println(args[i]);
		 }
		//********************************************************
		 
		 int i = 0;
		 while(!args[i].equals("fin")) {
			 System.out.println(args[i]);
			 i++;
		 }
		 //*******************************************************
		float num = 3.9f;
		System.out.println((num > 0.0f) ? num : -num);
		
		//*********************************************************
		 
		Rectangulo r = new Rectangulo();
		r.setLado1(0);
		r.setLado2(0);
		System.out.println(r.getArea());
	}
}
	
	class Rectangulo{
		private int lado1, lado2;
		private long area;
		
		public int getLado1() {
			return lado1;
		}
		public void setLado1(int lado1) {
			this.lado1 = lado1;
		}
		public int getLado2() {
			return lado2;
		}
		public void setLado2(int lado2) {
			this.lado2 = lado2;
		}
		public long getArea() {
			return lado1 * lado2;
		}
	}
	
	

