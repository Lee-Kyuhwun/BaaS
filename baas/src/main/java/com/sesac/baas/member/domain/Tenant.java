package com.sesac.baas.member.domain;


import com.sesac.baas.apikey.domain.ApiKey;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity  // 이 클래스는 데이터베이스의 테이블을 나타냅니다.
@Getter  // Lombok 라이브러리를 이용해 getter 메소드를 자동으로 생성합니다.
//@Builder
//@AllArgsConstructor  // 모든 필드 값을 인자로 받는 생성자를 자동으로 생성합니다.
@NoArgsConstructor  // 인자 없는 기본 생성자를 자동으로 생성합니다.
@Table(name = "tenant")
public class Tenant {
    @Id  // 이 필드는 테이블의 Primary Key를 나타냅니다.
    @GeneratedValue(strategy = GenerationType.AUTO)  // Primary Key 값이 자동으로 생성되도록 합니다.
    private Long tenantId;

    @Column(nullable = false, unique = true)  // 이 필드는 데이터베이스의 컬럼을 나타내며, null을 허용하지 않으며, 값은 유일해야 합니다.
    private String name;

    @OneToMany(mappedBy = "tenant")  // 이 필드는 1:N 관계를 나타내며, 'tenant' 필드를 기반으로 'Member' 엔티티와의 관계를 매핑합니다.
    private List<Member> members;


    @OneToOne
    @JoinColumn(name = "apiId", nullable = false)
    private ApiKey apiKey;


}
