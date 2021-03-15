package com.rsky.retailer.customer;

import java.util.Optional;

import com.rsky.retailer.order.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer , Long>{

     Optional<Customer> findById(Long id);

     // @Modifying
     // @Query(value = "Select orderHistory from customer where id = ?1")
     // Optional<Order> findByOrders(Long customerId);
}