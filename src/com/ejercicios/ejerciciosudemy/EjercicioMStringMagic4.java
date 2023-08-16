package com.ejercicios.ejerciciosudemy;

public class EjercicioMStringMagic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioMStringMagic4 prueba = new EjercicioMStringMagic4();
		System.out.println(prueba.findLongestWord("A quick brown fox jumps over the lazy dog"));
		System.out.println(prueba.findLongestWord("Java is an object oriented programming language"));
	}

	public String findLongestWord(String sentence) {

		// TODO: Write your code here
		if (sentence.isEmpty()) {
			return "";
		}
		String[] words = sentence.split(" ");

		String longestWord = "";
		int maxLength = 0;

		for (String word : words) {
			if (word.length() > maxLength) {
				longestWord = word;
				maxLength = word.length();
			}
		}
		return longestWord;
	}
}
