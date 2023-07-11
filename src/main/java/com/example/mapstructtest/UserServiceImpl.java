package com.example.mapstructtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    /*private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }*/

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto create(UserDto userDto) {
        var user = userMapper.toUser(userDto);

        return null;
    }
}
