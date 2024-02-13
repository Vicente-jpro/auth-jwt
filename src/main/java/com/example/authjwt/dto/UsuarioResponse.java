package com.example.authjwt.dto;

import com.example.authjwt.enums.RoleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {
    
 private Long id;
 private String name;
 private String username;
 private String password;
 private RoleEnum roles;

}
