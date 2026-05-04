package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice_oneto_one.Department;
import com.practice_oneto_one.Employee;

public class MainClass2 {
public static void main(String[] args) {
	Configuration cf = new Configuration();
	cf.configure("hibernate.cfg.xml");
	cf.addAnnotatedClass(Employee.class);
	cf.addAnnotatedClass(Department.class);

	SessionFactory sf = cf.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tt = ss.beginTransaction();
	
}
}
