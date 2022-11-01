package com.example.javaspringtodo.repository;

import com.example.javaspringtodo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserNumber(Long userNumber);
}
