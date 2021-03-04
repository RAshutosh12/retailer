package com.rsky.retailer.customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer , Long>{

     Optional<Customer> findById(Long id);
}