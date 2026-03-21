package com.geovane.spring_security_jwt_api.dto;

import com.geovane.spring_security_jwt_api.model.UserRole;

public record UserResponse(Long id, String email, UserRole role) {
}