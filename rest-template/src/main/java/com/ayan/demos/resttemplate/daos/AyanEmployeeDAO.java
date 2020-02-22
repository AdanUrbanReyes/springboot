package com.ayan.demos.resttemplate.daos;

import com.ayan.demos.resttemplate.models.AyanEmployee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
@Slf4j
public class AyanEmployeeDAO extends DefaultResponseErrorHandler {

    @Autowired
    private RestTemplate restTemplate;

    public AyanEmployee fetchFromRestTemplate() {
        restTemplate.setErrorHandler(this);
        AyanEmployee ae = new AyanEmployee();
        String[] us = new String[]{"http://localhost:8080/employee/aya", "http://localhost:8080/employee/ayan"};
        for (String u : us) {
            ae = restTemplate.getForObject(u, AyanEmployee.class);
        }
        return ae;
    }

    public AyanEmployee fetchFromRestTemplate(int codigo) {
        restTemplate.setErrorHandler(this);
        return restTemplate.getForObject(String.format("http://localhost:8080/employee/ayan/%d", codigo), AyanEmployee.class);
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        log.warn("{\"text\" : \"{}\", \"code\" : {}}", response.getStatusText(), response.getStatusCode());
    }

}
