package com.counter.basic.counterapp;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorize -> authorize
                        .anyRequest().permitAll() // 모든 요청에 대해서 접근을 허용
                )
                .formLogin().disable() // 폼 로그인 비활성화
                .httpBasic().disable(); // HTTP 기본 인증 비활성화

        return http.build();
    }
}