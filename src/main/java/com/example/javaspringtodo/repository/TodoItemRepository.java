package com.example.javaspringtodo.repository;

import com.example.javaspringtodo.entity.TodoItem;
import com.example.javaspringtodo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    Optional<TodoItem> findById(Long id);
    List<TodoItem> findByUser(User user);

    List<TodoItem> findAll();
}
