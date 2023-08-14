package com.ejercicios.ejerciciosudemy;

public class Ejercicio4 {
	public boolean isPass(int marks) {

		// Update Code : If the student's marks are greater than 50, they have passed
		// the exam.
		if (marks > 50) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Ejercicio4 prueba = new Ejercicio4();
		System.out.println(prueba.isPass(49));
		System.out.println(prueba.isPass(51));
	}
}
