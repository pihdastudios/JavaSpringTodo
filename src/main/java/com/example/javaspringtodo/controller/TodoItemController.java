package com.example.javaspringtodo.controller;

import com.example.javaspringtodo.dto.TodoItemDto;
import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/todoItem/")
@CrossOrigin(origins = {"http://localhost:8080"}, maxAge = 3600)
public class TodoItemController {
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("getByUser")
    public ResponseEntity<?> getByUser(UserDto userDto) {
        return new ResponseEntity<>(todoItemService.findByUser(userDto.getUserNumber()).stream().map(TodoItemDto::new).collect(Collectors.toList()), HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<?> addTodoItem(TodoItemDto todoItemDto) {
        return todoItemService.save(todoItemDto) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/")
    public ResponseEntity<?> updateTodoItem(TodoItemDto todoItemDto) {
        return todoItemService.update(todoItemDto) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    //TODO: Add Endpoint
}
