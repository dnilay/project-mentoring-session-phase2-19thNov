package com.example;

public class Employee {
    //attributes
    //instance variables
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public void createEmployee(int employeeId,String firstName,String lastName,String email,int age)
    {
        if(employeeId<0 && employeeId>1000)
        {
            System.out.println("invalid employee id");
        }
        else
        {
            this. employeeId=employeeId;
        }
     if(firstName.length()<4)
     {
         System.out.println("invalid first name.");
     }
     else {
         this.firstName=firstName;
     }
        if(lastName.length()<3)
        {
            System.out.println("invalid last name.");
        }
        else {
            this.lastName=lastName;
        }
        if(!email.contains("@"))
        {
            System.out.println("invalid email.");
        }
        else {
            this.email=email;
        }

        if(age<18 || age>99)
        {
            System.out.println("invalid age.");
        }
        else
        {
            this.age=age;
        }
    }


    public String getDetails()
    {
        return "Employee ID: "+employeeId+" First Name: "+firstName+" Last Name: "+lastName
                +" Email: "+email+" Age: "+age;
    }


}
