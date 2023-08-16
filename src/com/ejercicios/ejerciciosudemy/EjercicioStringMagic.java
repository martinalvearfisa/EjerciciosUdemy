package com.ejercicios.ejerciciosudemy;

public class EjercicioStringMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioStringMagic stringMagic = new EjercicioStringMagic();
		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
		System.out.println(uppercaseLetters);
	}

	public int countUppercaseLetters(String str) {
		// Initialize a counter to 0.
		int count = 0;

		// Edge case: if the string is empty, return 0.
		if (str.isEmpty()) {
			return count;
		}

		// Loop over each character in the string.
		for (int i = 0; i < str.length(); i++) {
			// Get the current character.
			char c = str.charAt(i);

			// If the current character is an uppercase letter, increment the counter.
			if (Character.isUpperCase(c)) {
				count++;
			}
		}

		// Edge case: if the string does not contain any uppercase letters, return 0.
		// This is implicitly handled as the count would remain 0 if no uppercase letter
		// is found.

		// Return the number of uppercase letters found.
		return count;
	}
}
