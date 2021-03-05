package com.rsky.retailer.order;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderServices;

    @GetMapping(value = "/orders")
    public List<Order> getAllOrders(){
        return orderServices.getAllOrders();
    }

    //by custId
    //@GetMapping(value = "/orders/{}")

    @PostMapping(value = "/orders/addOrder")
    public void addOrder(@RequestBody Order order){
        orderServices.saveOrder(order);
    }
}
