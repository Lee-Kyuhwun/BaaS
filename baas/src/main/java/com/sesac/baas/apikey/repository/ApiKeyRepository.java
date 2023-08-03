package com.sesac.baas.apikey.repository;

import com.sesac.baas.apikey.domain.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiKeyRepository extends JpaRepository<ApiKey, String> {
    //jpaRepository가 알아서 해주니
    Optional<ApiKey> findByKey(String key);

}
