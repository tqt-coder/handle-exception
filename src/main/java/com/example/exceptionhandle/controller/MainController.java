package com.example.exceptionhandle.controller;

import com.example.exceptionhandle.service.HandlerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {
    private final HandlerService service;

    public MainController(HandlerService service) {
        this.service = service;
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> test(@PathVariable Integer id){
        return ResponseEntity.ok(service.calculate(id));
    }
}
