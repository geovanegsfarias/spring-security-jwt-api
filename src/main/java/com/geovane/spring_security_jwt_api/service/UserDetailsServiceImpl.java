package com.geovane.spring_security_jwt_api.service;

import com.geovane.spring_security_jwt_api.model.UserAuthenticated;
import com.geovane.spring_security_jwt_api.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .map(user -> new UserAuthenticated(user))
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));
    }

}