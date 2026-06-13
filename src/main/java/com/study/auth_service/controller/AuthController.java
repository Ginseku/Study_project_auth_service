package com.study.auth_service.controller;

import com.study.auth_service.DTO.request.LoginRequest;
import com.study.auth_service.DTO.request.RegisterRequest;
import com.study.auth_service.DTO.response.RegisterResponse;
import com.study.auth_service.service.AuthService;
import com.study.auth_service.service.AuthServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthServiceImpl authServiceImpl;

    public AuthController(AuthServiceImpl authServiceImpl) {
        this.authServiceImpl = authServiceImpl;
    }


    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegisterRequest request){
        authServiceImpl.registerUser(request);
        return new RegisterResponse("register done");
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest request){
        return "logged";
    }

    @GetMapping("/me")
    public String getMe(){ //get Bearer token for get "ME"
        return "me";
    }
}
