package com.godfather.user.enums;

public enum HandlerMessage {
    USER_CREATE(1, "Create user sucsses"),
    USER_NOT_FOUND(2, "User not found");

    HandlerMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;
    public String getMessage() {
        return message;
    }
    public int getCode() { return code; }
}
