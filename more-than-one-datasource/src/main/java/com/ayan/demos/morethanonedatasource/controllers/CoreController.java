package com.ayan.demos.morethanonedatasource.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("core")
public class CoreController {

    @Autowired
    private com.ayan.demos.morethanonedatasource.repositories.datasource1.UserCoreRepository userCoreRepository1;

    @Autowired
    private com.ayan.demos.morethanonedatasource.repositories.datasource2.UserCoreRepository userCoreRepository2;

    @GetMapping(path = "users1")
    public ResponseEntity<List<com.ayan.demos.morethanonedatasource.entities.datasource1.UserCore>> getUsers1() {
        return ResponseEntity.ok(userCoreRepository1.findAll());
    }

    @GetMapping(path = "users2")
    public ResponseEntity<List<com.ayan.demos.morethanonedatasource.entities.datasource2.UserCore>> getUsers2() {
        return ResponseEntity.ok(userCoreRepository2.findAll());
    }

}
