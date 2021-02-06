package com.godfather.user.service;

import com.godfather.user.dto.UserDto;
import org.springframework.data.domain.Page;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto findById(Long id);
    Page<UserDto> findAll(int page, int size);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);
}
