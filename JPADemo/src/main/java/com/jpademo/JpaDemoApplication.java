package com.jpademo;

import com.jpademo.entities.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	//Only for testing purpose
	@Override
	public void run(String... args) throws Exception {
		Todo todo = new Todo();
		todo.setId(101);
		todo.setTitle("Learn Java");
		todo.setContent("LEarn java in easy way");
		todo.setStatus("Completed");
		todo.setAddedDate(new Date("10/10/2001"));
		todo.setTodoDate(new Date("12/12/2001"));

		System.out.println(todo.getId());
		System.out.println(todo);
	}
}
