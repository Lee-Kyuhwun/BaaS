package com.sesac.baas.apikey.domain;


import com.sesac.baas.member.domain.Member;
import com.sesac.baas.member.domain.Tenant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ApiKey {

    @Id
    private String apiId;

    // api 키
    private String key;

    // 만료일자
    private LocalDateTime expireDate;

    // 테넌트하고 묶어줍니다. 
    @OneToMany(mappedBy = "apiKey")
    private Tenant tenant;

    public ApiKey(String key, LocalDateTime expireDate) {
        this.key = key;
        this.expireDate = expireDate;
    }
}
