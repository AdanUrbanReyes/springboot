package com.ayan.demos.resttemplate.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @JsonProperty("name")
    private String nombre;
    @JsonProperty("surname")
    private String apellidos;
    @JsonProperty("age")
    private int edad;
    @JsonProperty("salary")
    private double salario;
    @JsonProperty("birth")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate nacimiento;
}
