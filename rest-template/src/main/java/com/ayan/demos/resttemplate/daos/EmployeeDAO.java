package com.ayan.demos.resttemplate.daos;

import com.ayan.demos.resttemplate.models.AyanEmployee;
import com.ayan.demos.resttemplate.models.Empleado;
import com.ayan.demos.resttemplate.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.time.LocalDate;

@Component
@Slf4j
public class EmployeeDAO extends DefaultResponseErrorHandler {

    @Autowired
    private RestTemplate restTemplate;

    public Employee fetchFromRestTemplateWithoutHandler() {
        RestTemplate rt = new RestTemplate();
        AyanEmployee ae = new AyanEmployee();
        String[] us = new String[]{"http://localhost:8080/employe", "http://localhost:8080/employee"};
        for (String u : us) {
            ae = rt.getForObject(u, AyanEmployee.class);
        }
        return ae;
    }

    public Employee fetchFromRestTemplate() {
        restTemplate.setErrorHandler(this);
        AyanEmployee ae = new AyanEmployee();
        String[] us = new String[]{"http://localhost:8080/employe", "http://localhost:8080/employee"};
        for (String u : us) {
            ae = restTemplate.getForObject(u, AyanEmployee.class);
        }
        return ae;
    }

    public Empleado fetchFromRestTemplateSpanish() {
        restTemplate.setErrorHandler(this);
        Empleado e = new Empleado();
        String[] us = new String[]{"http://localhost:8080/employe", "http://localhost:8080/employee"};
        for (String u : us) {
            e = restTemplate.getForObject(u, Empleado.class);
        }
        return e;
    }

    public Employee saveFromRestTemplate(Empleado empleado) {
        restTemplate.setErrorHandler(this);
        return restTemplate.postForObject("http://localhost:8080/employee", empleado, Employee.class);
    }


    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        log.warn("{ \"code\" : {}, \"text\" : \"{}\"}", response.getStatusCode(), response.getStatusText());
    }

}
