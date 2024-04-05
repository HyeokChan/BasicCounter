package com.counter.basic.counterapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${react.base.url}")
    private String reactBaseUrl;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해
                .allowedOriginPatterns("*") // 모든 출처 허용
                .allowedMethods("*") // 모든 HTTP 메소드 허용
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true).maxAge(3600); // 쿠키를 포함한 요청 허용 및 pre-flight 캐시 시간 설정
    }
}