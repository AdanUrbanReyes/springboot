package com.ayan.demos.resttemplate.resources;

import com.ayan.demos.resttemplate.daos.EmployeeDAO;
import com.ayan.demos.resttemplate.models.Empleado;
import com.ayan.demos.resttemplate.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDate;

@RestController
@Slf4j
public class EmployeeResource {

    @Autowired
    EmployeeDAO employeeDAO;

    @GetMapping(path = "employee")
    public Employee fetch() {
        return new Employee("Alejandra", "Rios Palacios", 26, 37000, LocalDate.of(1993, 9, 11));
    }

    @GetMapping(path = "from-rest-template/employee")
    public Employee fetchFromRestTemplate() {
        return employeeDAO.fetchFromRestTemplate();
    }

    @GetMapping(path = "from-rest-template/spanish/employee")
    public Empleado fetchFromRestTemplateSpanish() {
        return employeeDAO.fetchFromRestTemplateSpanish();
    }

    @GetMapping(path = "from-rest-template/without-handler/employee")
    public Employee fetchFromRestTemplateWithoutHandler() {
        Employee e = new Employee();
        try {
            e = employeeDAO.fetchFromRestTemplateWithoutHandler();
        } catch (HttpClientErrorException x) {
            System.out.println(x);
        }
        return e;
    }

    @GetMapping(path = "save/from-rest-template/employee")
    public Employee saveFromRestTemplate() {
        return employeeDAO.saveFromRestTemplate(new Empleado("Abigail", "Martines", 20, 500, LocalDate.now()));
    }

    @PostMapping(path = "employee")
    public Employee save(@RequestBody Employee employee) {
        return employee;
    }

}