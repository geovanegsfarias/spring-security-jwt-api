package com.geovane.spring_security_jwt_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "JWT Token Response DTO", description = "DTO for JWT token")
public record TokenResponse(@Schema(description = "The JWT token", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30") String token) {
}