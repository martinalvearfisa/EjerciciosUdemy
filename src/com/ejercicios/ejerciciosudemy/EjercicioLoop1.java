package com.ejercicios.ejerciciosudemy;

public class EjercicioLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioLoop1 calculator = new EjercicioLoop1();

		System.out.println(calculator.calculateFactorial(5)); // Output: 120
		System.out.println(calculator.calculateFactorial(4)); // Output: 24
		System.out.println(calculator.calculateFactorial(3)); // Output: 6
		System.out.println(calculator.calculateFactorial(2)); // Output: 2
		System.out.println(calculator.calculateFactorial(1)); // Output: 1
		System.out.println(calculator.calculateFactorial(0)); // Output: 1
		System.out.println(calculator.calculateFactorial(-5)); // Output: -1
	}

	public int calculateFactorial(int number) {
		// Write your code here
		int factorial = 1;// empieza en 1 ya que !0=1
		if (number < 0) {
			return -1;
		}
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
