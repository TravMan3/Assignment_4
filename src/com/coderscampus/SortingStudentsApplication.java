package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class SortingStudentsApplication {

	public static void main(String[] args) throws IOException {
		
		StudentServices studentService = new StudentServices();
		Student[] students = studentService.readFile();
		Arrays.sort(students);

	}

}
