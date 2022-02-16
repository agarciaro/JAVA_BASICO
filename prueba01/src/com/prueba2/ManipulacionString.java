package com.prueba2;

public class ManipulacionString {

	public static void main(String[] args) {
//		String name = "Aitor";
//		System.out.println(name.length());
//		
//		String palabra = new String("Palabra");
//		System.out.println(1 + 2);
//		System.out.println("1" + "2");
//		System.out.println(1 + 2 + "c");
//		System.out.println('C' + 1);
		
//		int three = 3;
//		String four = "4";
//		System.out.println(1 + 2 + three + four);
		
//		String string = "Animales";
//		System.out.println(string.length());
//		System.out.println(string.charAt(0));
//		System.out.println(string.indexOf('a'));
//		System.out.println(string.indexOf('a', 2));
//		System.out.println(string.toLowerCase());
//		System.out.println(string.toUpperCase());
//		System.out.println(string.substring(2));
//		System.out.println(string.substring(2, 3));
//		System.out.println("abc".equals("ABC"));
//		System.out.println("abc".equalsIgnoreCase("ABC"));
//		System.out.println("abc".startsWith("a"));
//		System.out.println("abc".endsWith("c"));
//		System.out.println("abc".contains("b"));
//		System.out.println("abcabc".replace("b", "0"));
//		System.out.println("\t    s abc ".trim());
//		
//		String a = "abc";
//		String b = a.toUpperCase();
//		b = b.replace("B", "2").replace('C', '3');
//		System.out.println("a= " + a);
//		System.out.println("b= " + b);
		
		//StringBuilder
//		System.out.println(System.currentTimeMillis());
//		String alpha = "";
//		for (char current = 'a'; current <= 'z'; current++) {
//			alpha += current;
//		}
//		System.out.println(alpha);
//		System.out.println(System.currentTimeMillis());
//		
//		StringBuilder beta = new StringBuilder();
//		for (char current = 'a'; current <= 'z'; current++) {
//			beta.append(current);
//		}
//		System.out.println(beta);
//		System.out.println(System.currentTimeMillis());
		
//		StringBuilder sb = new StringBuilder("start");
//		sb.append("+middle");
//		StringBuilder same = sb.append("+end");
//		System.out.println(same);
//		
//		StringBuilder a = new StringBuilder("abc");
//		StringBuilder b = a.append("de");
//		b = b.append("f").append("g");
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
		
		StringBuilder sb = new StringBuilder(10);
		sb.append("abcdelkjh");
//		sb.insert(2, "-");
//		System.out.println(sb);
		
//		System.out.println(sb.insert(sb.indexOf("l") + 1, "-"));
		
//		System.out.println(sb.delete(2, 5));
//		System.out.println(sb.reverse());
		
//		String x = "hola";
//		String y = "hola";
//		
//		System.out.println(x == y);
		
		String x = "hola";
		String y = " hola".trim();
		
		System.out.println(x.equals(y));
		
	}

}
