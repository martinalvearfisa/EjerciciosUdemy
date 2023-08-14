package com.ejercicios.ejerciciosudemy;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio8 prueba = new Ejercicio8();
		System.out.println(prueba.isLeapYear(400));
		System.out.println(prueba.isLeapYear(100));
		System.out.println(prueba.isLeapYear(4));
		System.out.println(prueba.isLeapYear(0));
	}

	public boolean isLeapYear(int year) {

		if (year < 1) {
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}

		return false;
	}
}
