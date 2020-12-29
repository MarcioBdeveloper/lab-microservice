package com.godfather.user.service;

import com.godfather.user.model.User;

public interface UserService {
    User findById(Long id);
    User createUser(User user);
    void deleteUser(User user);
    User updateUser(User user);
}
