package com.practice_oneto_one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String LaptopName;

	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		LaptopName = laptopName;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return LaptopName;
	}

	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", LaptopName=" + LaptopName + "]";
	}

}
