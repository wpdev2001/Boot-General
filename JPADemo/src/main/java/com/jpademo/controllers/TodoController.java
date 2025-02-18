package com.jpademo.controllers;

import com.jpademo.entities.Todo;
import com.jpademo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {
    //Request flow
    //Controller --> Service(Implementation class) --> Service class uses JpaRepository annotation to perform CRUD operations on DB

    @Autowired
    private TodoService todoService;

    //create Todo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        Todo todo1 = todoService.createTodo(todo);
        return todo1;
    }

    //get All Todo

    //get todo with Id

    //update todo

    //delete todo
}
