package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Employee ee = new Employee();
		ee.setEmp_Id(1);
		ee.setEmp_name("Rahul");
		ee.setEmp_city("Hydrabadd");
		ee.setEmp_salary(25000.00);

		ss.persist(ee);
		ts.commit();
		ss.close();
		System.out.println("Data is inserted");

	}
}
