package com.example.mapstructtest.config;

import com.example.mapstructtest.mapper.UserMapper;
import com.example.mapstructtest.mapper.UserMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.boot.test.context.TestConfiguration
public class TestConfiguration {
    @Bean
    @Primary
    UserMapper userMapper() {
        return new UserMapperImpl();
    }
}
