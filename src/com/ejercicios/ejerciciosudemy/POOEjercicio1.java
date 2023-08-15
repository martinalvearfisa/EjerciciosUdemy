package com.ejercicios.ejerciciosudemy;

public class POOEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOEjercicio1 prueba = new POOEjercicio1(13);
		POOEjercicio1 prueba2 = new POOEjercicio1(24);

		System.out.println("Pies: " + prueba.getFeet());
		System.out.println("Pulgadas: " + prueba.getInches());
		System.out.println("Pies: " + prueba2.getFeet());
		System.out.println("Pulgadas: " + prueba2.getInches());
	}

	private int feet;
	private int inches;

	public POOEjercicio1(int inches) {
		// TODO: Convert the total inches into feet and inches. One foot is 12 inches.
		// Store the feet and inches in their respective instance variables.
		if (inches >= 0) {

			this.feet = inches / 12;
			this.inches = inches % 12;

		} else {
			this.feet = -1;
			this.inches = -1;
		}
	}

	public int getFeet() {
		// TODO: Return the value of feet.
		return feet;
	}

	public int getInches() {
		// TODO: Return the value of inches.
		return inches;
	}
}
