package com.geovane.spring_security_jwt_api.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String authenticate() {
        return "token";
    }
}
