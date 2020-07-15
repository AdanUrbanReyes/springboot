package com.ayan.demos.elklog4j2.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("log")
@Log4j2
public class LogController {

    @GetMapping("simple")
    public ResponseEntity<String> simple(@PathParam("text") String text) {
        log.info(text);
        return ResponseEntity.ok(text);
    }

    @PostMapping("hard")
    public ResponseEntity<String> hard(@RequestBody String text) {
        log.info(text);
        return ResponseEntity.ok(text);
    }

}
