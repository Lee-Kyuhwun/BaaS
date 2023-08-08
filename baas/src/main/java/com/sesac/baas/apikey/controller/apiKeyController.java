package com.sesac.baas.apikey.controller;


import com.sesac.baas.apikey.domain.ApiKey;
import com.sesac.baas.apikey.service.ApiKeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class apiKeyController {

    private final ApiKeyService apiKeyService;

    @PostMapping("/key")
    public ResponseEntity<ApiKey> generateKey(){


    }

}
