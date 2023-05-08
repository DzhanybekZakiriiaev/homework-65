package com.example.homework65.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 128)
    private String name;

    @Column(name = "surname", length = 128)
    private String surname;

    @Column(name = "email", length = 256)
    private String email;

    @Column(name = "password", length = 256)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 32)
    private UserRole role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

}