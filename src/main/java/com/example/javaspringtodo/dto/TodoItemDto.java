package com.example.javaspringtodo.dto;

import com.example.javaspringtodo.entity.TodoItem;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Setter
@Getter
@Accessors(chain = true)
@ToString
public class TodoItemDto {
    private Long id;

    private Long userNumber;

    private String message;

    private Boolean status;

    public TodoItemDto() {

    }

    public TodoItemDto(TodoItem todoItem) {
        id = todoItem.getId();
        userNumber = todoItem.getUser().getUserNumber();
        status = todoItem.getStatus();
        message = todoItem.getMessage();
    }
}
