package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(String employeeId);
	public Employee updateEmployee(String employeeId);
	public void deleteEmployee(String employeeId);

}
