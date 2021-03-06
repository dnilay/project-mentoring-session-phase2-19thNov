package com.example.demo.model;

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;

	public Employee() {
		
	}
	public Employee(String employeeId, String firstName, String lastName, String email) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String displayDetail() {
		// TODO Auto-generated method stub
		return "Employee ID:"+getEmployeeId()+" First Name: "+getFirstName()+" Last Name: "+getLastName()+" Email" +getEmail() ;
	}
	

}
