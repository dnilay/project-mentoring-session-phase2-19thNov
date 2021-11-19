package com.example;

import java.util.UUID;

public class ToDo {

    private String todoId;
    private String todoName;
    private boolean isCompleted;


    public ToDo()
    {
        todoId= UUID.randomUUID().toString();
        todoName="Compile";
        isCompleted=true;
    }

    public ToDo(String todoId,String todoName,boolean isCompleted)
    {
        this.todoId=todoId;
        this.todoName=todoName;
        this.isCompleted=isCompleted;
    }

    public String getDetails()
    {
        return "ToDo ID: "+todoId+" ToDo Name:"+todoName+" Completed? "+isCompleted;
    }
}
