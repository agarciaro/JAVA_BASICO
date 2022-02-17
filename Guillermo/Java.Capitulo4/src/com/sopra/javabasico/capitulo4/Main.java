package com.sopra.javabasico.capitulo4;


import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		int[] vec = { 3, 5, 6, 6, 8, 9, 12, 16, 18 };
		System.out.println(VectorUtil.busquedaNum(vec, 12));

	}

}
