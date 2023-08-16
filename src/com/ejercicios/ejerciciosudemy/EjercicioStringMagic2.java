package com.ejercicios.ejerciciosudemy;

public class EjercicioStringMagic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioStringMagic2 prueba = new EjercicioStringMagic2();
		System.out.println(prueba.hasConsecutiveDuplicates("hello"));
		System.out.println(prueba.hasConsecutiveDuplicates("helo"));
	}

	public boolean hasConsecutiveDuplicates(String str) {

		// TODO: Write your code here
		if (str.isEmpty() || str.length() == 1) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			char nextChar = str.charAt(i + 1);
			if (c == nextChar) {
				return true;
			}
		}

		return false;
	}
}
