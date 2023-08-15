package com.ejercicios.ejerciciosudemy;

public class EjercicioIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioIf1 student = new EjercicioIf1(85);
		System.out.println(student.assignGrade()); // Should print 'B'
		EjercicioIf1 student2 = new EjercicioIf1(101);
		System.out.println(student2.assignGrade());// Should print 'X'
	}

	private int marks;

	public EjercicioIf1(int marks) {
		// TODO: Assign 'marks' to the instance variable 'this.marks'
		this.marks = marks;
	}

	public char assignGrade() {
		// TODO: Implement the method which assigns the grade based on marks.
		// If marks are less than 0 or greater than 100, return 'X'
		// If marks are greater than or equal to 90, return 'A'
		// If marks are greater than or equal to 80, return 'B'
		// If marks are greater than or equal to 70, return 'C'
		// If marks are greater than or equal to 60, return 'D'
		// If marks are greater than or equal to 50, return 'E'
		// If marks are less than 50, return 'F'
		if (marks < 0 || marks > 100) {
			return 'X';
		} else if (marks >= 90) {
			return 'A';
		} else if (marks >= 80) {
			return 'B';
		} else if (marks >= 70) {
			return 'C';
		} else if (marks >= 60) {
			return 'D';
		} else if (marks >= 50) {
			return 'E';
		} else {
			return 'F';
		}
	}

}
