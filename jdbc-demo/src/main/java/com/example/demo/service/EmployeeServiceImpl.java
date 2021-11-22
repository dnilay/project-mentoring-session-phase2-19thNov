package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> employees;
	
	
	public EmployeeServiceImpl() {
		employees=new ArrayList<Employee>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
