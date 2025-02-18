package com.jpademo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "new_jpa_todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "todo_title",length = 50)
    private String title;
    private String content;
    private String status;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date addedDate;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date todoDate;
}
