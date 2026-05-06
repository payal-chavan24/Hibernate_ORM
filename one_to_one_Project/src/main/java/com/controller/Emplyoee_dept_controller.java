package com.controller;

import java.util.Scanner;

import com.entity.Department;
import com.entity.Employee;
import com.service.Employee_service;

public class Emplyoee_dept_controller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1: for insert Emplyoee data");
			System.out.println("Enter 2: for display Emplyoee data by id");
			System.out.println("Enter 3: for delete Emplyoee data");
			System.out.println("Enter 4: for update Emplyoee data");
			System.out.println("Enter 5: for exist Emplyoee data");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter dept_id");
				int dept_id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter dept_name");
				String dept_name = sc.nextLine();
				Department d = new Department(dept_id, dept_name);
				System.out.println("Enter Employee id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter employee_name");
				String emp_name = sc.nextLine();
				System.out.println("Enter employee_city");
				String emp_city = sc.nextLine();
				System.out.println("Enter employee_salary");
				double salary = sc.nextDouble();
				Employee ee = new Employee(id, emp_name, emp_city, salary, d);
				Employee_service es = new Employee_service();
				es.insertData(ee);

			} else if (choice == 2) {
				System.out.println("Enter Employee Id for display data");
				int id = sc.nextInt();
				Employee_service es = new Employee_service();
				es.displayData(id);

			} else if (choice == 3) {
				System.out.println("Enter Employee id for delete");
				int id = sc.nextInt();
				Employee_service es = new Employee_service();
				es.deleteData(id);

			} else if (choice == 4) {
				System.out.println("Enter id for update data");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter updated name ");
				String name = sc.nextLine();
				Employee_service es = new Employee_service();
				es.updateData(id, name);

			} else if (choice == 5) {
				System.out.println("Logout...!");
				break;

			} else {
				System.out.println("Invalid entry");

			}

		}
	}
}
