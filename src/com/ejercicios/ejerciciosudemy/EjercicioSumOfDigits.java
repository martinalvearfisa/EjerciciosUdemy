package com.ejercicios.ejerciciosudemy;

public class EjercicioSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioSumOfDigits utils = new EjercicioSumOfDigits();

		System.out.println(utils.getSumOfDigits(123)); // Output: 6
		System.out.println(utils.getSumOfDigits(90)); // Output: 9
		System.out.println(utils.getSumOfDigits(5)); // Output: 5
		System.out.println(utils.getSumOfDigits(0)); // Output: 0
		System.out.println(utils.getSumOfDigits(-67)); // Output: -1
	}

	public int getSumOfDigits(int number) {
		// Write your code here
		int sum = 0;
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 0;
		} else {
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			return sum;
		}
	}

}
