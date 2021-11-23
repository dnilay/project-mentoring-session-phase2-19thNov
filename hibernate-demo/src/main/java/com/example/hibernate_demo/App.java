package com.example.hibernate_demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate_demo.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	try {
    		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
    		Session session=sessionFactory.openSession();
    		session.getTransaction().begin();
    		Employee employee=new Employee(new Random().nextInt(1000), "John", "Doe", "john@email.com");
    		session.save(employee);
    		session.getTransaction().commit();
    		System.out.println("saved");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
