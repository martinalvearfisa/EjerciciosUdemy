package com.ejercicios.ejerciciosudemy;

public class POOEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOEjercicio2 prueba = new POOEjercicio2(5);
		POOEjercicio2 prueba2 = new POOEjercicio2(4);

		System.out.println(prueba.calculateArea());
		System.out.println(prueba.calculatePerimeter());

		System.out.println(prueba2.calculateArea());
		System.out.println(prueba2.calculatePerimeter());
	}

	private int side;

	public POOEjercicio2(int side) {
		// TODO: Initialize side with the passed value
		this.side = side;
	}

	public int calculateArea() {
		// TODO: Calculate and return the area of the square
		if (side < 0) {
			return -1;
		}
		return side * side;
	}

	public int calculatePerimeter() {
		// TODO: Calculate and return the perimeter of the square
		if (side < 0) {
			return -1;
		}
		return 4 * side;
	}

}
