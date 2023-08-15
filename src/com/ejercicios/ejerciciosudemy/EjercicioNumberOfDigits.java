package com.ejercicios.ejerciciosudemy;

public class EjercicioNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioNumberOfDigits utils = new EjercicioNumberOfDigits();

		System.out.println(utils.getNumberOfDigits(12345)); // Output: 5
		System.out.println(utils.getNumberOfDigits(90)); // Output: 2
		System.out.println(utils.getNumberOfDigits(9)); // Output: 1
		System.out.println(utils.getNumberOfDigits(0)); // Output: 1
		System.out.println(utils.getNumberOfDigits(-67)); // Output: -1
	}

	public int getNumberOfDigits(int number) {
		// Write your code here
		int count = 1;
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 1;
		} else {
			while (number >= 10) {
				number /= 10;
				count++;
			}
			return count;
		}
	}
}
