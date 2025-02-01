package com.wp.todo.dao;

import com.wp.todo.Model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TodoDao{

    Logger logger = LoggerFactory.getLogger(TodoDao.class);

    private JdbcTemplate jdbcTemplate;

    public TodoDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        String createTable = "create table IF NOT EXISTS Todos1(id int primary key,title varchar(25),content varchar(50),status varchar(40), addedDate datetime, todoDate datetime)";
        int update = jdbcTemplate.update(createTable);
        logger.info("TODO TABLE CREATED {}",update);
    }


    public Todo saveTodo(Todo todo){
        String query = "insert into Todos1(id,title,content,status,addedDate,toDoDate) values(?,?,?,?,?,?);";
        jdbcTemplate.update(query,todo.getId(),todo.getTitle(),todo.getContent(),todo.getStatus(),todo.getAddedDate(),todo.getToDoDate());
        return todo;
    }
}