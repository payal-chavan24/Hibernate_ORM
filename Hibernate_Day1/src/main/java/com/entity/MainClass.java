package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		// create object Configuration
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Student.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setStudent_id(1);
		s.setStudent_name("Payal");
		s.setStudent_age(22);

		ss.persist(s);
		tr.commit();
		ss.close();

		System.out.println("Inserted ... !");

	}
}
