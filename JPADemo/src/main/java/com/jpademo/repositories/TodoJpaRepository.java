package com.jpademo.repositories;

import com.jpademo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<Todo,Integer> {
}
