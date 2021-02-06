package com.godfather.user.mapper;

import com.godfather.user.dto.UserDto;
import com.godfather.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDtoToUser(UserDto userDto) {
        return User.builder()
                .name(userDto.getName())
                .fone(userDto.getFone())
                .userId(userDto.getUserId())
                .build();
    }

    @Override
    public UserDto userToUserDto(User user) {
        return UserDto.builder()
                .name(user.getName())
                .fone(user.getFone())
                .userId(user.getUserId())
                .build();
    }

    @Override
    public Page<UserDto> userPageToUserPageDto(Page<User> page) {
        return null;
    }
}
