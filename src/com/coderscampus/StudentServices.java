package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class StudentServices {

	public Student[] readFile() throws IOException {
		Student[] students = new Student[100];
		
		try (FileInputStream fileInput = new FileInputStream("student-master-list.csv")) {
			 
			InputStreamReader read = new InputStreamReader(fileInput);
			BufferedReader fileRead = new BufferedReader(read);
			
			
			String line;
			int i = 0;
			while ((line = fileRead.readLine()) != null){
				String[] data = line.split(",");
				Integer studentID = Integer.parseInt(data[0]);
				String studentName = data[1];
				String course = data[2];
				Integer grade = Integer.parseInt(data[3]);
				
				Student kids = new Student(studentID, studentName, course, grade);
				
//				kids.setStudentId(studentID);
//				kids.setStudentName(studentName);
//				kids.setCourse(course);
//				kids.setGrade(grade);
				students[i] = kids;
				i++;
			}
			return students;
		} 
		catch (IOException e) {
			e.printStackTrace();
			throw e;
		}

	}
}
