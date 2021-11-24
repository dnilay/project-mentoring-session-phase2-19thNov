package org.example;

import org.example.model.Coach;
import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        try {

            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

            /*Person thePerson=context.getBean("person",Person.class);
            System.out.println(thePerson);*/

            Coach myCoach=context.getBean("theCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
