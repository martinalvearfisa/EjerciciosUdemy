package com.ejercicios.ejerciciosudemy;

public class EjercicioArrayMagicFoundTheSecondLargestElementInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 6, 5, 7, 3 };
		EjercicioArrayMagicFoundTheSecondLargestElementInAList prueba = new EjercicioArrayMagicFoundTheSecondLargestElementInAList();
		System.out.println(prueba.findSecondLargestElement(array));

	}

	public int findSecondLargestElement(int[] array) {
		// TODO: Write your code here
		if (array.length < 2) {
			return -1;
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int element : array) {
			if (element > largest) {

				secondLargest = largest;
				largest = element;
			} else if (element > secondLargest && element != largest) {
				secondLargest = element;

			}

		}
		if (secondLargest == Integer.MIN_VALUE) {
			return -1;
		}

		return secondLargest;

	}

}
