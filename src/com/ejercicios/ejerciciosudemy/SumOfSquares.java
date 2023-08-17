package com.ejercicios.ejerciciosudemy;

import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3);
		System.out.println(sumOfSquares(numbers));
	}

	public static long sumOfSquares(List<Integer> numbers) {

		// Check if the list is null. If so, return 0.

		// Stream over the list of numbers, find squares and sum them up
		if (numbers == null) {
			return 0;
		}
		return numbers.stream().mapToLong(num -> num * num).sum();
	}
}
