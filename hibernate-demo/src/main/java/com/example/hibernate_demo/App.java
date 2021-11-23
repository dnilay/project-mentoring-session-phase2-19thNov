package com.example.hibernate_demo;

import java.util.List;
import java.util.Random;

import javax.persistence.Query;

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
			/*
			 * session.getTransaction().begin(); Employee employee=new Employee(new
			 * Random().nextInt(1000), "Marry", "Public", "marry@email.com");
			 * session.save(employee); session.getTransaction().commit();
			 * System.out.println("saved");
			 */
    		session.getTransaction().begin();
    		//hbql
    		Query query=session.createQuery("FROM Employee E where E.firstName=:fName",Employee.class);
    		query.setParameter("fName", "Marry");
    		List<Employee> list=query.getResultList();
    		for(Employee e:list)
    		{
    			System.out.println(e);
    		}
    		
    		session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
