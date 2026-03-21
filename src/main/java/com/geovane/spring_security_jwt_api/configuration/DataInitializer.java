package com.geovane.spring_security_jwt_api.configuration;

import com.geovane.spring_security_jwt_api.model.User;
import com.geovane.spring_security_jwt_api.model.UserRole;
import com.geovane.spring_security_jwt_api.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner seedUsers(UserRepository userRepository, PasswordEncoder encoder) {
        return args -> {
            userRepository.save(
                    new User("admin@gmail.com", encoder.encode("admin123"), UserRole.ROLE_ADMIN)
            );
            userRepository.save(
                    new User("user@gmail.com", encoder.encode("user123"), UserRole.ROLE_USER)
            );
        };
    }

}