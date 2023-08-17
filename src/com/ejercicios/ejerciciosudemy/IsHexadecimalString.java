package com.ejercicios.ejerciciosudemy;

public class IsHexadecimalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsHexadecimalString prueba = new IsHexadecimalString("A23g");
		System.out.println(prueba.isHexadecimal());
		IsHexadecimalString prueba2 = new IsHexadecimalString("123F");
		System.out.println(prueba2.isHexadecimal());

	}

	public String str;

	public IsHexadecimalString(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		// Write your code here
		return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
	}

	public boolean isHexadecimal() {
		// Write your code here
		if (this.str == null || str.length() == 0) {
			return false;
		}
		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
				return false;

			}
		}
		return true;

	}
}
