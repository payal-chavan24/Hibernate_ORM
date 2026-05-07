package com.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int std_id;
	private String std_name;
	@ManyToMany
	@JoinTable(name = "Student_course", joinColumns = @JoinColumn(name = "std_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int std_id, String std_name, List<Course> course) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.course = course;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", course=" + course + "]";
	}

}
