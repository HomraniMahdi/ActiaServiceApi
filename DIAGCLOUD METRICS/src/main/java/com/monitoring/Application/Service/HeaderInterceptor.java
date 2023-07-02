package com.monitoring.Application.Service;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public class HeaderInterceptor {
    @Value("${token}")
    String token;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        requestTemplate.header(HttpHeaders.CONTENT_TYPE, APPLICATION_JSON_VALUE);        };    }
}
