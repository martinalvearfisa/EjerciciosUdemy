package com.ejercicios.ejerciciosudemy;

public class Ejercicio3 {
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method

		if (hours < 0) {
			return -1;
		} else {
			int minutes = hours * 60;
			return minutes;
		}

	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method

		if (days < 0) {
			return -1;
		} else {
			int minutes = days * 24 * 60;
			return minutes;
		}

	}

	public static void main(String[] args) {
		System.out.printf("Convertir 5 dias a minutos: %d", convertDaysToMinutes(5)).println();
		System.out.printf("Convertir 5 horas a minutos: %d ", convertHoursToMinutes(5)).println();
	}

}
