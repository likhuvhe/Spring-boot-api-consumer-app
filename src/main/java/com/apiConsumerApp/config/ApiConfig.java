package com.apiConsumerApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;

@Configuration
public class ApiConfig {

    @Value("${api.username}")
    private String apiUsername;

    @Value("${api.password}")
    private String apiPassword;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(apiUsername, apiPassword);
        headers.setContentType(MediaType.APPLICATION_JSON);

        restTemplate.setInterceptors(List.of((httpRequest, bytes, execution) -> {
            httpRequest.getHeaders().addAll(headers);
            return execution.execute(httpRequest, bytes);
        }));

        return restTemplate;
    }
}

