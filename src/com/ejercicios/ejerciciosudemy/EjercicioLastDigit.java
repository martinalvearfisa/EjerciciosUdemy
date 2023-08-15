package com.ejercicios.ejerciciosudemy;

public class EjercicioLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioLastDigit utils = new EjercicioLastDigit();

		System.out.println(utils.getLastDigit(1234)); // Output: 4
		System.out.println(utils.getLastDigit(90)); // Output: 0
		System.out.println(utils.getLastDigit(9)); // Output: 9
		System.out.println(utils.getLastDigit(0)); // Output: 0
		System.out.println(utils.getLastDigit(-67)); // Output: -1
	}

	public int getLastDigit(int number) {
		// Write your code here
		int lastDigit = 0;
		if (number == 0) {
			return 0;
		} else if (number < 0) {
			return -1;
		} else {
			lastDigit = number % 10;
		}
		return lastDigit;
	}
}
