package com.sesac.baas.apikey.domain;


import com.sesac.baas.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ApiKey {

    @Id
    private Long apiId;

    @Column
    private String keyValue;

    @Column(nullable = false)
    private String status;


    @OneToMany
    @JoinColumn(name = "userId",nullable = false)
    private Member member;

}
