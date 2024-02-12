package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class SortingStudentsApplication {

	public static void main(String[] args) throws IOException {

		StudentServices studentServices = new StudentServices();
		Student[] students = studentServices.readFile();

		Arrays.sort(students);

		Student[] compsci = studentServices.studentSeparatedByCourseWork(students, "COMPSCI");
		Student[] stat = studentServices.studentSeparatedByCourseWork(students, "STAT");
		Student[] apmth = studentServices.studentSeparatedByCourseWork(students, "APMTH");

		studentServices.writeStudentsToFile(compsci, "course1.csv");
		studentServices.writeStudentsToFile(stat, "course3.csv");
		studentServices.writeStudentsToFile(apmth, "course2.csv");

	}

}
