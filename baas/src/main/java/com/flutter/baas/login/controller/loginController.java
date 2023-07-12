package com.flutter.baas.login.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @GetMapping("/login")
    public void login(@PathVariable String id, @PathVariable String password){

    }

}
