package com.godfather.user.dto;

import org.springframework.data.domain.PageRequest;

public class UserPageDto {

    private int page;
    private int size;
    private PageRequest pageRequest;
}
