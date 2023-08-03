package com.sesac.baas.member.domain;


//import com.sesac.baas.apikey.domain.ApiKey;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity  // 이 클래스는 데이터베이스의 테이블을 나타냅니다.
@Getter  // Lombok 라이브러리를 이용해 getter 메소드를 자동으로 생성합니다.
@NoArgsConstructor
@Table(name = "member")  // 이 클래스를 매핑할 데이터베이스 테이블의 이름을 명시합니다.
public class Member {
    @Id  // 이 필드는 테이블의 Primary Key를 나타냅니다.
//    @GeneratedValue(strategy = GenerationType.AUTO)  // Primary Key 값이 자동으로 생성되도록 합니다.
    private Integer userId;

    @Column(name = "password")  // 이 필드는 데이터베이스의 'password' 컬럼을 나타냅니다.
    private String password;

    @ManyToOne  // 이 필드는 N:1 관계를 나타냅니다.
    @JoinColumn(name = "tenant_id", nullable = false)  // 이 필드는 외래 키로 사용되며, 'tenant_id' 컬럼을 나타냅니다. null을 허용하지 않습니다.
    private Tenant tenant;


}
