package com.geovane.spring_security_jwt_api.mapper;

import com.geovane.spring_security_jwt_api.dto.UserResponse;
import com.geovane.spring_security_jwt_api.model.User;

public class UserMapper {

    public static UserResponse toUserResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getRole()
        );
    }

}