package org.example;

import com.example.ToDo;

import java.util.UUID;

public class Main {

    public static void main(String[] args)
    {
        ToDo toDo=new ToDo();
        toDo.addToDo(UUID.randomUUID().toString(),"Test",true);
        System.out.println(toDo.getDetails());

    }
}
