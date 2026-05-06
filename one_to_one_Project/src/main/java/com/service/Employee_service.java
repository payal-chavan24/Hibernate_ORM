package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class Employee_service {

	public void insertData(Employee ee) {
		EmployeeDao ed=new EmployeeDao();
		ed.insertData(ee);
		
	}

	public void displayData(int id) {
		EmployeeDao ed=new EmployeeDao();
		ed.displayData(id);
		
	}

	public void deleteData(int id) {
		EmployeeDao ed=new EmployeeDao();
		ed.deleteData(id);
		
	}

	public void updateData(int id,String name) {
		EmployeeDao ed=new EmployeeDao();
		ed.updatedData(id,name);
		
	}

}
