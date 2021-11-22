package com.example.demo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;

public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// dynamic method dispatching.
		// reference of base type can refer to any chile type
		EmployeeService service = new EmployeeServiceImpl();
		int choice = 0;
		do {
			try {
				System.out.println("1. For Create Employee. ");
				System.out.println("2. Display All Employees. ");
				System.out.println("3. Find Employee By ID: ");
				System.out.println("0. Exit. ");
				System.out.println("Enter your choice. ");
				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("choice must be integer value");
			}

			switch (choice) {
			case 1:
				System.out.print("Enter First Name: ");
				String firstName = scanner.next();
				System.out.print("Enter Last Name: ");
				String lastName = scanner.next();
				System.out.print("Enter Email: ");
				String email = scanner.next();
				Employee employee = service
						.createEmployee(new Employee(UUID.randomUUID().toString(), firstName, lastName, email));
				System.out.println("Employee Created: " + employee.displayDetail());
				break;
			case 2:
				List<Employee> list = service.getAllEmployees();
				if (list.isEmpty()) {
					System.out.println("empty employee list.");
					break;
				}
				for (Employee employee2 : list) {
					System.out.println(employee2.displayDetail());
				}
				break;
			case 3:
				System.out.print("Enter Employee ID: ");
				String employeeId = scanner.next();
				Employee employee2 = service.getEmployeeById(employeeId);
				if (employee2 == null) {
					System.out.println("No Such Employee Found with id: " + employeeId);
				} else {
					System.out.println("employee found: " + employee2.displayDetail());
				}
				break;

			case 0:
				System.out.println("Bye.!!!!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice.");
				break;
			}
		} while (choice != 0);

	}
}
