package com.rsky.retailer.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Long>{
    
    List<Product> findByProductName(String productName);
}
