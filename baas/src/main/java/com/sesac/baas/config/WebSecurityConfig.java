/*
package com.sesac.baas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
@EnableWebSecurity
@Configuration
public class WebSecurityConfig{


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // 필터 체인을 설정하는 부분입니다. 이 부분에서 httpSecurity에 각종 설정을 수행합니다.
        http
                .csrf().disable() // CSRF 보호 기능을 비활성화합니다.
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 세션 관리 전략을 설정합니다. API 서버에서는 일반적으로 세션을 유지하지 않으므로 STATELESS로 설정합니다.
                .and()
                .addFilter(apiKeyAuthFilter) // 앞에서 작성한 API 키 인증 필터를 추가합니다.
                .authorizeRequests() // 인증 요청에 대한 권한을 설정합니다.
                .antMatchers("/api/auth/**").permitAll() // "/api/auth/**" 경로로 시작하는 요청은 모두 허용합니다.
                .anyRequest().authenticated() // 그 외의 모든 요청은 인증이 필요합니다.
                .and()
                .authenticationProvider(apiKeyAuthenticationProvider); // 앞에서 작성한 API 키 인증 공급자를 설정합니다.

        return http.build();
    }
}

*/
