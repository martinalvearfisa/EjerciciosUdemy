package com.ejercicios.ejerciciosudemy;

public class EjercicioLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioLCM prueba = new EjercicioLCM(8, 6);
		System.out.println(prueba.calculateLCM());
		EjercicioLCM prueba2 = new EjercicioLCM(2, 4);

		System.out.println(prueba2.calculateLCM());

	}

	private int number1;
	private int number2;
	private int c = 0;

	/**
	 * Constructor that initializes the two numbers.
	 * 
	 * @param number1: The first number.
	 * @param number2: The second number.
	 */
	public EjercicioLCM(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	/**
	 * Getter for the first number.
	 * 
	 * @return the first number.
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * Getter for the second number.
	 * 
	 * @return the second number.
	 */
	public int getNumber2() {
		return number2;
	}

	public int calculateLCM() {
		// TODO: Write your code here
		if (number1 < 0 || number2 < 0) {
			return -1;
		} else if (number1 == 0 || number2 == 0) {
			return 0;
		} else {
			c = Math.max(number1, number2);
			int lcm = c;
			while (true) {
				if (lcm % number1 == 0 && lcm % number2 == 0) {
					break;
				}
				lcm += c;

			}
			return lcm;
		}
	}

}
