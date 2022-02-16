package com.prueba2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
	public static void main(String[] args) {
		int[] numbers1 = new int[3];
		numbers1[0] = 23;
		numbers1[1] = 21;
		numbers1[2] = 56;

		int[] numbers2 = new int[] { 23, 21, 56 };

		int numbers3[] = { 23, 21, 56 };

		int[] numbers4 = numbers2;
		System.out.println(numbers4 == numbers2);
		System.out.println(numbers2);
		System.out.println(numbers4);

		int[] numbers = { 6, 9, 1 };
		java.util.Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.printf("\n%d es mayor a %d\n", 4, 1);

		System.out.println(java.util.Arrays.binarySearch(numbers, 5));
		
//		ArrayList<String> list1 = new ArrayList<String>();
//		List<Integer> list2 = new ArrayList<>();
//		
//		list2.add(50);
//		
//		list1.add("hola");
//		list1.add("hola2");
//		list1.add("hola3");
//		list1.add(0, "adios");
//		list1.remove(0);
//		list1.set(0, "buenas tardes");
//		list1.get(2);
//		list1.isEmpty();
//		list1.size();
//		list1.clear();
//		list1.contains("buenas tardes");
//		list1.equals(list2);
	
		
		List<String> list = new ArrayList<>();
		list.add("hola");
		list.add("adios");
		
		String[] array = list.toArray(new String[0]);
		
		Collections.sort(list);
		System.out.println(list);
	}

	public static void varargs1(String[] args) {

	}

	public static void varargs2(String args[]) {

	}

	public static void varargs3(String... args) {

	}
}
