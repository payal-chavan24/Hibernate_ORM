package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	public Employee(int emp_id, String emp_name, String emp_dept, double salary) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_dept = emp_dept;
		this.salary = salary;
	}

	@Id
	private int Emp_id;
	private String Emp_name;
	private String Emp_dept;
	private double salary;
	private int age;
	private String position;
	private String gender;
	private String city;
	private String experience;
	private String date_of_join;
	private String email;
	private long phoneNumber;

	public Employee(int emp_id, String emp_name, String emp_dept, double salary, int age, String position,
			String gender, String city, String experience, String doj, String email, long phoneNumber) {

		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_dept = emp_dept;
		this.salary = salary;
		this.age = age;
		this.position = position;
		this.gender = gender;
		this.city = city;
		this.experience = experience;
		this.date_of_join = doj;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", Emp_dept=" + Emp_dept + ", salary=" + salary
				+ ", age=" + age + ", position=" + position + ", gender=" + gender + ", city=" + city + ", experience="
				+ experience + ", date_of_join=" + date_of_join + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ "]";
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public String getEmp_dept() {
		return Emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		Emp_dept = emp_dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDate_of_join() {
		return date_of_join;
	}

	public void setDate_of_join(String date_of_join) {
		this.date_of_join = date_of_join;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
