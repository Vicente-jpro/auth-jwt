package com.example.authjwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UsuarioController {
    @GetMapping("/")
    public String hello(){
        return "Hello from spring boot";
    }
}
