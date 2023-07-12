package com.flutter.baas.login.service;


import com.flutter.baas.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class loginService {

    private final MemberRepository memberRepository;



}
