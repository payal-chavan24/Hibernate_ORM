package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Department;
import com.Entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		cf.addAnnotatedClass(Department.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Department dept = new Department();
		dept.setDept_id(1);
		dept.setDept_name("IT");
		// dept.setEmp(null);
		Employee e1 = new Employee();
		e1.setEmp_id(1001);
		e1.setEmp_name("om");
		e1.setDept(dept);

		Employee e2 = new Employee();
		e2.setEmp_id(1002);
		e2.setEmp_name("Payal");
		e2.setDept(dept);

		Employee e3 = new Employee();
		e3.setEmp_id(1003);
		e3.setEmp_name("Rahul");
		e3.setDept(dept);
		List<Employee> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		dept.setEmp(list);
		ss.persist(dept);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		tt.commit();
		ss.close();
		System.out.println("Data is inserted...!");

	}
}
