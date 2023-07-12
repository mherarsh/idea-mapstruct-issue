package com.example.mapstructtest.mapper;


import com.example.mapstructtest.User;
import com.example.mapstructtest.UserDto;
import org.mapstruct.*;

@Mapper(builder = @Builder(disableBuilder = true),
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UserMapper {
    User toUser(UserDto dto);
    UserDto toDto(User user);
}
