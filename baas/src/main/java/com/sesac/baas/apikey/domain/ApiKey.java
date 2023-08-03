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

    private LocalDateTime expireDate;


    @OneToOne
    @JoinColumn(name = "tenantId")
    private Tenant tenant;

}
