package com.ayan.demos.springbootconfigclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("config")
public class ConfigController {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<String> get(@PathParam("id") String id) {
        return ResponseEntity.ok(environment.getProperty(id));
    }
}
