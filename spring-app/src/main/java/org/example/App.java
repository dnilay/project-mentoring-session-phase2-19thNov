package org.example;

import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        try {

            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

            Person thePerson=context.getBean("person",Person.class);
            System.out.println(thePerson);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
