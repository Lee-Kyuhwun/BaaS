package com.flutter.baas.login.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;


@Api(value = "Authentication API")
@RestController
public class loginController {

    @ApiOperation(value = "User login", notes = "User can login with their id and password")
    @PostMapping("/login")
    public void login(@RequestBody UserLoginRequest userLoginRequest) {
        // Login logic goes here
    }

    @ApiOperation(value = "User logout", notes = "유저 로그아웃")
    @PostMapping("/logout")
    public void logout() {
        // Logout logic goes here
    }

    @ApiOperation(value = "User registration", notes = "유저 회원가입")
    @PostMapping("/register")
    public void register(@RequestBody UserRegistrationRequest registrationRequest) {
        // Registration logic goes here
    }
}

@Setter
@Getter
class UserLoginRequest {
    private String id;
    private String password;

    // Getters and setters...
}

@Setter
@Getter
class UserRegistrationRequest {
    private String id;
    private String password;

    // Getters and setters...
}