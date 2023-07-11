package com.example.mapstructtest;


import org.mapstruct.*;

@Mapper(builder = @Builder(disableBuilder = true),
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UserMapper {
    User toUser(UserDto dto);
    UserDto toDto(User user);
}
