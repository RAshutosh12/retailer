package com.rsky.retailer.order;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepo orderRepo;

    public List<Order> getAllOrders(){

        return orderRepo.findAll();
    }

    public void saveOrder(Order order){
        orderRepo.save(order);
    }



}
