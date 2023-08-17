package com.ejercicios.ejerciciosudemy;

import java.util.Scanner;

public class EnumDirection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dir = scanner.next();

	}

	public enum Direction {
		NORTH("North"), SOUTH("South"), EAST("East"), WEST("West");

		// Field to store the name of the direction
		private String name;

		// Constructor for the enum which sets the name field
		Direction(String name) {
			this.name = name;
		}

		// Public method to get the name of the direction
		public String getName() {
			return name;
		}

		// Public method to get the direction to the left of the current direction
		public Direction left() {
			// Depending on the current direction, we return the appropriate direction to
			// the left
			switch (this) {
			case NORTH:
				return WEST; // If we are facing NORTH, to our left is the WEST
			case SOUTH:
				return EAST; // If we are facing SOUTH, to our left is the EAST
			case EAST:
				return NORTH; // If we are facing EAST, to our left is the NORTH
			case WEST:
				return SOUTH; // If we are facing WEST, to our left is the SOUTH
			}
			return this;
		}

		// Public method to get the direction to the right of the current direction
		public Direction right() {
			// Depending on the current direction, we return the appropriate direction to
			// the right
			switch (this) {
			case NORTH:
				return EAST; // If we are facing NORTH, to our right is the EAST
			case SOUTH:
				return WEST; // If we are facing SOUTH, to our right is the WEST
			case EAST:
				return SOUTH; // If we are facing EAST, to our right is the SOUTH
			case WEST:
				return NORTH; // If we are facing WEST, to our right is the NORTH
			}
			return this;
		}
	}
}
