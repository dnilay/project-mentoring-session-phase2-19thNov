package com.example;

public class Tester {

    public static void main(String[] args)
    {
        Employee employee=null;
        employee=new Employee();
        employee.createEmployee(10,"John","Doe","john@email.com",-10);
        System.out.println(employee.getDetails());

    }
}
