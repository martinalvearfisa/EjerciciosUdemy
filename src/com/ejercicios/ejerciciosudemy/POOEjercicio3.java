package com.ejercicios.ejerciciosudemy;

public class POOEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOEjercicio3 prueba = new POOEjercicio3(5, 3);
		POOEjercicio3 prueba2 = new POOEjercicio3(3, 7);

		prueba.move(1, 2);
		prueba2.move(5, 7);

		double distance = prueba.distanceTo(prueba2);

		System.out.println(prueba.getX());
		System.out.println(prueba.getY());
		System.out.println(prueba2.getX());
		System.out.println(prueba2.getY());

		System.out.println(distance);
	}

	private int x;

	// y-coordinate of the point
	private int y;

	// Constructor for the Point class
	public POOEjercicio3(int x, int y) {
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		// Your code here
		this.x += dx;
		this.y += dy;
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(POOEjercicio3 other) {
		int dx = this.x - other.x;
		int dy = this.y - other.y;

		return Math.sqrt(dx * dx + dy * dy);

	}

}
