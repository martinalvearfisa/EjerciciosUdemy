package com.ejercicios.ejerciciosudemy;

public class Ejercicio6 {
	public boolean isRightAngled(int side1, int side2, int side3) {
		// write your code
		int a = side1 * side1;
		int b = side2 * side2;
		int c = side3 * side3;
		if (side1 > 0 && side2 > 0 && side3 > 0) {
			if (a == b + c) {
				return true;
			} else if (b == a + c) {
				return true;
			} else if (c == b + a) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Ejercicio6 prueba = new Ejercicio6();
		System.out.println(prueba.isRightAngled(90, 50, 25));
		System.out.println(prueba.isRightAngled(3, 4, 5));

	}

}
