package com.study.auth_service.service;

import com.study.auth_service.DTO.request.RegisterRequest;

public interface AuthService {
    void registerUser(RegisterRequest request);
}
