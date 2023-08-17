package com.ejercicios.ejerciciosudemy;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 5, 7, 9, 6, 4, 5);
		List<Integer> oddNumbers = filterOddNumbers(numbers); // Store the filtered list
		System.out.println("Filtered Odd Numbers: " + oddNumbers);
	}

	public static List<Integer> filterOddNumbers(List<Integer> numbers) {

		// Write your code here
		return numbers.stream().filter(elements -> elements % 2 != 0).collect(Collectors.toList());

	}

}
