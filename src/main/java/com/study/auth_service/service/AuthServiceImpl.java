package com.study.auth_service.service;

import com.study.auth_service.DTO.request.RegisterRequest;
import com.study.auth_service.Entity.User;
import com.study.auth_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void register(RegisterRequest request) {

        if (userRepository.findByEmail(request.email()).isPresent()){
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);
    }
}
