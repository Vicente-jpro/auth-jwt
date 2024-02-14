package com.example.authjwt.dto;

import org.springframework.stereotype.Component;

import com.example.authjwt.enums.RoleEnum;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRequest {

 private String name;
 private String username;
 private String password;
 private RoleEnum roles;
    
}
