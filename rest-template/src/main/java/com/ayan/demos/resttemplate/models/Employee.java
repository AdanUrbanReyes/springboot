package com.ayan.demos.resttemplate.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;

}
