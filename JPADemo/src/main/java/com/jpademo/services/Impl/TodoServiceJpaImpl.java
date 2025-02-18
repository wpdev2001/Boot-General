package com.jpademo.services.Impl;

import com.jpademo.entities.Todo;
import com.jpademo.repositories.TodoJpaRepository;
import com.jpademo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceJpaImpl implements TodoService {
    @Autowired
    TodoJpaRepository jpaRepository;

    @Override
    public Todo createTodo(Todo todo) {
        Todo todo1 = jpaRepository.save(todo);
        return todo1;
    }
}
