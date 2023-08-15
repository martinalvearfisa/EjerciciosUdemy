package com.ejercicios.ejerciciosudemy;

public class EjercicioReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioReverseNumber number = new EjercicioReverseNumber();
		System.out.println(number.reverseNumber(5555));
		System.out.println(number.reverseNumber(1234));
		System.out.println(number.reverseNumber(5432));
		System.out.println(number.reverseNumber(321));
		System.out.println(number.reverseNumber(123));

	}

	public int reverseNumber(int number) {
		// TODO: Write your code here
		int reversedNumber = 0;
		int lastDigit = 0;
		if (number == 0) {
			return 0;
		} else if (number < 0) {
			return -1;
		} else {
			while (number != 0) {
				lastDigit = number % 10;
				number /= 10;
				reversedNumber = reversedNumber * 10 + lastDigit;
			}
			return reversedNumber;
		}

	}

}
