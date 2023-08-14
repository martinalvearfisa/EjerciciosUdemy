package com.ejercicios.ejerciciosudemy;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio7 prueba = new Ejercicio7();
		System.out.println(prueba.calculateSumOfSquares(3));
	}

	public long calculateSumOfSquares(int n) {
		// write your code here
		int sum = 0;
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				sum += i * i;

			}
			return sum;
		} else {
			return -1;
		}
	}

}
