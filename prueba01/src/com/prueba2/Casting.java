package com.prueba2;

public class Casting {

	public static void main(String[] args) {
//		int x = (int)1.99;
//		short y = (short)1921222;
//		int z = (int)91;
//		long t = 192301398193810323L;

//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(z);
//		System.out.println(t);

//		short a = 10, b = 3;
//		short c = (short)(a * b);

//		System.out.println(c);
//
//		long r = 5;
//		long e = (r = 3);
//
//		System.out.println(r);
//		System.out.println(e);

//		int x = 10, y = 20, z = 10;
//		System.out.println(x < y);//true
//		System.out.println(x <= y);//true
//		System.out.println(x >= z);//true
//		System.out.println(x > z);//false

//		String str = "";
//		System.out.println(str instanceof String);

//		boolean x = false, y = false;
//		System.out.println(x & y);
//		System.out.println(x | y);
//		System.out.println(x ^ y);
//		Integer y = null;
//		boolean x = (y < 4) || true;
//		System.out.println(x);
		
//		int x = 6;
//		boolean y = (x >=6) && (++x < 7);
//		System.out.println(y);
		
//		System.out.println(5 == 5.0);
//		boolean y = false;
//		boolean x = (y == false);
//		System.out.println(x);
		
//		File x = new File("/autoexec.bat");
//		File y = new File("/autoexec.bat");
//		File z = x;
//		System.out.println(x == y);
//		System.out.println(x == z);
		
		Persona p1 = new Persona("Aitor", 20, "12345F");
		Persona p2 = new Persona("Aitor", 20, "12345F");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
