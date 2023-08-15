package com.ejercicios.ejerciciosudemy;

public class EjercicioIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioIf2 adviser = new EjercicioIf2();

		System.out.println(adviser.provideWeatherAdvisory(-5));
		// Output: "It's freezing! Wear a heavy coat."

		System.out.println(adviser.provideWeatherAdvisory(5));

		System.out.println(adviser.provideWeatherAdvisory(15));
		// Output: "It's cool! A light jacket will do."

		System.out.println(adviser.provideWeatherAdvisory(25));
		// Output: "It's warm! Enjoy the day."
	}

	public String provideWeatherAdvisory(int temperature) {
		// TODO: Provide a weather advisory message based on the temperature.

		if (temperature < 0) {
			return "It's freezing! Wear a heavy coat.";
		} else if (temperature >= 0 && temperature <= 10) {
			return "It's cold! Bundle up.";
		} else if (temperature >= 11 && temperature <= 20) {
			return "It's cool! A light jacket will do.";
		} else {
			return "It's warm! Enjoy the day.";
		}
	}

}
