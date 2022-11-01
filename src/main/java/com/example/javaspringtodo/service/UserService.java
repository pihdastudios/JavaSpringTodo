package com.example.javaspringtodo.service;

import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.entity.User;

import java.util.Optional;

public interface UserService {
    boolean saveUser(UserDto userDto);
    Optional<User> findByUserNumber(Long userNumber);
}
