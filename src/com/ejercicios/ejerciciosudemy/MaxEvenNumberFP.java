package com.ejercicios.ejerciciosudemy;

import java.util.List;
import java.util.Optional;

public class MaxEvenNumberFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 78, 56, 23, 6);
		System.out.println(findMaxEvenNumber(numbers));

	}

	public static int findMaxEvenNumber(List<Integer> numbers) {
		// Write your code here
		if (numbers == null) {
			return 0;
		}
		Optional<Integer> maxEven = numbers.stream().filter(number -> number % 2 == 0).max(Integer::compare);

		return maxEven.orElse(0);

	}
}
