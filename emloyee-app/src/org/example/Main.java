package org.example;

import com.example.ToDo;

import java.util.UUID;

public class Main {

    public static void main(String[] args)
    {
        ToDo toDo=new ToDo();
        ToDo toDo1=new ToDo(UUID.randomUUID().toString(),"Testing",false);
        System.out.println(toDo.getDetails());
        System.out.println(toDo1.getDetails());
    }
}
