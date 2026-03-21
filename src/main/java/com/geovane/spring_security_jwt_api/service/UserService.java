package com.geovane.spring_security_jwt_api.service;

import com.geovane.spring_security_jwt_api.dto.UserResponse;
import com.geovane.spring_security_jwt_api.mapper.UserMapper;
import com.geovane.spring_security_jwt_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAll() {
        return userRepository.findAll().stream().map(UserMapper::toUserResponse).toList();
    }

    public UserResponse getUser(Authentication authentication) {
        return UserMapper.toUserResponse(
                userRepository.findByEmail(authentication.getName()).orElseThrow(() -> new RuntimeException("User not found."))
        );
    }

}
