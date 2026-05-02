package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

import jakarta.persistence.Query;

public class EmployeeDao {
	public void inserdata(Employee e) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(e);
		tr.commit();
		ss.close();
		System.out.println("Data is inserted");

	}

	public void getDataById(int id) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Employee ee = ss.get(Employee.class, id);
		System.out.println(ee);

		tr.commit();
		ss.close();

	}

	public void updateById(int id) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Employee ee = ss.get(Employee.class, id);
		ee.setEmp_name(ee.getEmp_name());
		ee.setEmp_dept(ee.getEmp_dept());
		ee.setSalary(ee.getSalary());
		ss.merge(ee);
		tr.commit();
		ss.close();
		System.out.println("Updated");

	}

	public void deleteById(int id) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
//		Employee ee = ss.get(Employee.class, id);
//		ss.remove(ee);
//		tr.commit();
//		ss.close();
//		System.out.println("deleted");
		Query query = ss.createQuery("delete from Employee where id=:emp_id");
		query.setParameter("Emp_id", id);
		int result = query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("deleted using hql");

	}
}
