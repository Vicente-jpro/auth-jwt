package com.example.authjwt.services;

import org.springframework.stereotype.Service;

import com.example.authjwt.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
}
