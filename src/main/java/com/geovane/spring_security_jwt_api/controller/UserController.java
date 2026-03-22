package com.geovane.spring_security_jwt_api.controller;

import com.geovane.spring_security_jwt_api.dto.UserResponse;
import com.geovane.spring_security_jwt_api.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "User")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    @Operation(summary = "Get all users", description = "Retrieve a list of all users.")
    public ResponseEntity<List<UserResponse>> getUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping
    @Operation(summary = "Get authenticated user", description = "Retrieve the authenticated user.")
    public ResponseEntity<UserResponse> getMyUser(Authentication authentication) {
        return ResponseEntity.ok(userService.getUser(authentication));
    }

}