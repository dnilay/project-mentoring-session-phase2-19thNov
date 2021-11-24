package org.example;

import org.example.model.Coach;
import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class App
{
    public static void main( String[] args )
    {
        try {

            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

            /*Person thePerson=context.getBean("person",Person.class);
            System.out.println(thePerson);*/

           /* Coach myCoach=context.getBean("theCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());*/

            DataSource dataSource=context.getBean("dataSource",DataSource.class);
            Connection connection= dataSource.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from customer");
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "
                + resultSet.getString(3));
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
