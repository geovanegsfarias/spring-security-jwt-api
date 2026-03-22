package com.geovane.spring_security_jwt_api.dto;

import com.geovane.spring_security_jwt_api.model.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "User Response DTO", description = "DTO for details of a user")
public record UserResponse(
        @Schema(description = "The user identifier", example = "1")Long id,
        @Schema(description = "The user email", example = "admin@gmail.com") String email,
        @Schema(description = "The user role", example = "ROLE_ADMIN") UserRole role) {
}