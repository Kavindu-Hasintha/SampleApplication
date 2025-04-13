package com.example.SampleApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/sample")
public class SampleController {

    @GetMapping
    public ResponseEntity<String> getSample() {
        return ResponseEntity.ok("Hello World, Sample Web Service");
    }
}
