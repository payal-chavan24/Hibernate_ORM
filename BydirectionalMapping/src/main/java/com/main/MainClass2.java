package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Course;
import com.Entity.Student;

public class MainClass2 {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Student.class);
		cf.addAnnotatedClass(Course.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Course c1 = new Course();
		c1.setCourse_id(1);
		c1.setCourse_name("Python");

		Course c2 = new Course();
		c2.setCourse_id(2);
		c2.setCourse_name("Java");

		Course c3 = new Course();
		c3.setCourse_id(3);
		c3.setCourse_name("Testing");

		Student s1 = new Student();
		s1.setStd_id(1);
		s1.setStd_name("Payal");
		List<Course> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		s1.setCourse(list);
		ss.persist(c1);
		ss.persist(c2);
		ss.persist(c3);
		ss.persist(s1);
		tt.commit();
		ss.close();
		System.out.println("Data is inserted");

	}
}
