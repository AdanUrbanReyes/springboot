package com.ayan.demos.resttemplate.resources;

import com.ayan.demos.resttemplate.daos.AyanEmployeeDAO;
import com.ayan.demos.resttemplate.models.AyanEmployee;
import com.ayan.demos.resttemplate.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class AyanEmployeeResource {

    @Autowired
    private AyanEmployeeDAO ayanEmployeeDAO;

    @GetMapping(path = "employee/ayan")
    public AyanEmployee fetch() {
        return new AyanEmployee(1, "Adan", "Urban", 26, 32000, LocalDate.of(1993, 12, 29));
    }


    @GetMapping(path = "employee/ayan/{codigo}")
    public ResponseEntity<AyanEmployee> fetch(@PathVariable(name = "codigo") int codigo) {
        return ResponseEntity.status(codigo).body(new AyanEmployee(1, "Adan", "Urban", 26, 32000, LocalDate.of(1993, 12, 29)));
    }

    @GetMapping(path = "from-rest-template/employee/ayan")
    public Employee fetchFromRestTemplate() {
        return ayanEmployeeDAO.fetchFromRestTemplate();
    }

    @GetMapping(path = "from-rest-template/employee/ayan/{codigo}")
    public Employee fetchFromRestTemplate(@PathVariable(name = "codigo") int codigo) {
        return ayanEmployeeDAO.fetchFromRestTemplate(codigo);
    }

    @GetMapping(path = "employee/ayan/error/500")
    public AyanEmployee fetch500() {
        String s = null;
        if (s.split(",").length == 0) {
            return null;
        }
        return new AyanEmployee(1, "Adan", "Urban", 26, 32000, LocalDate.of(1993, 12, 29));
    }

}
