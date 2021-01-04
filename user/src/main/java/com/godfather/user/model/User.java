package com.godfather.user.model;

import com.godfather.user.dto.UserDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "tb_user")
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long userId;
    private String name;
    private String fone;

    private UserDto getUserDto() {
        return UserDto.builder()
                .name(this.name)
                .fone(this.fone)
                .build();
    }
}
