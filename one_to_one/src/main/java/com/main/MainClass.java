package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice_oneto_one.Laptop;
import com.practice_oneto_one.Student;

public class MainClass {
	public static void main(String[] args) {
		();
Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Student.class);
		cf.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction
		Laptop la = new Laptop();
		la.setLaptopId(2);
		la.setLaptopName("dell");
		ss.persist(la);

		Student s = new Student();
		s.setStdId(11);
		s.setStdName("nisha");
		s.setStdCity("nsk");
		s.setL(la);

		ss.persist(s);
		tt.commit();
		ss.close();
		System.out.println("Data is inserted");

	}
}
