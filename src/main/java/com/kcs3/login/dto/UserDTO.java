package com.kcs3.login.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private Long userId;
    private String userNickname;
    private String email;
}
