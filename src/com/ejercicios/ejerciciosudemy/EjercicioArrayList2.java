package com.ejercicios.ejerciciosudemy;

import java.util.ArrayList;
import java.util.List;

public class EjercicioArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> determineMultiples(int number, int limit) {

		List<Integer> multiples = new ArrayList<>();
		// TODO: Write your code here
		if (number <= 0 || limit <= 0) {
			return new ArrayList<>();
		}

		for (int i = 1; i * number < limit; i++) {

			multiples.add(i * number);

		}
		return multiples;
	}
}
