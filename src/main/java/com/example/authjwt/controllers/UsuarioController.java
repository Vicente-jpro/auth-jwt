package com.example.authjwt.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.authjwt.dto.UsuarioRequest;
import com.example.authjwt.dto.UsuarioResponse;
import com.example.authjwt.services.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/")
    public String hello(){
        return "Hello from spring boot";
    }

    @PostMapping("/users")
    public ResponseEntity<UsuarioResponse> salvar(@RequestBody UsuarioRequest usuarioRequest){
       log.info("Salvar usuario.");
        return ResponseEntity.ok().body(usuarioService.salvar(usuarioRequest));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UsuarioResponse>> lsitar(){
        log.info("Listar usuário.");
        return ResponseEntity.ok().body(usuarioService.listarTodos());
    }

    


}
