package com.example.homework65.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @NotBlank
    @Column(length = 45)
    private String name;

    @URL
    @Column(length = 200)
    private String image;

    @Size(max = 200)
    @Column(length = 200)
    private String description;

    @Size(max = 200)
    @Column(length = 200)
    private String category;

    @PositiveOrZero
    @Column
    private Integer number;

    @Positive
    @Column
    private Integer price;
}