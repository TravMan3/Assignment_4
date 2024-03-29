package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class StudentServices {

	public Student[] readFile() throws IOException {
		Student[] students = new Student[100];

		try (FileInputStream fileInput = new FileInputStream("student-master-list.csv")) {

			InputStreamReader read = new InputStreamReader(fileInput);
			BufferedReader fileRead = new BufferedReader(read);

			fileRead.readLine();

			String line;
			int i = 0;
			while ((line = fileRead.readLine()) != null) {
				String[] data = line.split(",");
				Integer studentID = Integer.parseInt(data[0]);
				String studentName = data[1];
				String course = data[2];
				Integer grade = Integer.parseInt(data[3]);

				Student kids = new Student();
				kids.setStudentId(studentID);
				kids.setStudentName(studentName);
				kids.setCourse(course);
				kids.setGrade(grade);
				students[i] = kids;
				i++;
			}
			return students;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}

	}

	public Student[] studentSeparatedByCourseWork(Student[] students, String courseName) {
		List<Student> filteredStudents = new ArrayList<>();
		
		for (Student student : students) {
			String nameOfCourse = student.getCourse();
			if (nameOfCourse.contains(courseName)) {
				filteredStudents.add(student);
			}
		}
		return filteredStudents.toArray(new Student[0]);
	}
	
	public void writeStudentsToFile(Student[] students, String fileName) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + "," + "Grade");
			writer.newLine();
			for (Student student : students) {
				writer.write(student.toString());
				writer.newLine();
			}}catch(IOException e) {
				e.printStackTrace();
			}
		
		
		
}}
