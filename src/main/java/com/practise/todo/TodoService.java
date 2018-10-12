package com.practise.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private static List<Todo> todoList = new ArrayList<>();

    static{
        todoList.add(new Todo("Learn Web Application Development"));
        todoList.add(new Todo("Learn Spring MVC"));
        todoList.add(new Todo("Learn Rest Services"));
    }

    public List<Todo> getTodoList (){
        return todoList;
    }

    public void addTodo (Todo todo){
        todoList.add(todo);
    }

    public void deleteTodo (Todo todo){
        todoList.remove(todo);
    }
}
