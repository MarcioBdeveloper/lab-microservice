package com.godfather.user.mapper;

import com.godfather.user.dto.UserDto;
import com.godfather.user.model.User;
import org.springframework.data.domain.Page;

public interface UserMapper {
    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);
    Page<UserDto> userPageToUserPageDto(Page<User> page);
}
