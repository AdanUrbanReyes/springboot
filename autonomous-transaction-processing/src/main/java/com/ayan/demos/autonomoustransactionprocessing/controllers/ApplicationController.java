package com.ayan.demos.autonomoustransactionprocessing.controllers;

import com.ayan.demos.autonomoustransactionprocessing.entities.Application;
import com.ayan.demos.autonomoustransactionprocessing.repositories.ApplicationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("application")
@Slf4j
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping(path = "find-all"
            , produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8"})
    public ResponseEntity<List<Application>> findAll() {
        List<Application> as = applicationRepository.findAll();
        as.forEach(a -> log.info(a.toString()));
        return ResponseEntity.ok(as);
    }

    @GetMapping(path = "save"
            , produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8"})
    public ResponseEntity<Application> save(@PathParam("id") Short id, @PathParam("name") String name) {
        Application a = new Application(id, name, LocalDateTime.now());
        applicationRepository.save(a);
        log.info(a.toString());
        return ResponseEntity.ok(a);
    }

}
