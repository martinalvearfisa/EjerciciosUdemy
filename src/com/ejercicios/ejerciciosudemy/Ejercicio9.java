package com.ejercicios.ejerciciosudemy;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio9 prueba = new Ejercicio9();
		System.out.println(prueba.isPerfectNumber(6));
		System.out.println(prueba.isPerfectNumber(7));

	}

	public boolean isPerfectNumber(int number) {
		if (number > 0) {
			int sum = 0;
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}
			return sum == number;
		}
		return false;
	}
}
