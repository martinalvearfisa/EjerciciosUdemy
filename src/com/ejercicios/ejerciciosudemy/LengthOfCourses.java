package com.ejercicios.ejerciciosudemy;

import java.util.List;
import java.util.stream.Collectors;

public class LengthOfCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Math", "English", "History", "Physics");
		System.out.println(getCourseNameCharacterCount(courses));
	}

	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
		// TODO: Write code
		if (courses == null) {
			return List.of();
		}

		return courses.stream().map(String::length).collect(Collectors.toList());
	}

}
