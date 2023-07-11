package com.example.mapstructtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserDto {
    private String id;
    private String userName;
    private int age;
    private String email;
}
