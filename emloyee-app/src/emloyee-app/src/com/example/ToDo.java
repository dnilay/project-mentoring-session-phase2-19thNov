package com.example;

import java.util.UUID;

public class ToDo {

    private String todoId;
    private String todoName;
    private boolean isCompleted;


    public ToDo()
    {
        this(UUID.randomUUID().toString());
        System.out.println("within default constructor");

    }

    public ToDo(String todoId) {
       this(todoId,"Compile");
       System.out.println("within one arg constructor");
    }

    public ToDo(String todoId, String todoName) {
        this(todoId,todoName,false);
        System.out.println("within two args constructor");
    }

    public ToDo(String todoId, String todoName, boolean isCompleted)
    {
        System.out.println("within three args constructor begining");
        this.todoId=todoId;
        this.todoName=todoName;
        this.isCompleted=isCompleted;
        System.out.println("within three args constructor end");

    }

    public String getDetails()
    {
        return "ToDo ID: "+todoId+" ToDo Name:"+todoName+" Completed? "+isCompleted;
    }
}
