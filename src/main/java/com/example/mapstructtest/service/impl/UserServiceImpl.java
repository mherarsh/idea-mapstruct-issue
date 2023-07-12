package com.example.mapstructtest.service.impl;

import com.example.mapstructtest.UserDto;
import com.example.mapstructtest.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.example.mapstructtest.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

//    @Autowired
//    private UserMapper userMapper;

    @Override
    public UserDto create(UserDto userDto) {
        var user = userMapper.toUser(userDto);

        return null;
    }
}
