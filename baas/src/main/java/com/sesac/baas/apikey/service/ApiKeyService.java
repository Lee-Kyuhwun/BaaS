package com.sesac.baas.apikey.service;


import com.sesac.baas.apikey.domain.ApiKey;
import com.sesac.baas.apikey.repository.ApiKeyRepository;
import com.sesac.baas.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;


// API키를 생성하고 저장하는 역할입니다.
@Service
@RequiredArgsConstructor
public class ApiKeyService {

    //Spring Data Jpa를 이용한 ApiKeyRepository를 주입한다.
    private final ApiKeyRepository apiKeyRepository;


    //API 키를 생성하고 DB에 저장하는 메서드
    public ApiKey createApiKey(Member member){

        // UUID를 이용해서 랜덤한 api키를 생성합니다.
        String key = UUID.randomUUID().toString();


        //api키의 만료일을 현재로부터 3달 후로 설정합니다.
        LocalDateTime expireDate = LocalDateTime.now().plusMonths(3);

        // ApiKey 객체를 생성합니다.
        ApiKey apiKey = new ApiKey(key, expireDate);

        // ApiKey를 저장합니다.
        return apiKeyRepository.save(apiKey);
    }



}
