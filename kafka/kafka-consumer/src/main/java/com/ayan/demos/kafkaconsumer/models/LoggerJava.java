package com.ayan.demos.kafkaconsumer.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoggerJava {

    private Integer application;
    private String clazz;
    private String method;

}
