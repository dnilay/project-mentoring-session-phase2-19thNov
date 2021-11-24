package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.beans.BaseBallCoach;
import com.example.demo.beans.Coach;

public class App 
{
    public static void main( String[] args )
    {
       
    	try {
    		
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Coach coach=context.getBean("theCoach",Coach.class);
    		System.out.println(coach.getDailyWorkout());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
