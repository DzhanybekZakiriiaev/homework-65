package com.example.homework65.repository.product;

import com.example.homework65.entity.Product;
import com.example.homework65.repository.common.BaseRepository;

public interface ProductRepository extends BaseRepository<Product, Integer> {
    Product findByName(String name);
    Product findByNumber(Integer number);
}
