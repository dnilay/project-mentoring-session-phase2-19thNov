package com.example.demo;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerServiceImpl;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;
		try {
			CustomerService customerService = new CustomerServiceImpl();
			do {
				System.out.println("1. Insert.");
				System.out.println("2. Display All.");
				System.out.println("0. Exit.");
				System.out.print("Enter your choice.   !");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter Customer Name: ");
					String name = scanner.next();
					System.out.print("Enter Customer Email. ");
					String email = scanner.next();
					Customer customer = customerService
							.createCustomer(new Customer(new Random().nextInt(100000), name, email));
					System.out.printf("Customer Created: %s", customer);

					break;

				case 2:
					List<Customer> list=customerService.getAllCustomers();
					
					Iterator<Customer> iterator=list.iterator();
					
					while(iterator.hasNext())
					{
						System.out.printf("%s\n", iterator.next());
					}
					break;
				case 0:
					System.out.println("Bye.!!!");
					System.exit(0);
					break;
					
				default:
					System.out.println("invalid choice.!!");
					break;
				}

			} while (choice != 0);

		} catch (SQLException | InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
