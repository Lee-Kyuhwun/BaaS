package com.sesac.baas.login.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class loginController {

    // 로그인 컨트롤러 입니다.
    @PostMapping("/login")
    public void login(@RequestParam String id, @RequestParam String password){


    }

}