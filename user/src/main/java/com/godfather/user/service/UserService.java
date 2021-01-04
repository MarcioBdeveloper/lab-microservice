package com.godfather.user.service;

import com.godfather.user.dto.UserDto;

public interface UserService {
    UserDto crateUser(UserDto user);
    UserDto findById(Long id);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);
}
