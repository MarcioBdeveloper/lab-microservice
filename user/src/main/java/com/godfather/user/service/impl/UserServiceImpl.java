package com.godfather.user.service.impl;

import com.godfather.user.dto.UserDto;
import com.godfather.user.exception.UserNotFoundException;
import com.godfather.user.mapper.UserMapper;
import com.godfather.user.model.User;
import com.godfather.user.repository.UserRepository;
import com.godfather.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        log.info("M=createUser, create new user");
        User user = userRepository.save(userMapper.userDtoToUser(userDto));
        return userMapper.userToUserDto(user);
    }

    @Override
    public UserDto findById(Long id) {
        log.info("M=findById, find user by id");
        User user = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        return userMapper.userToUserDto(user);
    }

    @Override
    public Page<UserDto> findAll(int page, int size) {
        log.info("M=findAll, find all users");
        Page<User> pageUsers = userRepository.findAll(PageRequest.of(page, size));
        return userMapper.userPageToUserPageDto(pageUsers);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        log.info("M=updateUser, find user and update");
        User userUpdate = userRepository.findById(userDto.getUserId()).orElseThrow(UserNotFoundException::new);
        userUpdate.setFone(userDto.getFone());
        userUpdate.setName(userDto.getName());
        userRepository.save(userUpdate);
        return userMapper.userToUserDto(userUpdate);
    }

    @Override
    public void deleteUser(Long id) {
        log.info("M=deleteUser, find user and delete");
        User userDelete = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        userRepository.delete(userDelete);
    }
}
