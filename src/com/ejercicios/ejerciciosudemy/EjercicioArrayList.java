package com.ejercicios.ejerciciosudemy;

import java.util.ArrayList;
import java.util.List;

public class EjercicioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioArrayList nm = new EjercicioArrayList();

		System.out.println(nm.determineAllFactors(6)); // Prints: [1, 2, 3, 6]
		System.out.println(nm.determineAllFactors(12)); // Prints: [1, 2, 3, 4, 6, 12]
		System.out.println(nm.determineAllFactors(15)); // Prints: [1, 3, 5, 15]
	}

	public List<Integer> determineAllFactors(int number) {

		// TODO: Write your code here
		if (number <= 0) {
			return new ArrayList<>();
		}
		List<Integer> factors = new ArrayList<>();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

}
