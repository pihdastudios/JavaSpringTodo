package com.example.javaspringtodo.controller;

import com.example.javaspringtodo.dto.UserDto;
import com.example.javaspringtodo.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
@CrossOrigin(origins = {"http://localhost:8080"}, maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<?> addUser(UserDto userDto) {
        return userService.saveUser(userDto) ?
                new ResponseEntity<>("User Registered", HttpStatus.CREATED) :
                new ResponseEntity<>("User Number Already Taken", HttpStatus.BAD_REQUEST);

    }
}
