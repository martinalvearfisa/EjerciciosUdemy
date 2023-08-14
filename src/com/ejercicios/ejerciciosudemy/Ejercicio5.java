package com.ejercicios.ejerciciosudemy;

public class Ejercicio5 {

	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// write your code here
		if (angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 + angle2 + angle3 == 180) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio5 prueba = new Ejercicio5();
		System.out.println(prueba.isValidTriangle(50, 60, 70));
		System.out.println(prueba.isValidTriangle(-50, 60, 70));
	}

}
