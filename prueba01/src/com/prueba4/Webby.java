package com.prueba4;

public class Webby {
	
	public Integer num = 3;
	
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name);
		Webby w = new Webby();
		w.webby(w);
		System.out.println(w.num);
	}
	
	public static void speak(StringBuilder s) {
		s.append("Webby");
	}
	
	public void webby(final Webby webbo) {
//		webbo = new Webby();
		webbo.num = 5;
	}

}
