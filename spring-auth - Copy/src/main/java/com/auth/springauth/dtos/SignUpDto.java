package com.auth.springauth.dtos;

import com.auth.springauth.enums.UserRole;

public record SignUpDto(
    String login,
    String password,
    UserRole role) {
}
