package com.controller;

import java.util.Scanner;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----menu------");
			System.out.println("Insert 1. Add user Details");
			System.out.println("Insert 2. get user by id");
			System.out.println("Insert 3. update user Details");
			System.out.println("Insert 4. delete user by id");
			System.out.println("Insert 5. exist");
			System.out.println("Enter a choice");
			int click = sc.nextInt();

			if (click == 1) {
				System.out.println("Enter employee id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee name ");
				String name = sc.nextLine();
				System.out.println("Enter Employee department");
				String dept = sc.nextLine();
				System.out.println("Enter Employee salary");
				double salary = sc.nextDouble();
				System.out.println("Enter Employee age");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee position");
				String position = sc.nextLine();
				System.out.println("Enter Employee gender");
				String gender = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee city");
				String city = sc.nextLine();
				System.out.println("Enter Employee experience");
				String exp = sc.nextLine();
				System.out.println("Enter date of join ");
				String doj = sc.nextLine();
				System.out.println("Enter Employee Email");
				String email = sc.nextLine();
				System.out.println("Enter Employee mobNo");
				long mob_no = sc.nextLong();
				Employee e = new Employee(id, name, dept, salary, age, position, gender, city, exp, doj, email, mob_no);
				EmployeeService service = new EmployeeService();
				service.insertData(e);

			} else if (click == 2) {
				System.out.println("Enter user id");
				int id = sc.nextInt();
				EmployeeService service = new EmployeeService();
				service.getDataById(id);

			} else if (click == 3) {
				System.out.println("Enter employee id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee updated name ");
				String name = sc.nextLine();
				System.out.println("Enter Employee updated  department");
				String dept = sc.nextLine();
				System.out.println("Enter Employee updated salary");
				double salary = sc.nextDouble();
				EmployeeService service = new EmployeeService();
				service.updateById(id);

			} else if (click == 4) {
				System.out.println("Enter employee id tto delete");
				int id = sc.nextInt();
				EmployeeService service = new EmployeeService();
				service.deleteById(id);

			} else if (click == 5) {
				System.out.println("Exist");
				break;

			}

		}

	}
}
