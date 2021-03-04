package com.rsky.retailer.customer;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CustomerController {
    
    @Autowired
    CustomerRepo customerRepo;

    @GetMapping(value="/customers")
    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }
    
    @GetMapping(value = "/customers/{id}")
    public Optional<Customer> findUserById(@PathVariable(name = "id") Long customerId){
        return customerRepo.findById(customerId);
    }

    @PostMapping(value="/addCustomer")
    public Customer addUser(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return customer;
    }

    @DeleteMapping(value="/deleteCustomer/{id}")
    public void deleCustomer(@PathVariable(name = "id") Long customerId){
        customerRepo.deleteById(customerId);
    }
}
