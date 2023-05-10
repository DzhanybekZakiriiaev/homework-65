package com.example.homework65.controller;

import com.example.homework65.entity.Product;
import com.example.homework65.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Integer id) {
        productService.deleteProductById(id);
    }

    @GetMapping("/name/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.findProductByName(name);
    }

    @GetMapping("/number/{number}")
    public Product findProductByNumber(@PathVariable Integer number) {
        return productService.findProductByNumber(number);
    }

    @GetMapping("/email/{email}")
    public List<Product> findProductsByEmail(@PathVariable String email) {
        return productService.findProductsByEmail(email);
    }

    @GetMapping("/user/{id}")
    public List<Product> findProductsByUserId(@PathVariable Long id) {
        return productService.findProductsByUserId(id);
    }

    @GetMapping("/search/name/{name}")
    public Page<Product> findProductsByNameContaining(@PathVariable String name, Pageable pageable) {
        return productService.findProductsByNameContaining(name, pageable);
    }

    @GetMapping("/search/price/{price}")
    public Page<Product> findProductsByPriceLessThanEqual(@PathVariable Double price, Pageable pageable) {
        return productService.findProductsByPriceLessThanEqual(price, pageable);
    }

    @GetMapping("/search/category/{category}")
    public Page<Product> findProductsByCategoryName(@PathVariable String category, Pageable pageable) {
        return productService.findProductsByCategoryName(category, pageable);
    }
}