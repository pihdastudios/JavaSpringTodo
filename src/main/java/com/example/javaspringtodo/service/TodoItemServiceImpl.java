package com.example.javaspringtodo.service;

import com.example.javaspringtodo.dto.TodoItemDto;
import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.entity.TodoItem;
import com.example.javaspringtodo.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    @Autowired
    private UserService userService;

    @Autowired
    private TodoItemRepository todoItemRepository;

    @Override
    public boolean save(TodoItemDto todoItemDto) {
        var user = userService.findByUserNumber(todoItemDto.getUserNumber());
        if (user.isEmpty())
            return false;
        todoItemRepository.save(new TodoItem(todoItemDto, user.get()).setId(0L));
        return true;
    }

    @Override
    public boolean update(TodoItemDto todoItemDto) {
        var user = userService.findByUserNumber(todoItemDto.getUserNumber());
        if (user.isEmpty())
            return false;
        todoItemRepository.save(new TodoItem(todoItemDto, user.get()).setId(todoItemDto.getId()));
        return true;
    }

    @Override
    public boolean delete(TodoItemDto todoItemDto) {
        return delete(todoItemDto.getId());
    }

    @Override
    public boolean delete(Long id) {
        todoItemRepository.deleteById(id);
        return true;
    }

    @Override
    public List<TodoItem> findByUser(Long userNumber) {
        return todoItemRepository.findByUser(userService.findByUserNumber(userNumber).orElseThrow());
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItemRepository.findAll();
    }
}
