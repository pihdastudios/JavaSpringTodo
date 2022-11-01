package com.example.javaspringtodo.entity;

import com.example.javaspringtodo.dto.TodoItemDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Accessors(chain = true)
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


    private String message;

    @ManyToOne
    private User user;

    private Boolean status;
    public TodoItem(TodoItemDto todoItemDto, User user) {
        id = todoItemDto.getId();
        message = todoItemDto.getMessage();
        status = todoItemDto.getStatus();
        this.user = user;
    }
    public TodoItem() {

    }
}
