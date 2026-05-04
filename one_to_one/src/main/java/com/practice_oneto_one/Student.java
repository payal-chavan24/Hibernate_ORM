package com.practice_oneto_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int stdId;
	String stdName;
	String stdCity;
	@OneToOne
	Laptop l;

	public Student(int stdId, String stdName, String stdCity, Laptop l) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
		this.l = l;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + ", l=" + l + "]";
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
