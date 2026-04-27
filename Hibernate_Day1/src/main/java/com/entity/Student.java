package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int Student_id;
	private String Student_name;
	private int Student_age;
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_age=" + Student_age
				+ "]";
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public int getStudent_age() {
		return Student_age;
	}
	public void setStudent_age(int student_age) {
		Student_age = student_age;
	}
	public Student(int student_id, String student_name, int student_age) {
		super();
		Student_id = student_id;
		Student_name = student_name;
		Student_age = student_age;
	}
	
	
	

}
