package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class EmployeeDao {

	public void insertData(Employee ee) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		cf.addAnnotatedClass(Department.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		ss.persist(ee.getD());
		ss.persist(ee);
		tt.commit();
		ss.close();
		System.out.println("Data is inserted...!");

	}

	public void displayData(int id) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		cf.addAnnotatedClass(Department.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Employee ee = ss.get(Employee.class, id);
		System.out.println(ee);
		tt.commit();
		ss.close();

	}

	public void deleteData(int id) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		cf.addAnnotatedClass(Department.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Employee ee = ss.get(Employee.class, id);
		ss.remove(ee);
		tt.commit();
		ss.close();
		System.out.println("Data is deleted");

	}

	public void updatedData(int id, String name) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		cf.addAnnotatedClass(Department.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Employee ee = ss.get(Employee.class, id);
		ee.setEmp_name(name);

		ss.merge(ee);
		tt.commit();
		ss.close();
		System.out.println("Data is upadated");

	}

}
