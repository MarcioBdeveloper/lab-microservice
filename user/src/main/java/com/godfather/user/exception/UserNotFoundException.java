package com.godfather.user.exception;

import com.godfather.user.enums.HandlerMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super(HandlerMessage.USER_NOT_FOUND.getMessage());
    }
}
