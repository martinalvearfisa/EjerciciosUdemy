package com.ejercicios.ejerciciosudemy;

public class WordReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordReverser prueba = new WordReverser();
		System.out.println(prueba.reverseWordsInSentence("Hello world"));
	}

	public String reverseWordsInSentence(String sentence) {
		// TODO: Check if the sentence is null.
		// If the sentence is null, return "INVALID"
		if (sentence == null) {
			return "INVALID";
		}

		// TODO: Check if the sentence is empty.
		// If the sentence is empty, return an empty string

		if (sentence.equals("")) {
			return "";
		}

		StringBuilder reversedSentence = new StringBuilder();
		for (String word : sentence.split(" ")) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedSentence.append(reversedWord).append(" ");

		}
		return reversedSentence.toString().trim();

		// TODO: Split the sentence into words using the split method.
		// Use " " as the delimiter to match space.

		// TODO: Create a StringBuilder to hold the reversed sentence.

		// TODO: Loop through each word in the words array.

		// TODO: For each word, create a StringBuilder and reverse the word.
		// Append the reversed word, followed by a space, to the reversed sentence.

		// TODO: After reversing all the words, trim the trailing space and return the
		// reversed sentence.
	}
}
