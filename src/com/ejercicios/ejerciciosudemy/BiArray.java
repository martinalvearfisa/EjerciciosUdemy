package com.ejercicios.ejerciciosudemy;

public class BiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 5 };
		BiArray prueba = new BiArray(array1, array2);
		System.out.println(prueba.areSumsEqual());

	}

	private int[] array1;
	private int[] array2;

	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		// TODO: Write the code to compare the sums of the arrays and return the result.
		return sum1 == sum2;

	}

	private int calculateSum(int[] array) {

		// TODO: Write the code to calculate the sum of the array.
		int sum = 0;
		for (int elements : array) {
			sum += elements;
		}
		return sum;
	}

}
