package com.example.javaspringtodo.service;

import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.entity.User;
import com.example.javaspringtodo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public boolean saveUser(UserDto userDto) {
        userRepository.save(new User(userDto));
        return true;
    }

    @Override
    public Optional<User> findByUserNumber(Long userNumber) {
        return userRepository.findByUserNumber(userNumber);
    }
}
