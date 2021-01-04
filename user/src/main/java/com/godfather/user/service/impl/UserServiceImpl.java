package com.godfather.user.service.impl;

import com.godfather.user.dto.UserDto;
import com.godfather.user.model.User;
import com.godfather.user.repository.UserRepository;
import com.godfather.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto crateUser(UserDto userDto) {
        User user = userRepository.save(userDto.getUser());
        return UserDto.builder()
                .name(user.getName())
                .fone(user.getFone())
                .build();
    }

    @Override
    public UserDto findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.isPresent() ? UserDto.builder()
                .name(user.get().getName())
                .fone(user.get().getFone())
                .build()
            : new UserDto();
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
