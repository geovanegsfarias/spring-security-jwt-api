package com.geovane.spring_security_jwt_api.controller;

import com.geovane.spring_security_jwt_api.dto.TokenResponse;
import com.geovane.spring_security_jwt_api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public ResponseEntity<TokenResponse> authenticate(Authentication authentication) {
        return ResponseEntity.ok(authService.authenticate(authentication));
    }

}