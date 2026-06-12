package com.study.auth_service.controller;

import com.study.auth_service.DTO.request.LoginRequest;
import com.study.auth_service.DTO.request.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterRequest request){
        return "register";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest request){
        return "logged";
    }

}
