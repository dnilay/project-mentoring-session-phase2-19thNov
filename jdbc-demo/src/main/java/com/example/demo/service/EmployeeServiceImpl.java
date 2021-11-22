package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> employees;
	private static Scanner scanner=new Scanner(System.in);
	
	public EmployeeServiceImpl() {
		employees=new ArrayList<Employee>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		employees.add(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
	Employee tempEmployee=null;
		for(Employee employee:employees)
		{
			if(employee.getEmployeeId().equals(employeeId))
			{
				tempEmployee=employee;
				break;
			}
			
		}
		return tempEmployee;
	}

	@Override
	public Employee updateEmployee(String employeeId) {
		Employee tempEmployee=getEmployeeById(employeeId);
		if(tempEmployee==null)
		{
			
			return tempEmployee;
		
		}
		else
		{
			
			System.out.print("Enter updated first name: ");
			String firstName=scanner.next();
			tempEmployee.setFirstName(firstName);
			System.out.print("Enter updated last name: ");
			String lastName=scanner.next();
			tempEmployee.setLastName(lastName);
			System.out.print("Enter updated email: ");
			String email=scanner.next();
			tempEmployee.setEmail(email);
			return tempEmployee;
		}
		
	}

	@Override
	public void deleteEmployee(String employeeId) {
		// TODO Auto-generated method stub
		
	}

}
