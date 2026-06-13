package com.study.auth_service.service;

import com.study.auth_service.DTO.request.LoginRequest;
import com.study.auth_service.DTO.request.RegisterRequest;
import com.study.auth_service.DTO.response.LoginResponse;

public interface AuthService {
    void registerUser(RegisterRequest request);
    LoginResponse loginUser(LoginRequest request);
}
