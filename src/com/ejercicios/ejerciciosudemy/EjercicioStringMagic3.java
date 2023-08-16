package com.ejercicios.ejerciciosudemy;

public class EjercicioStringMagic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioStringMagic3 prueba = new EjercicioStringMagic3();
		System.out.println(prueba.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges"));
		System.out.println(prueba.getRightmostDigit("There are no numbers in this string"));
		System.out.println(prueba.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges7"));
	}

	public int getRightmostDigit(String str) {

		// TODO: Write your code here

		if (str.isEmpty()) {
			return -1;
		}
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				return Character.getNumericValue(c);
			}

		}
		return -1;

	}
}
