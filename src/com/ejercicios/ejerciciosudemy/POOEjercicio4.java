package com.ejercicios.ejerciciosudemy;

public class POOEjercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOEjercicio4 prueba = new POOEjercicio4(255, 0, 0);
		POOEjercicio4 prueba4 = new POOEjercicio4(128, 128, 128);

		System.out.println(prueba.getRed());
		System.out.println(prueba.getBlue());
		System.out.println(prueba.getGreen());
		prueba.invert();
		System.out.println(prueba.getRed());
		System.out.println(prueba.getBlue());
		System.out.println(prueba.getGreen());

		System.out.println(prueba4.getRed());
		System.out.println(prueba4.getBlue());
		System.out.println(prueba4.getGreen());
		prueba4.invert();
		System.out.println(prueba4.getRed());
		System.out.println(prueba4.getBlue());
		System.out.println(prueba4.getGreen());

	}

	private int red;
	private int green;
	private int blue;

	// Constructor for RGBColor class which initializes the color with provided red,
	// green and blue values.
	public POOEjercicio4(int red, int green, int blue) {
		// write your code here
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// Getter method to get the red value of the color.
	public int getRed() {
		// write your code here
		return red;
	}

	// Getter method to get the green value of the color.
	public int getGreen() {
		// write your code here
		return green;

	}

	// Getter method to get the blue value of the color.
	public int getBlue() {
		// write your code here
		return blue;
	}

	// Method to invert the color. The inversion is done by subtracting each color
	// component from 255.
	public void invert() {
		// write your code here
		this.red = 255 - red;
		this.blue = 255 - blue;
		this.green = 255 - green;
	}

}
