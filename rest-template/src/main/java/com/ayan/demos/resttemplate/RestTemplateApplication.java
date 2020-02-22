package com.ayan.demos.resttemplate;

import com.ayan.demos.resttemplate.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplatebuilder) {
        return restTemplatebuilder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }


}
