package com.practice_oneto_one;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	int emp_id;
	String emp_name;
	String emp_city;
	double salary;
	String dept_name;

	public Employee(int emp_id, String emp_name, String emp_city, double salary, String dept_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.salary = salary;
		this.dept_name = dept_name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", salary=" + salary
				+ ", dept_name=" + dept_name + "]";
	}

}
