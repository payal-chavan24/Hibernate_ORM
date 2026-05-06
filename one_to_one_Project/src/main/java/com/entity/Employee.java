package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	int emp_id;
	String emp_name;
	String emp_city;
	double salary;
	@OneToOne
	Department d;

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

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public Employee(int emp_id, String emp_name, String emp_city, double salary, Department d) {

		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.salary = salary;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", salary=" + salary
				+ ", d=" + d + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
