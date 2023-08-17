package com.ejercicios.ejerciciosudemy;

import java.util.Arrays;

public class EjercicioAnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "silent";
		String str2 = "listen";
		EjercicioAnagramCheck prueba = new EjercicioAnagramCheck();
		System.out.println(prueba.areAnagrams(str1, str2));
	}

	public boolean areAnagrams(String str1, String str2) {

		// Write your code here
		if (str1 == null || str2 == null) {
			return false;
		}

		str2 = str2.toLowerCase();
		str1 = str1.toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] chaArray1 = str1.toCharArray();
			char[] chaArray2 = str2.toCharArray();

			Arrays.sort(chaArray1);
			Arrays.sort(chaArray2);
			return Arrays.equals(chaArray1, chaArray2);
		}

	}

}
