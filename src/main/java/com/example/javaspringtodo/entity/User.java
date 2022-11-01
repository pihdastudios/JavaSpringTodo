package com.example.javaspringtodo.entity;

import com.example.javaspringtodo.dto.UserDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Setter
@Getter
@Accessors(chain = true)
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private Long userNumber;

    public User(UserDto userDto) {
        userNumber = userDto.getUserNumber();
    }

    public User() {

    }
}
