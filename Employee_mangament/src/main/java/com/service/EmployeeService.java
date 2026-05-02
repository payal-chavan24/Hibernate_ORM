package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {
	public void insertData(Employee e) {
		EmployeeDao dao = new EmployeeDao();
		dao.inserdata(e);

	}

	public void getDataById(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.getDataById(id);

	}

	public void updateById(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.updateById(id);
	}

	public void deleteById(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteById(id);
	}

}
