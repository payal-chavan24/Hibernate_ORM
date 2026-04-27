package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int Emp_Id;
	private String Emp_name;
	private String Emp_city;
	private double Emp_salary;

	public Employee() {

	}

	public Employee(int emp_Id, String emp_name, String emp_city, double emp_salary) {
		super();
		Emp_Id = emp_Id;
		Emp_name = emp_name;
		Emp_city = emp_city;
		Emp_salary = emp_salary;
	}

	public int getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public String getEmp_city() {
		return Emp_city;
	}

	public void setEmp_city(String emp_city) {
		Emp_city = emp_city;
	}

	public double getEmp_salary() {
		return Emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		Emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [Emp_Id=" + Emp_Id + ", Emp_name=" + Emp_name + ", Emp_city=" + Emp_city + ", Emp_salary="
				+ Emp_salary + "]";
	}

}
