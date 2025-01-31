package com.example.homework65.service;

import com.example.homework65.entity.Product;
import com.example.homework65.exception.ProductNotFoundException;
import com.example.homework65.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService{

    private final ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Product findProductByName(String name) {
        return productRepository.findByName(name);
    }
    public Optional<Product> findProductById(Integer id) {
        return Optional.ofNullable(productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id)));
    }

    @Transactional(readOnly = true)
    public Product findProductByNumber(Integer number) {
        return productRepository.findByNumber(number);
    }


    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Page<Product> findProductsByNameContaining(String name, Pageable pageable) {
        return productRepository.findByNameContaining(name, pageable);
    }

    @Transactional(readOnly = true)
    public Page<Product> findProductsByPriceLessThanEqual(Double price, Pageable pageable) {
        return productRepository.findByPriceLessThanEqual(price, pageable);
    }

    @Transactional(readOnly = true)
    public Page<Product> findProductsByCategoryName(String category, Pageable pageable) {
        return productRepository.findByCategoryName(category, pageable);
    }
}

