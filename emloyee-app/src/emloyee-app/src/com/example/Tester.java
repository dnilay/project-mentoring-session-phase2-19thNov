package com.example;

public class Tester {

    public static void main(String[] args)
    {
        Employee employee=null;
        employee=new Employee();
        employee.createEmployee(10,"John","Doe","john@email.com",-10);
        if (employee.getEmployeeId()<0 && employee.getEmployeeId()>1000)
        {
            employee=null;
        }
        if (employee.getFirstName().length()<4)
        {
            employee=null;
        }
        if (employee.getLastName().length()<3)
        {
            employee=null;
        }
        if(employee.getEmail().length()<0)
        {
            employee=null;
        }
        if ((employee.getAge()==0))
        {
            employee=null;
        }
        if (employee==null)
        {
            System.out.println("no employee creates"+employee);
        }
        else
        {
            System.out.println(employee.getDetails());
        }


    }
}
