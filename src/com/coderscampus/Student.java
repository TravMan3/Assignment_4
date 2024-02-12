package com.coderscampus;

public class Student implements Comparable<Student>{

	private Integer studentId;
	private String studentName;
	private String course;
	private Integer grade;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", grade="
				+ grade + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Student that) {
		if (that.equals(null)) {
			return 1;
		}else {
			return Integer.compare(that.getGrade(), this.getGrade());
		}

	


}}
