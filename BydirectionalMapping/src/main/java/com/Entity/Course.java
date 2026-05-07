package com.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {// many course many student
	@Id
	private int course_id;
	private String course_name;
	@ManyToMany(mappedBy = "course")
	private List<Student> std;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int course_id, String course_name, List<Student> std) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.std = std;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public List<Student> getStd() {
		return std;
	}

	public void setStd(List<Student> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", std=" + std + "]";
	}

}
