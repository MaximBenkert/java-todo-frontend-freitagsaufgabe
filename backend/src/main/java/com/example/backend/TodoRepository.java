package com.example.backend;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepository {

    private final Map<String, Todo> todos = new HashMap<>();

    public List<Todo> getAllTodos() {
        return new ArrayList<>(todos.values());
    }

    public Todo addTodo(Todo todoToAdd) {
        todos.put(todoToAdd.id(), todoToAdd);
        return todoToAdd;
    }
}