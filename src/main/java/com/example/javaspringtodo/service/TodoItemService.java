package com.example.javaspringtodo.service;

import com.example.javaspringtodo.dto.TodoItemDto;
import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.entity.TodoItem;

import java.util.List;

public interface TodoItemService {
    boolean save(TodoItemDto todoItemDto);
    boolean update(TodoItemDto todoItemDto);
    boolean delete(TodoItemDto todoItemDto);
    boolean delete(Long id);
    List<TodoItem> findByUser(Long userNumber);
    List<TodoItem> findAll();
}
