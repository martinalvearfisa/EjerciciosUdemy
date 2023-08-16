package com.ejercicios.ejerciciosudemy;

public class EjercicioArrayMagic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 12, 3, 4, 5 };
		EjercicioArrayMagic3 prueba = new EjercicioArrayMagic3();
		System.out.println(prueba.reverseArray(array));

	}

	public int[] reverseArray(int[] array) {

		// TODO: Write your code here
		int start = 0;
		int end = array.length - 1;
		int[] reversedArray = new int[array.length];

		if (array.length <= 1) {
			return array;
		}

		while (start <= end) {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];

			start++;
			end--;
		}
		return reversedArray;

	}
}
