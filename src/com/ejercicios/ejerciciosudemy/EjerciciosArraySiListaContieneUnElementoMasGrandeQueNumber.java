package com.ejercicios.ejerciciosudemy;

public class EjerciciosArraySiListaContieneUnElementoMasGrandeQueNumber {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int number = 3;
		EjerciciosArraySiListaContieneUnElementoMasGrandeQueNumber ejerciciosArraySiListaContieneUnElementoMasGrandeQueNumber = new EjerciciosArraySiListaContieneUnElementoMasGrandeQueNumber(); // Create an instance of the class
		boolean result = ejerciciosArraySiListaContieneUnElementoMasGrandeQueNumber.doesHaveElementGreaterThan(array, number);
		System.out.println("Does the array have an element greater than " + number + "? " + result);
	}

	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		// TODO: Write your code
		for (int arrays : array) {
			if (arrays > number) {
				return true;
			}
		}
		return false;
	}

}
