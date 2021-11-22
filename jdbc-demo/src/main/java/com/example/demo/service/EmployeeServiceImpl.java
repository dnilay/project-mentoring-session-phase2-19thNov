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

}
