package com.ayan.demos.resttemplate.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AyanEmployee extends Employee {

    private int id;

    public AyanEmployee(int id, String name, String surname, int age, double salary, LocalDate birth){
        super(name, surname, age, salary, birth);
        this.id = id;
    }

}
