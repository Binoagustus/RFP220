package com.dayTwelvePractice;

public class GenericMaximumArray {

	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}

	public <T extends Comparable<T>> void findMax(T[] inputArray) {

		T[] array = inputArray;
		T max = array[0];

		for (int i = 0; i < inputArray.length; i++) {
			if (array[i].compareTo(max) > 0) {
				max = array[i];
			}
		}
		System.out.println(" Maximum value is " + max);
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		String[] stringArray = { "Apple", "Peach", "Banana" };
		Float[] floatArray = { 1.01f, 2.01f, 5.05f };

		GenericMaximumArray obj = new GenericMaximumArray();
		GenericMaximumArray.toPrint(intArray);
		GenericMaximumArray.toPrint(doubleArray);
		GenericMaximumArray.toPrint(stringArray);
		GenericMaximumArray.toPrint(floatArray);
		System.out.println("");
		obj.findMax(intArray);
		obj.findMax(doubleArray);
		obj.findMax(stringArray);
		obj.findMax(floatArray);;
	}

}
