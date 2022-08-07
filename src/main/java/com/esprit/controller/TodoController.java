package com.esprit.controller;

import com.esprit.model.Todo;
import com.esprit.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "todos")
public class TodoController {
    private TodoService todoService;

    @PostMapping("/{description}")
    public void addTodo(@PathVariable(value = "description") String description) {
        this.todoService.addTodo(description);
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getTodos();

    }
}
