package com.esprit.service;

import com.esprit.model.Todo;
import com.esprit.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(String description) {
        Todo todo = Todo.builder().description(description).build();
        this.todoRepository.save(todo);
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();

    }
}
