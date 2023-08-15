package com.ejercicios.ejerciciosudemy;

public class EjercicioSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioSwitch1 myChar = new EjercicioSwitch1();

		System.out.println(myChar.isVowel('A')); // Output: true
		System.out.println(myChar.isVowel('b')); // Output: false
		System.out.println(myChar.isVowel('E')); // Output: true
		System.out.println(myChar.isVowel('f')); // Output: false
	}

	public boolean isVowel(char ch) {

		// Use a switch statement to check for each vowel, both lowercase and uppercase
		switch (ch) {
		case 'A', 'E', 'I', 'O', 'U':
			return true;
		case 'a', 'e', 'i', 'o', 'u':
			return true;
		default:
			return false;

		// TODO: Complete the switch statement
		}

	}
}
