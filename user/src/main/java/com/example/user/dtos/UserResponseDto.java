package com.example.user.dtos;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserResponseDto {
    private ResponseStatus responseStatus;
    private Long userId;
}
