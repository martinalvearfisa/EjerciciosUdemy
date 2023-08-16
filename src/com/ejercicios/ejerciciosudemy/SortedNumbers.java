package com.ejercicios.ejerciciosudemy;

public class SortedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 5 };
		int[] array2 = { 1, 4, 3, 5 };
		SortedNumbers prueba = new SortedNumbers();
		System.out.println(prueba.isSorted(array));
		System.out.println(prueba.isSorted(array2));

	}

	public boolean isSorted(int[] array) {

		// TODO: Write code here
		if (array.length <= 1) {
			return true;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;

	}
}
