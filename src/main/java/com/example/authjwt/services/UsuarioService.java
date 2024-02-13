package com.example.authjwt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.authjwt.dto.UsuarioRequest;
import com.example.authjwt.dto.UsuarioResponse;
import com.example.authjwt.models.Usuario;
import com.example.authjwt.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


    public UsuarioResponse salvar(UsuarioRequest usuarioReq){
        log.info("Salvando o usuario...");
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioReq, usuario);

        Usuario usuarioSlavo =  usuarioRepository.save(usuario);

        UsuarioResponse usuarioResponse = new UsuarioResponse();
        BeanUtils.copyProperties(usuarioSlavo, usuarioResponse);
        return usuarioResponse;

    }

    public List<UsuarioResponse> listarTodos(){
        log.info("Listando o usuario...");
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioResponse> usuarioResponses = new ArrayList<>();

        BeanUtils.copyProperties(usuarios, usuarioResponses);
        return usuarioResponses;
    }

    public Usuario getUserByUsername(String username) throws UsernameNotFoundException{
        log.info("Buscando usuario: {}", username);
        return usuarioRepository.findByUsername(username)
                                .orElseThrow(
                                    ()-> new UsernameNotFoundException("Usuario não encontrado"));
    }
}
