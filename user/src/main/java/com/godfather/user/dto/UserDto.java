package com.godfather.user.dto;

import com.godfather.user.model.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String fone;

    public User getUser() {
        return User.builder()
                .name(this.name)
                .fone(this.fone)
                .build();
    }
}
