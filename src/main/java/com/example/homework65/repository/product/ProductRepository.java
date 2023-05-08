package com.example.homework65.repository.product;

import com.example.homework65.entity.Product;
import com.example.homework65.repository.common.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends BaseRepository<Product, Integer> {
    Product findByName(String name);
    Product findByNumber(Integer number);

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
    Page<Product> findByNameContaining(String name, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.price <= :price")
    Page<Product> findByPriceLessThanEqual(Double price, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.category LIKE %:category%")
    Page<Product> findByCategoryName(String category, Pageable pageable);

    @Query("SELECT DISTINCT p FROM User u JOIN u.bucket b JOIN b.product p WHERE u.id = :userId")
    List<Product> findProductsByUserId(@Param("userId") Long userId);

    @Query("SELECT DISTINCT p FROM User u JOIN u.bucket b JOIN b.product p WHERE u.email = :email")
    List<Product> findProductsByEmail(@Param("email") String email);

}
