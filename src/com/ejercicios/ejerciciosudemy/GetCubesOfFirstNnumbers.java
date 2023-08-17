package com.ejercicios.ejerciciosudemy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetCubesOfFirstNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCubesOfFirstNNumbers(5));

	}

	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		// Write your code here
		return IntStream.range(1, n + 1).map(number -> number * number * number).boxed().collect(Collectors.toList());

	}

}
