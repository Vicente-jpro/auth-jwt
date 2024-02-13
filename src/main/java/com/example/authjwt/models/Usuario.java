package com.example.authjwt.models;

import com.example.authjwt.enums.RoleEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Long id;

 @Column(name = "name")
 private String name;

 @Column(name = "username")
 private String username;

 @Column(name = "password")
 private String password;

 @Enumerated(EnumType.STRING)
 private RoleEnum roles;
    
}
