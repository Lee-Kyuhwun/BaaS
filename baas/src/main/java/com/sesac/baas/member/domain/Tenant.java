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


    @OneToMany
    @JoinColumn(name = "apiId", nullable = false)
    private ApiKey apiKey;


}

//(origin)dev<-(origin)feature/#41<-개인 브랜치

//(origin)dev<-(origin)feature/#41 <-이것만
//(origin)feature/#41<-개인 브랜치

//(remote)back-hun <- (origin)back-hun

// feature/#41
// backhun1 <- 제 backhun1 리퀘스트
// 승인
// backhun1에서 두개 같이 합쳐진다
/*
* 포크한 리포지토리에서 작업한 후 풀 리퀘스트(Pull Request)를 생성하면, 원본 리포지토리의 소유자(또는 권한을 가진 사람)에게 변경 사항을 병합(merge)해 달라는 요청을 보내게 됩니다.

병합 요청을 받은 소유자는 변경 사항을 리뷰하고 승인할지
* 여부를 결정할 수 있습니다.
* 변경 사항이 승인되고 병합되면,
* 원본 리포지토리의 해당 브랜치(`back-hun1`)에 당신의 변경 사항이 추가됩니다.

포크한 리포지토리에서 작업한 변경 사항은
* 포크한 리포지토리 안에만 존재하며, 풀 리퀘스트를 통해 원본 리포지토리와 동기화될 수 있습니다.

따라서 당신의 변경 사항은 풀 리퀘스트가 승인되고 병합되기 전까지는 원본 리포지토리의 `back-hun1` 브랜치에 저장되지 않습니다.
* */