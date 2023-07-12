package com.flutter.baas.member.repository;

import com.flutter.baas.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Optional<Member> findByEmail(String email);
}
/*
* 리포지터리는 엔티티에 의해 생성된 데이터베이스 테이블에 접근하는 메서드들을 사용하기 위한 인터페이스이다.
* CRUD 처리하는 정의하는 계층이 레포지터리이다.
* */