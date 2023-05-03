package com.example.homework65.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer product_id;

@Column(length = 45)
private String name;

@Column(length = 200)
private String description;

@Column
private Integer number;

@Column
private Integer price;
}