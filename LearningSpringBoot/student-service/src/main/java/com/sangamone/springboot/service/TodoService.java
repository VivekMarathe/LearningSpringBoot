package com.sangamone.springboot.service;

import com.sangamone.springboot.model.Todo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    static {
        todos.add(new Todo(1, "abhijith", "Learn Spring MVC", new Date(), false));
        todos.add(new Todo(2, "abhihek", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "rajesh", "Learn Hibernate", new Date(), false));
    }
    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
